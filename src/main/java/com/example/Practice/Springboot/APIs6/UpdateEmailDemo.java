package com.example.Practice.Springboot.APIs6;

public class UpdateEmailDemo {

    public static void main(String[] args) {

        String currentEmail = "ahmed@example.com ";
        String newEmail = "ahmed@example.com ";
        boolean updateStatus = false;

        System.out.println("Original email : "+ currentEmail);

        if(currentEmail.equalsIgnoreCase(newEmail)){
            System.out.println("No update required. Email address is already current");
        }else{
            currentEmail = newEmail;
            updateStatus = true;
            System.out.println("Email updated successfully");
        }

        System.out.println("Final Email: " + currentEmail);
        System.out.println("update status : " +updateStatus );

    }

}
