package com.example.factory;

public class Main {
    public static void main(String[] args) {
        Logistics logistics = chooseLogistics(args);
        String result = logistics.planDelivery("Books");
        System.out.println(result);
    }

    private static Logistics chooseLogistics(String[] args) {
        String mode = (args.length > 0) ? args[0].toLowerCase() : "road";
        return switch (mode) {
            case "sea" -> new SeaLogistics();
            case "road" -> new RoadLogistics();
            default -> throw new IllegalArgumentException("Unknown mode: " + mode + ". Use 'road' or 'sea'.");
        };
    }
}
