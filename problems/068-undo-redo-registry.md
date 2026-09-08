# OOP-068 — Undo / Redo Student Registry

**Difficulty:** Hard  
**Concepts:** Command/Memento thinking, transactional state, history

## Problem

Extend the AVL-backed student registry with undo and redo for add/remove operations, completing the original final coursework requirements.

## Requirements

- Successful add/remove operations create reversible history entries.
- `undo()` reverses the latest successful mutation.
- `redo()` reapplies the latest undone mutation.
- A new mutation after undo clears the redo branch.
- Search operations do not enter history.
- Failed mutations do not pollute history.

## Change pressure

Add `updateStudent` while keeping undo/redo extensible. Avoid a growing switch over operation types; represent reversible behavior as objects.
