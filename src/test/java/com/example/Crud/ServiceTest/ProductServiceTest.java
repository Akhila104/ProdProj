package com.example.Crud.ServiceTest;

import com.example.Crud.Main.Product;
import com.example.Crud.Repository.ProductRepository;
import com.example.Crud.Service.ProductService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;


public class ProductServiceTest {
    @InjectMocks
    ProductService productService;
    @Mock
    ProductRepository productRepository;

    @BeforeEach
    public void init() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testFindAllEmployees() {
        List<Product> list = new ArrayList<Product>();
        Product prod1 = new Product(1, "samsung", 2, 20000);
        Product prod2 = new Product(2, "apple", 1, 50000);
        Product prod3 = new Product(3, "oneplus", 1, 40000);

        list.add(prod1);
        list.add(prod2);
        list.add(prod3);

        when(productRepository.findAll()).thenReturn(list);

        List<Product> proList = productRepository.findAll();

        assertEquals(3, proList.size());
        verify(productRepository, times(1)).findAll();
    }

    @Test
    void testCreateOrSaveEmployee() {
        Product product = new Product();

        productService.save(product);

        verify(productRepository, times(1)).save(product);
    }
}
