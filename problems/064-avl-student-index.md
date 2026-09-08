# OOP-064 — AVL Student Index

**Difficulty:** Hard  
**Concepts:** object invariants, recursive structure, encapsulation, balancing

## Problem

Complete the unfinished AVL-tree coursework and use it as an index of students keyed by ID.

## Requirements

- Insert, search, and delete by student ID.
- Duplicate IDs must not create duplicate nodes.
- Every mutation must preserve binary-search ordering.
- Every node must have balance factor in `[-1, 1]` after rebalancing.
- Support preorder and inorder traversal for verification.

## Change pressure

The tree later becomes an implementation detail of a student registry. Callers must not depend on rotations or node references. Design the public API so the data structure can be replaced without rewriting domain clients.
