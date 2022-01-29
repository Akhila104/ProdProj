package com.example.Crud.RepositoryTest;


import com.example.Crud.Main.Product;
import com.example.Crud.Repository.ProductRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)

public class ProductRepositoryTest {
    @Autowired
    private ProductRepository productRepository;

    @Test
    public void testCreateReadDelete() {
        Product product = new Product(1, "apple", 2, 70000);
        productRepository.save(product);

        productRepository.deleteAll();
        Assertions.assertThat(productRepository.findAll()).isEmpty();
    }
}
