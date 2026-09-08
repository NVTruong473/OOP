# OOP-079 — Booking Service

**Difficulty:** Hard  
**Concepts:** temporal invariants, aggregate consistency, lifecycle state

## Problem

Manage confirmed/cancelled bookings for resources over half-open time intervals `[start, end)`.

## Requirements

- Start must be before end.
- Two confirmed bookings for the same resource may not overlap.
- Adjacent intervals are allowed.
- Cancelled bookings no longer block future reservations.
- Cancellation is idempotence-aware and cannot silently mutate unrelated bookings.

## Change pressure

Add tentative holds that expire. Keep overlap logic centralized so confirmed bookings and holds cannot drift into different definitions of conflict.
