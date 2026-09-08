package dev.nvtruong.oop.model;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

public final class House {
    private final String houseCode;
    private final int numberOfBedrooms;
    private final boolean hasSwimmingPool;
    private final BigDecimal area;
    private final BigDecimal costPerSquareMeter;

    public House() {
        this("A01", 2, false, BigDecimal.ZERO, BigDecimal.ZERO);
    }

    public House(String houseCode, int numberOfBedrooms, boolean hasSwimmingPool,
                 BigDecimal area, BigDecimal costPerSquareMeter) {
        this.houseCode = Objects.requireNonNull(houseCode);
        if (houseCode.isBlank()) throw new IllegalArgumentException("houseCode must not be blank");
        if (numberOfBedrooms < 0) throw new IllegalArgumentException("bedrooms must be non-negative");
        if (area.signum() < 0 || costPerSquareMeter.signum() < 0)
            throw new IllegalArgumentException("area and cost must be non-negative");
        this.numberOfBedrooms = numberOfBedrooms;
        this.hasSwimmingPool = hasSwimmingPool;
        this.area = area;
        this.costPerSquareMeter = costPerSquareMeter;
    }

    public String houseCode() { return houseCode; }
    public int numberOfBedrooms() { return numberOfBedrooms; }
    public boolean hasSwimmingPool() { return hasSwimmingPool; }
    public BigDecimal area() { return area; }
    public BigDecimal costPerSquareMeter() { return costPerSquareMeter; }

    public BigDecimal subtotal() {
        BigDecimal base = area.multiply(costPerSquareMeter);
        return hasSwimmingPool ? base.multiply(new BigDecimal("1.10")) : base;
    }

    public BigDecimal sellingPrice() {
        return subtotal().multiply(new BigDecimal("1.15")).setScale(2, RoundingMode.HALF_UP);
    }

    @Override public String toString() {
        return "House[" + houseCode + "," + numberOfBedrooms + "," + hasSwimmingPool + "," + sellingPrice() + "]";
    }
}
