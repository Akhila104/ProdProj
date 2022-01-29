package com.example.Crud.ControllerTest;

import com.example.Crud.Controller.ProductController;
import com.example.Crud.Main.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class ProductControllerTest {
    @Autowired
    ProductController productController;

    @Test
    public void testCreateReadDelete() {
        Product product = new Product(1, "apple", 1, 1000);

        Product productResult = productController.create(product);


        productController.delete(productResult.getId());

    }

}
