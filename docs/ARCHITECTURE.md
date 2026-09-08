# Architecture and learning progression

The project is deliberately split into five layers of practice.

1. **Fundamentals** — pure functions and edge-case contracts. These are retained because they were part
   of the original coursework, but they are not presented as evidence of advanced OOP.
2. **Object modeling** — value objects and aggregates with invariants (`House`, `Fraction`, `Club`).
3. **Inheritance and polymorphism** — classic coursework rewritten with explicit contracts and, where
   inheritance is not needed, composition instead.
4. **Infrastructure boundaries** — file I/O behind small services/repositories rather than mixed into
   console programs.
5. **Design challenges** — stateful systems, Strategy/Observer/Specification/Repository/Command-style
   history, and the completed AVL student registry.

## Design rules

- Domain methods return values instead of printing them.
- Constructors establish invariants; invalid objects are not allowed to exist.
- Money uses `BigDecimal` where exact decimal behavior matters.
- Mutable state is encapsulated behind behavior-oriented methods.
- Inheritance is used only for true substitutability; composition is preferred otherwise.
- Every behavior with meaningful branching has tests.
- Advanced challenges include a **change pressure**: adding a payment method, notification channel,
  rule, discount, state transition, or repository query should not require rewriting the core service.

## Why this is stronger than "many classes"

A large OOP repository can still be weak if it is mostly getters/setters. The difficult evidence here is
whether the model survives requirement changes without cascading edits. The later challenges are
therefore judged by invariants, substitutability, dependency direction, composition and tests—not by
class count.
