package com.example.Crud.Service;

import com.example.Crud.Main.Product;
import com.example.Crud.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    ProductRepository repository;

    public Product save(Product product)
    {
        product=repository.save(product);
        return product;
    }
    public List<Product> findAll() {
        List<Product> products = (List<Product>) repository.findAll();
        repository.findAll();
        return products;
    }
    public void deleteById(Integer id) {
        Optional<Product> product = repository.findById(id);
    }
        public String  deleteAll() {
        repository.deleteAll();
            return "deleted"
    }
}
