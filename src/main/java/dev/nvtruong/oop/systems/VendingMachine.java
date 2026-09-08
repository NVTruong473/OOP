package dev.nvtruong.oop.systems;

import java.util.EnumMap;
import java.util.Map;

/**
 * OOP upgrade of the original switch-based Lab01 vending machine.
 * Inventory, money and machine state are encapsulated and independently testable.
 */
public final class VendingMachine {
    public enum Product {
        COCA(200), PEPSI(200), SPRITE(200), SNACK(100);
        private final int priceCents;
        Product(int priceCents) { this.priceCents = priceCents; }
        public int priceCents() { return priceCents; }
    }

    public enum State { READY, SHUTDOWN }
    public record Purchase(Product product, int changeCents) {}

    private final Map<Product, Integer> stock = new EnumMap<>(Product.class);
    private int creditCents;
    private State state = State.READY;

    public VendingMachine() {
        for (Product product : Product.values()) stock.put(product, 0);
    }

    public State state() { return state; }
    public int creditCents() { return creditCents; }
    public int stockOf(Product product) { return stock.get(product); }

    public void restock(Product product, int amount) {
        requireRunning();
        if (amount <= 0) throw new IllegalArgumentException("amount must be positive");
        stock.merge(product, amount, Integer::sum);
    }

    public void insertMoney(int cents) {
        requireRunning();
        if (cents <= 0) throw new IllegalArgumentException("money must be positive");
        creditCents = Math.addExact(creditCents, cents);
    }

    public Purchase buy(Product product) {
        requireRunning();
        int available = stock.get(product);
        if (available <= 0) throw new IllegalStateException("product is sold out");
        if (creditCents < product.priceCents()) throw new IllegalStateException("insufficient credit");
        stock.put(product, available - 1);
        int change = creditCents - product.priceCents();
        creditCents = 0;
        return new Purchase(product, change);
    }

    public int refund() {
        int refund = creditCents;
        creditCents = 0;
        return refund;
    }

    public void shutdown() {
        refund();
        state = State.SHUTDOWN;
    }

    private void requireRunning() {
        if (state == State.SHUTDOWN) throw new IllegalStateException("machine is shut down");
    }
}
