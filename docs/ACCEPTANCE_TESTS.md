# Acceptance Tests

Every row is mandatory. M1 includes provided examples in starters; later test skeletons must become real behavior tests. Test names below are descriptions, not a hidden API.

| Milestone | Rule | Scenario and expected result |
| --- | --- | --- |
| M1 | BR-101 | "  Ada  " becomes "Ada"; " ADA@EXAMPLE.COM " becomes "ada@example.com"; 101-character name and 12-digit ISBN fail. |
| M1 | BR-102 | Borrow 2028-02-20 → due 2028-03-05. On March 5 it is not overdue; on March 6 it is. |
| M2 | BR-201 | Two concurrent SQL inserts for an active loan on the same copy cannot both commit; orphan copy/member foreign keys fail. |
| M2 | BR-202 | A page of 20 books does not issue 21 author queries. Capture SQL counts and EXPLAIN ANALYZE for a catalog of 10,000 books. |
| M3 | BR-301 | With four active loans and two simultaneous borrow attempts, exactly one succeeds. A forced exception after loan insertion leaves no loan or copy change. |
| M3 | BR-302 | Repeat tomorrow: the first returnedOn is unchanged; no extra notification record or availability increment appears. |
| D4 | BR-401 | Client can register a member, create a book/copy, borrow and return using api/examples.http. |
| D4 | BR-402 | Duplicate normalized email → code MEMBER_EMAIL_EXISTS; missing member → MEMBER_NOT_FOUND; malformed UUID → 400. |
| D5 | BR-501 | 1 day → 0.50; 40 and 41 days → 20.00; due today → absent. |
| D5 | BR-502 | Run scheduler twice on the same date and simulate a sender failure: one reminder intent exists and the next run can retry it. |
| D6 | BR-601 | A regression that removes the active-loan unique index or the five-loan guard makes a test fail. |
| D6 | BR-602 | Save an SQL snapshot before/after an injected failure and a short explanation of the effective isolation level. |
| D7 | BR-701 | Stop PostgreSQL, capture readiness 503 and liveness 200, restore DB and show recovery. |
| D7 | BR-702 | Submit migration output, restore checks, query-plan evidence and the D7 reflection; a fresh empty database alone is insufficient. |

## Failure drills

1. Race two borrowers for one copy: exactly one loan commits.
2. Borrow with a deliberate failure between writes: inspect rollback.
3. Restore a backup and verify outstanding loans and foreign keys.

## Evidence standard

Record setup, exact command, controlled failure point, durable before/after state, expected result and actual result. A test that only asserts an exception or mocks all persistence cannot prove a database invariant. Use bounded timeouts and deterministic coordination; avoid sleeps as a race strategy. Record a seed for randomized tests. Do not turn an unavailable Docker dependency into a silently skipped passing test.

For D6, deliberately introduce one representative bug and verify a test detects it. For D7, record machine configuration, dataset, concurrency, p50/p95/p99, throughput, errors and resource usage. Restore tests use a different database from the source.
