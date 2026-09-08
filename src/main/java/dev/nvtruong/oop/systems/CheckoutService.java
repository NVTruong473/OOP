package dev.nvtruong.oop.systems;

import java.math.BigDecimal;
import java.util.Objects;

public final class CheckoutService {
    public interface PaymentMethod {
        PaymentResult pay(BigDecimal amount);
    }

    public record PaymentResult(boolean successful, String reference) {}

    public static final class Wallet implements PaymentMethod {
        private BigDecimal balance;

        public Wallet(BigDecimal balance) {
            if (balance.signum() < 0) throw new IllegalArgumentException("balance must be non-negative");
            this.balance = balance;
        }

        public BigDecimal balance() { return balance; }

        @Override public PaymentResult pay(BigDecimal amount) {
            validateAmount(amount);
            if (balance.compareTo(amount) < 0) return new PaymentResult(false, "INSUFFICIENT_FUNDS");
            balance = balance.subtract(amount);
            return new PaymentResult(true, "WALLET-" + System.nanoTime());
        }
    }

    public record Order(String id, BigDecimal subtotal) {
        public Order {
            Objects.requireNonNull(id);
            Objects.requireNonNull(subtotal);
            validateAmount(subtotal);
        }
    }

    public PaymentResult checkout(Order order, PaymentMethod paymentMethod) {
        Objects.requireNonNull(order);
        Objects.requireNonNull(paymentMethod);
        return paymentMethod.pay(order.subtotal());
    }

    private static void validateAmount(BigDecimal amount) {
        Objects.requireNonNull(amount);
        if (amount.signum() < 0) throw new IllegalArgumentException("amount must be non-negative");
    }
}
