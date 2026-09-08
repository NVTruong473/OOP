# OOP — 80 Solved Object-Oriented Programming Challenges

A Java 21 practice repository rebuilt from my university OOP coursework into a **LeetCode-style
progression for object-oriented design**.

This is intentionally not a folder of `Lab01`, `Lab02`, ... submissions anymore. The original exercises
were audited, re-solved, tested, and reorganized by the skill they exercise. Their original semantic
names such as `Point2D`, `Rectangle`, `Student`, `House`, `Circle`, `Cylinder`, `Person`, `Staff`,
`Employee`, `Manager`, `Car`, and `LuxuryCar` are preserved.

> **Goal:** show progression from basic Java exercises to object modeling, inheritance/polymorphism,
> file boundaries, SOLID-oriented design, design patterns, stateful mini-systems, and a completed
> AVL-backed student registry with undo/redo.

## Snapshot

- **80 solved challenges**
- **Java 21**
- **Maven**
- **JUnit 5**
- **GitHub Actions CI**
- Original coursework migrated from ZIP-only submissions into searchable source
- Easy → Medium → Hard progression
- Advanced topics: Strategy, Observer/Event Bus, Specification, Repository, State, Command-style
  undo/redo, aggregates and invariants

## Progression

| Stage | Focus | Representative challenges |
|---|---|---|
| 1 | Java foundations kept from the original course | arrays, matrices, strings, validation |
| 2 | Classes & value objects | `Point2D`, `Rectangle`, `Student`, `House`, `Fraction` |
| 3 | Inheritance & polymorphism | `Circle → Cylinder`, `Person → Student/Staff`, `Shape`, `LuxuryCar` |
| 4 | Boundaries | calculator exceptions, text files, student repository, filesystem operations |
| 5 | Stateful object design | `VendingMachine`, `Library`, `ParkingLot`, `BookingService` |
| 6 | Extensible design | checkout Strategy, Event Bus, Discount policies, Specification, Repository |
| 7 | Hard capstone | AVL student registry + add/search/delete + balancing + undo/redo + score ordering |

See the complete table in **[`docs/PROBLEM_SET.md`](docs/PROBLEM_SET.md)**.

## Repository layout

```text
.
├── src/main/java/dev/nvtruong/oop/
│   ├── fundamentals/     # legacy fundamentals, rewritten as pure/testable functions
│   ├── model/            # value objects and aggregates
│   ├── inheritance/      # inheritance/polymorphism exercises
│   ├── io/               # filesystem and repository boundaries
│   ├── avl/              # completed final AVL / StudentManagement exercise
│   ├── systems/          # advanced object-modeling challenges
│   └── patterns/         # reusable design-pattern challenges
├── src/test/java/        # JUnit regression and design-behavior tests
├── docs/
│   ├── PROBLEM_SET.md
│   ├── LEGACY_MIGRATION.md
│   └── ARCHITECTURE.md
├── .github/workflows/ci.yml
└── pom.xml
```

## How to run

Requires JDK 21 and Maven.

```bash
mvn test
```

To compile without running tests:

```bash
mvn -DskipTests package
```

## What changed from the old repository

The old repository was primarily a set of ZIP submissions. That structure made it hard for GitHub,
reviewers, recruiters, or code-search tools to inspect the work. During migration the archives were
extracted and audited. The rebuilt branch then removes those binary ZIPs from the working tree and keeps
their names in the migration map and Git history.

Several legacy solutions also mixed console I/O, calculations and domain rules in the same method.
The rewrite separates those responsibilities. For example:

- the original vending machine was a `while + switch + Scanner` routine; the new `VendingMachine`
  encapsulates inventory, credit and lifecycle state;
- the original `House.calculateSellingPrice()` formula was incorrect; the new `House` models subtotal,
  swimming-pool surcharge and tax explicitly with `BigDecimal`;
- several original string methods attempted to mutate immutable Java `String` objects; the new
  `StringChallenges` returns transformed values;
- the final AVL/student-management archive contained placeholder methods; the new `StudentAvlTree` and
  `StudentRegistry` implement balancing, search/delete, history and score ordering.

See **[`docs/LEGACY_MIGRATION.md`](docs/LEGACY_MIGRATION.md)** for the audit.

## What counts as an OOP challenge here?

Not every original exercise is genuinely OOP. Array maximum or factorial are retained because they
document the starting point, but the later problems carry most of the portfolio signal.

A strong solution in this repo should answer questions such as:

- What invariant does this object protect?
- Which behavior belongs inside the object?
- Can a new implementation be added without editing a large `switch`?
- Is inheritance actually substitutable, or should this be composition?
- Can the design absorb a new payment method, notification channel, rule or state transition?
- Can behavior be verified without console input/output?
- Does undo/redo restore domain state correctly?
- Does the data structure preserve its balance invariant after mutation?

That is the standard used for the Hard section.

## Legacy name preservation

The repository name remains **`OOP`**. Exercise/class names that carry meaning are preserved in the
new design, while `LabXX` folder names are replaced by concept-based packages. The exact old-to-new map
is documented rather than hidden.

---

This repository is a learning portfolio: the point is not to maximize class count, but to make design
decisions visible, testable and progressively harder.
