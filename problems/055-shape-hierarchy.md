# OOP-055 — Shape Hierarchy

**Difficulty:** Medium  
**Concepts:** abstraction, polymorphism, LSP, inheritance

## Problem

Represent shapes through a common abstraction while allowing each concrete shape to calculate its own area and perimeter.

## Requirements

- `CircleShape` and `RectangleShape` satisfy the same `Shape` contract.
- `Square` specializes rectangle behavior without violating rectangle invariants.
- Clients aggregate `Shape` objects without `instanceof` branches for area/perimeter.
- Dimensions must remain valid after construction.

## Change pressure

Add a triangle. Existing aggregation code must not change. Explain why inheritance is appropriate here but composition is preferable for the `Point2D` → `Point3D` exercise in this repository.
