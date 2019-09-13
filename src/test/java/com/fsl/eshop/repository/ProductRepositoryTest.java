package com.fsl.eshop.repository;

import com.fsl.eshop.config.CassandraConfiguration;
import com.fsl.eshop.model.Product;
import com.fsl.eshop.model.Store;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@ExtendWith(SpringExtension.class)
public class ProductRepositoryTest {

    @Autowired
    ProductRepository productRepository;

    @Test
    public void test(){
        Product savedProduct = productRepository.save(Product.builder().store(Store.builder().id("1").build()).build());
        List<Product> products = productRepository.findProductByStore(Store.builder().id("1").build());
        Assertions.assertThat(products).contains(savedProduct);
    }
}
