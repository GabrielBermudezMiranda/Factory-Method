package com.example.factory;

public abstract class Logistics {
    // Factory Method
    protected abstract Transport createTransport();

    // Business logic that uses the product
    public String planDelivery(String cargo) {
        Transport transport = createTransport();
        return transport.deliver(cargo);
    }
}
