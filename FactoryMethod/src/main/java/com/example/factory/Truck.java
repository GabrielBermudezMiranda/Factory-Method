package com.example.factory;

public class Truck implements Transport {
    @Override
    public String deliver(String cargo) {
        return "Truck delivered '" + cargo + "' by road";
    }
}
