package dev.nvtruong.oop.patterns;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

public final class DiscountEngine {
    @FunctionalInterface
    public interface DiscountPolicy {
        BigDecimal discount(BigDecimal subtotal);
    }

    private final List<DiscountPolicy> policies;

    public DiscountEngine(List<DiscountPolicy> policies) {
        this.policies = List.copyOf(policies);
    }

    public BigDecimal finalPrice(BigDecimal subtotal) {
        Objects.requireNonNull(subtotal);
        if (subtotal.signum() < 0) throw new IllegalArgumentException("subtotal must be non-negative");
        BigDecimal discount = policies.stream()
                .map(p -> p.discount(subtotal))
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        if (discount.signum() < 0) throw new IllegalStateException("discount cannot be negative");
        return subtotal.subtract(discount.min(subtotal));
    }

    public static DiscountPolicy percentage(String decimalRate) {
        BigDecimal rate = new BigDecimal(decimalRate);
        if (rate.signum() < 0 || rate.compareTo(BigDecimal.ONE) > 0)
            throw new IllegalArgumentException("rate must be in [0,1]");
        return subtotal -> subtotal.multiply(rate);
    }
}
