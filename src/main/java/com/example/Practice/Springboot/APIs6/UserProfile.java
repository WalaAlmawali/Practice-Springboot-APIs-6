package com.example.Practice.Springboot.APIs6;

public class UserProfile {

    private int userId;
    private String phoneNumber;
    private String address;

    // Constructor

    public UserProfile(int userId, String phoneNumber, String address) {
        this.userId = userId;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    // Getter

    public int getUserId() {
        return userId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    // Setter

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    // main method

    public static void main(String[] args) {

        UserProfile userProfile = new UserProfile(100, "98879888", "Muscat");
        System.out.println("Original user profile information");
        System.out.println("ID: " + userProfile.getUserId());
        System.out.println("Phone: " + userProfile.getPhoneNumber());
        System.out.println("Address: " + userProfile.getAddress());

        userProfile.setPhoneNumber("98710888");
        userProfile.setAddress("Salalah");

        System.out.println("Updated user profile information");
        System.out.println("ID: " + userProfile.getUserId());
        System.out.println("Phone: " + userProfile.getPhoneNumber());
        System.out.println("Address: " + userProfile.getAddress());


    }

}
