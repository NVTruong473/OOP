# OOP-048 — House Pricing

**Difficulty:** Medium  
**Concepts:** immutable value object, monetary arithmetic, invariants

## Problem

Implement the original `House` exercise correctly. A house has a code, bedroom count, pool flag, area, and cost per square meter.

## Pricing rule

1. `base = area × costPerSquareMeter`
2. If a pool exists, add 10% of `base`.
3. Add 15% tax to that subtotal.

For area `100` and cost `2,500,000`, a house with a pool has subtotal `275,000,000` and selling price `316,250,000`.

## Requirements

- Use `BigDecimal` for money.
- Reject invalid negative dimensions/prices.
- Do not expose mutable monetary state.
- Keep pricing logic deterministic and independently testable.

## Change pressure

Replace the fixed tax/pool percentages with pricing policies without rewriting the `House` data model.
