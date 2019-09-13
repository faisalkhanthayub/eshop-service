package com.fsl.eshop.service;

import com.fsl.eshop.model.Product;
import com.fsl.eshop.model.Store;
import com.fsl.eshop.repository.ProductRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;
import java.util.UUID;

@Component
public class ProductService {

    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    public List<Product> findProductByStore(String storeId){
        return productRepository.findProductByStore(Store.builder().id(storeId).build());
    }

    public Product save(Product product){
        return isNewProduct(product) ? newProduct(product) : productRepository.save(product);
    }

    private Product newProduct(Product product) {
        return productRepository.save(product.toBuilder().id(UUID.randomUUID().toString()).build());
    }

    private boolean isNewProduct(Product product) {
        return Objects.isNull(product.getId());
    }

}
