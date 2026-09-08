# OOP-070 — Checkout Strategy

**Difficulty:** Hard  
**Concepts:** Strategy, dependency inversion, value objects

## Problem

Build checkout logic that can charge an order using interchangeable payment methods.

## Requirements

- Checkout depends on a `PaymentMethod` abstraction, not a concrete wallet/card implementation.
- Orders calculate their own total from line items.
- Payment returns an explicit result instead of printing or throwing for normal business rejection.
- A failed payment must not masquerade as a successful order.

## Change pressure

Add bank transfer and a fake payment method for tests without modifying `CheckoutService`. Then add retry outside the payment implementations.
