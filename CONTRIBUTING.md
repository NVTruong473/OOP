# Adding a new OOP challenge

A challenge belongs here only when it tests an object-design decision, an invariant, a reusable
abstraction, or a meaningful refactor.

For each new challenge:

1. Add a row to `docs/PROBLEM_SET.md`.
2. State the problem, constraints and **change pressure**.
3. Keep public APIs small.
4. Add tests for normal behavior, edge cases and one likely future requirement.
5. Prefer composition unless inheritance provides real substitutability.
6. Do not add a class merely to make procedural code "look OOP".

Suggested difficulty:
- **Easy** — one object or one small contract.
- **Medium** — multiple collaborating objects or an extension point.
- **Hard** — state/history, multiple invariants, polymorphic collaboration, or a design that must absorb
  requirement changes.
