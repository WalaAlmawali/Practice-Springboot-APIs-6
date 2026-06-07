package com.example.Practice.Springboot.APIs6;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class OrderController {

    private static HashMap<Integer, Order> orders = new HashMap<>();

    static {
        orders.put(1, new Order(11,"Oman","Pending"));
    }

    @PutMapping("/updateOrder/{orderId}")
    public String updateOrder(@PathVariable int orderId, @RequestParam String address, @RequestParam String status){
        Order order = orders.get(orderId);

        if(order == null){
            return "Order not found";
        }

        order.setOrderStatus(status);
        order.setShippingAddress(address);

        return "Order updated successfully\n" +
                "Order Id: "+ order.getOrderId()+"\n"+
                "Updated shipping address :"+ order.getShippingAddress()+"\n"+
                "Updated status : "+ order.getOrderStatus();
    }
}
