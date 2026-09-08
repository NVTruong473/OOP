# Legacy migration map

This repository originally stored coursework as ZIP submissions (`Lab01.zip`, `Lab02.zip`, `Lab03.zip`,
`Lab04.zip`, `Lab06.zip`, `Lab09.zip`, review/demo archives, and exam archives). During the rebuild,
the archives were extracted on a temporary migration branch and audited before the public-facing
structure was rewritten.

## What was found

- **Lab01** — 14 introductory programming exercises plus factorial; the vending-machine exercise was
  a long `switch`-based console method.
- **Lab02** — ten array/`BigDecimal` exercises.
- **Lab03** — array mutation, matrices, name processing, strings, palindrome and word frequency.
- **Lab04** — `Point`, `Rectangle`, `Student`, `House`, constructors, accessors and method overloading.
- **Demo / Lab05 material** — `Fraction`, `RegularPolygon`, `Club`, array and string processing examples.
- **Lab06** — inheritance/polymorphism exercises: `Circle/Cylinder`, `Person/Student/Staff`,
  `Point2D/Point3D`, `Shape/Circle/Rectangle/Square`, `Employee/Manager`.
- **Lab09** — calculator exception handling and file I/O (`UpperCaseFile`, student file output,
  file operations, integer summation).
- **KTQT2 / review material** — `Car/LuxuryCar` polymorphism and `Student/ITStudent/MathStudent`
  processing.
- **521H0324_OOP final exercise** — AVL-backed student management. Core methods in `AVL` and
  `StudentManagement` were placeholders (`insert`, `search`, `delete`, `addStudent`, `removeStudent`,
  `undo`, `redo`, `scoreTree`). The rebuild completes those ideas in `StudentAvlTree` and
  `StudentRegistry`.

## Mapping policy

The original **semantic names** are preserved (`Point2D`, `Rectangle`, `Student`, `House`, `Fraction`,
`RegularPolygon`, `Club`, `Circle`, `Cylinder`, `Person`, `Staff`, `Employee`, `Manager`, `Car`,
`LuxuryCar`, etc.). Lab numbers are intentionally not part of the new package structure because the
repository is now a progression by concept rather than a submission archive.

Original ZIPs remain recoverable from Git history. They are removed from the rebuilt tree so GitHub can
index, search and review the actual source code.
