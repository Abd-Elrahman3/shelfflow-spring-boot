# Database Requirements

## 1. Ownership and schema

PostgreSQL 16 is authoritative. Tables: members(id UUID PK,email VARCHAR(254) UNIQUE,display_name VARCHAR(100),joined_at TIMESTAMPTZ); books(id,isbn UNIQUE,title); book_authors(book_id FK,author, PK(book_id,author)); copies(id,book_id FK,status,version); loans(id,copy_id FK,member_id FK,borrowed_on DATE,due_on DATE,returned_on DATE NULL); reminders(id,loan_id FK,reminder_date DATE,status,attempts, UNIQUE(loan_id,reminder_date)). All unspecified business columns are NOT NULL. Check due_on>=borrowed_on and returned_on IS NULL OR returned_on>=borrowed_on. Add partial unique active-copy index and active-member lookup index. Model UUIDs in Java and SQL, not integer IDs disguised as UUIDs. Persist enums as strings. Provide ERD, forward migrations, a 10,000-book seed command and query-count evidence. A schema-only V1 placeholder is provided; you design the executable DDL.

## 2. Required artifacts

- ERD with cardinality, PK, FK, nullability and ownership.
- Versioned forward migrations for every constraint/index; no automatic schema update in final configuration.
- Seed fixtures for normal, duplicate, missing-reference and boundary cases.
- Explicit transaction isolation, lock order, timeout and retry policy.
- EXPLAIN (ANALYZE, BUFFERS) for the busiest query before and after an index; include row counts and hardware.
- Upgrade test from a prior schema fixture, not only create-from-empty.
- Backup/restore commands for a disposable destination and SQL integrity checks.

## 3. Testing rules

Run actual PostgreSQL semantics. Use separate connections/processes for concurrent transactions and deterministic barriers; bound all waits. A service-level existence check is not a uniqueness guarantee. If the app relies on a constraint, test direct SQL violating it. Explain any SELECT FOR UPDATE, SKIP LOCKED, RLS, serializable retry or projection checkpoint used here.

## 4. Migration discipline

An applied migration is immutable. Use expand/backfill/contract for incompatible changes, and state how old/new application versions coexist. Separate migration privileges from runtime privileges. Document retention and restore behavior for derived data, deduplication records and secrets. Do not ship real user data in fixtures.

See [Implementation Labs and Contract Details](IMPLEMENTATION_LABS.md) for concrete fixtures, payload semantics and boundary experiments. These are required, not optional extras.
