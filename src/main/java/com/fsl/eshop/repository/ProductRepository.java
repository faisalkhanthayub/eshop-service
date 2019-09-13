package com.fsl.eshop.repository;

import com.fsl.eshop.model.Product;
import com.fsl.eshop.model.Store;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepository extends CrudRepository<Product, String> {

    List<Product> findProductByStore(Store store);
}
