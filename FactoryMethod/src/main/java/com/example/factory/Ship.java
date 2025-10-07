package com.example.factory;

public class Ship implements Transport {
    @Override
    public String deliver(String cargo) {
        return "Ship delivered '" + cargo + "' by sea";
    }
}
