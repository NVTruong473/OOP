# OOP-072 — Library Lending

**Difficulty:** Hard  
**Concepts:** aggregate design, domain invariants, identity

## Problem

Model books, members, and loans in a small library aggregate.

## Requirements

- A book can have at most one active loan.
- A member cannot return a book they did not borrow.
- Borrow/return operations preserve availability consistently.
- Domain IDs are distinct from display names/titles.
- Clients cannot directly mutate the active-loan collection.

## Change pressure

Introduce a borrowing limit per member and overdue fines. Keep these policies separate from low-level collection manipulation.
