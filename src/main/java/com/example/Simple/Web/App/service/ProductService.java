package com.example.Simple.Web.App.service;

import com.example.Simple.Web.App.model.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> products = new ArrayList<>( Arrays.asList(
            new Product(101, "Iphone", 5000),
            new Product(102, "Canon Camera", 34000),
            new Product(103, "Shure Mic", 10000)
    )
    );

    public List<Product> getProducts()
    {
        return products;
    }


    public Product getProductById(int prodId) {
        return products.stream()
                .filter(p->p.getProdId()==prodId)
                .findFirst().get();
    }

    public void addProduct(Product prod)
    {
        products.add(prod);
    }

    public void updateProduct(Product prod) {
        int index = -1;
        for(int i=0;i<products.size();i++)
        {
            if(products.get(i).getProdId()==prod.getProdId())
                index = i;
        }

        products.set(index,prod);
    }

    public void deleteProduct(int prodId) {
        int index = -1;
        for(int i=0;i<products.size();i++)
        {
            if(products.get(i).getProdId()==prodId)
                index = i;
        }

        if(index!=-1) products.remove(index);

    }
}


