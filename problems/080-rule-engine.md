# OOP-080 — Rule Engine

**Difficulty:** Hard  
**Concepts:** open/closed principle, composition, generics

## Problem

Create a generic rule engine that evaluates a value against independently reusable rules and reports violations.

## Requirements

- A `Rule<T>` encapsulates one business condition and its failure message.
- The engine evaluates any number of rules without knowing their concrete types.
- Passing values return no violations.
- Multiple failures are preserved rather than stopping at the first one.
- Rules are easy to unit test independently.

## Change pressure

Add severity, rule groups (`all`/`any`), and conditional rules without turning the engine into a type-switch. Prefer composition over inheritance depth.
