# Shared Milestones (M1–M3)

Rules are mandatory and cumulative. README section 5 is authoritative. Testing is part of each milestone; the AQA guide is complementary, not an alternative that skips implementation.

## M1 — Domain and invariants

**Branch:** `feature/m1-domain`

**Goal:** Validate members and books; Use deterministic dates.

**You will practise:** Spring IoC and auto-configuration, MVC REST, Bean Validation, JPA mappings, PostgreSQL, Flyway, transactions, pagination, test slices, Testcontainers, Actuator.

| Done | Rule | What to implement |
| --- | --- | --- |
| [ ] | BR-101 | Validate members and books — "  Ada  " becomes "Ada"; " ADA@EXAMPLE.COM " becomes "ada@example.com"; 101-character name and 12-digit ISBN fail. |
| [ ] | BR-102 | Use deterministic dates — Borrow 2028-02-20 → due 2028-03-05. On March 5 it is not overdue; on March 6 it is. |

**Files:** consult [Starter Map](STARTER_MAP.md); add focused classes, DTOs, entities and adapters as needed. Test file: `src/test/java/com/learning/shelfflow/acceptance/M1DomainTest.java`.

**Required tests:** both rule examples, at least one boundary and one failure/rollback scenario from [Acceptance Tests](ACCEPTANCE_TESTS.md).

**Done when:** these tests and every earlier milestone pass; `docs/evidence/M1.md` contains reproducible evidence and an explanation of the invariant.

**Trap:** implementing only the HTTP happy path, or checking a rule in Java while leaving the database race unprotected.

## M2 — Database and persistence

**Branch:** `feature/m2-database`

**Goal:** Persist relationships and constraints; Make queries bounded.

**You will practise:** Spring IoC and auto-configuration, MVC REST, Bean Validation, JPA mappings, PostgreSQL, Flyway, transactions, pagination, test slices, Testcontainers, Actuator.

| Done | Rule | What to implement |
| --- | --- | --- |
| [ ] | BR-201 | Persist relationships and constraints — Two concurrent SQL inserts for an active loan on the same copy cannot both commit; orphan copy/member foreign keys fail. |
| [ ] | BR-202 | Make queries bounded — A page of 20 books does not issue 21 author queries. Capture SQL counts and EXPLAIN ANALYZE for a catalog of 10,000 books. |

**Files:** consult [Starter Map](STARTER_MAP.md); add focused classes, DTOs, entities and adapters as needed. Test file: `src/test/java/com/learning/shelfflow/acceptance/M2AcceptanceTest.java`.

**Required tests:** both rule examples, at least one boundary and one failure/rollback scenario from [Acceptance Tests](ACCEPTANCE_TESTS.md).

**Done when:** these tests and every earlier milestone pass; `docs/evidence/M2.md` contains reproducible evidence and an explanation of the invariant.

**Trap:** implementing only the HTTP happy path, or checking a rule in Java while leaving the database race unprotected.

## M3 — Transactional use cases

**Branch:** `feature/m3-transactions`

**Goal:** Borrow atomically; Return without duplicate effects.

**You will practise:** Spring IoC and auto-configuration, MVC REST, Bean Validation, JPA mappings, PostgreSQL, Flyway, transactions, pagination, test slices, Testcontainers, Actuator.

| Done | Rule | What to implement |
| --- | --- | --- |
| [ ] | BR-301 | Borrow atomically — With four active loans and two simultaneous borrow attempts, exactly one succeeds. A forced exception after loan insertion leaves no loan or copy change. |
| [ ] | BR-302 | Return without duplicate effects — Repeat tomorrow: the first returnedOn is unchanged; no extra notification record or availability increment appears. |

**Files:** consult [Starter Map](STARTER_MAP.md); add focused classes, DTOs, entities and adapters as needed. Test file: `src/test/java/com/learning/shelfflow/acceptance/M3AcceptanceTest.java`.

**Required tests:** both rule examples, at least one boundary and one failure/rollback scenario from [Acceptance Tests](ACCEPTANCE_TESTS.md).

**Done when:** these tests and every earlier milestone pass; `docs/evidence/M3.md` contains reproducible evidence and an explanation of the invariant.

**Trap:** implementing only the HTTP happy path, or checking a rule in Java while leaving the database race unprotected.
