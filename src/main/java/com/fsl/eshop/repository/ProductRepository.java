package com.fsl.eshop.repository;

import com.fsl.eshop.model.Product;
import com.fsl.eshop.model.Store;
import org.springframework.data.cassandra.repository.CassandraRepository;

import java.util.List;

public interface ProductRepository extends CassandraRepository<Product, String> {

    List<Product> findProductByStore(Store store);
}
