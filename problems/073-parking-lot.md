# OOP-073 — Parking Lot

**Difficulty:** Hard  
**Concepts:** object modeling, allocation policy, lifecycle

## Problem

Implement a parking lot that assigns compatible spots, issues tickets, and calculates a receipt when a vehicle exits.

## Requirements

- A spot can hold at most one active vehicle.
- Vehicle/spot compatibility is enforced by the model.
- Entry creates a ticket; exit releases exactly that ticket's spot.
- Billing rounds partial hours upward.
- Unknown/already-closed tickets are rejected safely.

## Change pressure

Support multiple allocation strategies (nearest spot, smallest compatible spot, EV preference) without rewriting ticket lifecycle logic.
