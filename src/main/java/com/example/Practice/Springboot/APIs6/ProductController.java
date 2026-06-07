package com.example.Practice.Springboot.APIs6;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class ProductController {

    private static HashMap<Integer, Product> products = new HashMap<>();

    static  {
        products.put(1, new Product(100, "Apple", 50));
        products.put(2, new Product(200, "Orange", 100));
    }


    @PutMapping("/updateStock/{id}")
    public String updateStock(@PathVariable int id , @RequestParam int quantity) {

        Product product = products.get(id);

        if(product == null){
            System.out.println("Product not found");
        }

        int oldStock = product.getStockQuantity();
        product.setStockQuantity(quantity);

        return "Product Updated successfully , the old stock quantity : "+ oldStock +" , the new quantity is "+product.getStockQuantity();
    }

}
