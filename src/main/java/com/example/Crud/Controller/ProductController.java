package com.example.Crud.Controller;

import com.example.Crud.Main.Product;
import com.example.Crud.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {
    @Autowired
    ProductService productService;

    @PostMapping("/product")
    public Product create(@RequestBody Product product)  {
        return productService.save(product);
    }
    @PutMapping("/product")
    public Product update(@RequestBody Product product) {
        return productService.save(product);
    }

    @GetMapping("/product")
    public Iterable<Product> read() {
        return productService.findAll();
    }
    @DeleteMapping("/product/{id}")
   public void delete(@PathVariable Integer id) {
       productService.deleteById(id);

    }

}
