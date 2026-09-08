package dev.nvtruong.oop.inheritance;

public final class LuxuryCar extends Car {
    private final double luxuryTaxRate;

    public LuxuryCar(String model, double basePrice, double luxuryTaxRate) {
        super(model, basePrice);
        if (luxuryTaxRate < 0) throw new IllegalArgumentException("tax rate must be non-negative");
        this.luxuryTaxRate = luxuryTaxRate;
    }

    @Override public double price() { return basePrice() * (1.0 + luxuryTaxRate); }
    @Override public String description() { return model() + " (Luxury)"; }
}
