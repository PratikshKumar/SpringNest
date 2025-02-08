// reponsible for accepting the request of the products.


package com.example.Simple.Web.App.controller;

import com.example.Simple.Web.App.model.Product;
import com.example.Simple.Web.App.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductControler {

    @Autowired
    ProductService service;

    @GetMapping("/products")
    public List<Product> getProducts()
    {
        return service.getProducts();
    }

    @GetMapping ("/products/{prodId}")
    public Product getProductById(@PathVariable int prodId)
    {
        return service.getProductById(prodId);
    }

    @PostMapping("/products")
    public void addProduct(@RequestBody Product prod)
    {
        service.addProduct(prod);
    }
}

// controller asks data from Service Layer.
//We should not wrute any buisness logic inside the Controller
