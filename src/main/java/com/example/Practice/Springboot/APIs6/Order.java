package com.example.Practice.Springboot.APIs6;

public class Order {

    private int orderId;
    private String shippingAddress;
    private String orderStatus;

    //Constructor

    public Order(int orderId, String shippingAddress, String orderStatus) {
        this.orderId = orderId;
        this.shippingAddress = shippingAddress;
        this.orderStatus = orderStatus;
    }

    // Getter

    public int getOrderId() {
        return orderId;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public String getOrderStatus() {
        return orderStatus;
    }
    // Setter

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }
}
