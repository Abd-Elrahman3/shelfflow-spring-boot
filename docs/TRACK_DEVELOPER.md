# Developer Track (D4–D7)

Rules are mandatory and cumulative. README section 5 is authoritative. Testing is part of each milestone; the AQA guide is complementary, not an alternative that skips implementation.

## D4 — API contracts and authorization

**Branch:** `feature/d4-api`

**Goal:** Expose a stable REST contract; Explain errors consistently.

**You will practise:** Spring IoC and auto-configuration, MVC REST, Bean Validation, JPA mappings, PostgreSQL, Flyway, transactions, pagination, test slices, Testcontainers, Actuator.

| Done | Rule | What to implement |
| --- | --- | --- |
| [ ] | BR-401 | Expose a stable REST contract — Client can register a member, create a book/copy, borrow and return using api/examples.http. |
| [ ] | BR-402 | Explain errors consistently — Duplicate normalized email → code MEMBER_EMAIL_EXISTS; missing member → MEMBER_NOT_FOUND; malformed UUID → 400. |

**Files:** consult [Starter Map](STARTER_MAP.md); add focused classes, DTOs, entities and adapters as needed. Test file: `src/test/java/com/learning/shelfflow/acceptance/D4AcceptanceTest.java`.

**Required tests:** both rule examples, at least one boundary and one failure/rollback scenario from [Acceptance Tests](ACCEPTANCE_TESTS.md).

**Done when:** these tests and every earlier milestone pass; `docs/evidence/D4.md` contains reproducible evidence and an explanation of the invariant.

**Trap:** implementing only the HTTP happy path, or checking a rule in Java while leaving the database race unprotected.

## D5 — Advanced behavior and resource limits

**Branch:** `feature/d5-advanced`

**Goal:** Calculate overdue fines; Schedule reminders safely.

**You will practise:** Spring IoC and auto-configuration, MVC REST, Bean Validation, JPA mappings, PostgreSQL, Flyway, transactions, pagination, test slices, Testcontainers, Actuator.

| Done | Rule | What to implement |
| --- | --- | --- |
| [ ] | BR-501 | Calculate overdue fines — 1 day → 0.50; 40 and 41 days → 20.00; due today → absent. |
| [ ] | BR-502 | Schedule reminders safely — Run scheduler twice on the same date and simulate a sender failure: one reminder intent exists and the next run can retry it. |

**Files:** consult [Starter Map](STARTER_MAP.md); add focused classes, DTOs, entities and adapters as needed. Test file: `src/test/java/com/learning/shelfflow/acceptance/D5AcceptanceTest.java`.

**Required tests:** both rule examples, at least one boundary and one failure/rollback scenario from [Acceptance Tests](ACCEPTANCE_TESTS.md).

**Done when:** these tests and every earlier milestone pass; `docs/evidence/D5.md` contains reproducible evidence and an explanation of the invariant.

**Trap:** implementing only the HTTP happy path, or checking a rule in Java while leaving the database race unprotected.

## D6 — Failure testing and recovery

**Branch:** `feature/d6-failures`

**Goal:** Test the real boundaries; Prove transaction behavior.

**You will practise:** Spring IoC and auto-configuration, MVC REST, Bean Validation, JPA mappings, PostgreSQL, Flyway, transactions, pagination, test slices, Testcontainers, Actuator.

| Done | Rule | What to implement |
| --- | --- | --- |
| [ ] | BR-601 | Test the real boundaries — A regression that removes the active-loan unique index or the five-loan guard makes a test fail. |
| [ ] | BR-602 | Prove transaction behavior — Save an SQL snapshot before/after an injected failure and a short explanation of the effective isolation level. |

**Files:** consult [Starter Map](STARTER_MAP.md); add focused classes, DTOs, entities and adapters as needed. Test file: `src/test/java/com/learning/shelfflow/acceptance/D6AcceptanceTest.java`.

**Required tests:** both rule examples, at least one boundary and one failure/rollback scenario from [Acceptance Tests](ACCEPTANCE_TESTS.md).

**Done when:** these tests and every earlier milestone pass; `docs/evidence/D6.md` contains reproducible evidence and an explanation of the invariant.

**Trap:** implementing only the HTTP happy path, or checking a rule in Java while leaving the database race unprotected.

## D7 — Operations and design defense

**Branch:** `feature/d7-operations`

**Goal:** Operate the application; Evolve and restore data.

**You will practise:** Spring IoC and auto-configuration, MVC REST, Bean Validation, JPA mappings, PostgreSQL, Flyway, transactions, pagination, test slices, Testcontainers, Actuator.

| Done | Rule | What to implement |
| --- | --- | --- |
| [ ] | BR-701 | Operate the application — Stop PostgreSQL, capture readiness 503 and liveness 200, restore DB and show recovery. |
| [ ] | BR-702 | Evolve and restore data — Submit migration output, restore checks, query-plan evidence and the D7 reflection; a fresh empty database alone is insufficient. |

**Files:** consult [Starter Map](STARTER_MAP.md); add focused classes, DTOs, entities and adapters as needed. Test file: `src/test/java/com/learning/shelfflow/acceptance/D7AcceptanceTest.java`.

**Required tests:** both rule examples, at least one boundary and one failure/rollback scenario from [Acceptance Tests](ACCEPTANCE_TESTS.md).

**Done when:** these tests and every earlier milestone pass; `docs/evidence/D7.md` contains reproducible evidence and an explanation of the invariant.

**Trap:** implementing only the HTTP happy path, or checking a rule in Java while leaving the database race unprotected.
