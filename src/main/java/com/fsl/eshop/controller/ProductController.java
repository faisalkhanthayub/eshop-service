package com.fsl.eshop.controller;

import com.fsl.eshop.model.Product;
import com.fsl.eshop.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/api/products")
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService){
        this.productService = productService;
    }

    @RequestMapping("/{storeId}")
    public List<Product> findProductsByStoreId(@PathVariable String storeId){
        return productService.findProductByStore(storeId);
    }

    @PostMapping("/save")
    public Product saveProduct(@RequestBody Product product){
        return productService.save(product);
    }
}
