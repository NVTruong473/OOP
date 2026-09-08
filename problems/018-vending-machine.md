# OOP-018 — Vending Machine

**Difficulty:** Medium  
**Concepts:** encapsulation, state, invariants, value flow

## Problem

Model a vending machine that sells a fixed catalog of products. Clients may insert money, purchase a product, request a refund, restock inventory, and shut the machine down.

## Requirements

- Money and inventory are internal state; callers cannot mutate them directly.
- A purchase succeeds only when the machine is running, the product is in stock, and credit covers the price.
- A successful purchase atomically decrements stock and credit.
- A failed purchase must not partially mutate state.
- `refund()` returns all remaining credit and resets it to zero.
- Negative money or stock adjustments are invalid.

## Change pressure

Add a new product without editing a switch statement. Then add a maintenance mode in which restocking is allowed but purchases are not. A strong design should localize these changes.
