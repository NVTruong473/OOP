package dev.nvtruong.oop.inheritance;

public class Car {
    private final String model;
    private final double basePrice;

    public Car(String model, double basePrice) {
        if (model == null || model.isBlank()) throw new IllegalArgumentException("model must not be blank");
        if (basePrice < 0) throw new IllegalArgumentException("basePrice must be non-negative");
        this.model = model;
        this.basePrice = basePrice;
    }

    public String model() { return model; }
    protected double basePrice() { return basePrice; }
    public double price() { return basePrice; }
    public String description() { return model; }
}
