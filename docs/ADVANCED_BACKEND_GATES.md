# Advanced Backend Gates

CRUD alone does not complete this project. Every README rule is required, including the following demonstrations.

| Gate | Required demonstration |
| --- | --- |
| D5 | 1 day → 0.50; 40 and 41 days → 20.00; due today → absent. |
| D5 | Run scheduler twice on the same date and simulate a sender failure: one reminder intent exists and the next run can retry it. |
| D6 | A regression that removes the active-loan unique index or the five-loan guard makes a test fail. |
| D6 | Save an SQL snapshot before/after an injected failure and a short explanation of the effective isolation level. |
| D7 | Stop PostgreSQL, capture readiness 503 and liveness 200, restore DB and show recovery. |
| D7 | Submit migration output, restore checks, query-plan evidence and the D7 reflection; a fresh empty database alone is insufficient. |

## Explain before advancing

1. Which invariant belongs in the domain, database, transport and worker respectively?
2. Where is the transaction boundary, and what happens if the process dies immediately after commit?
3. Which operations can safely retry, and how are duplicates or uncertain results resolved?
4. What is bounded: threads, connections, queues, buffers, retries and query sizes?
5. How is authorization enforced below the controller and across caches/messages?
6. Which metric tells you this system is failing before users report it?
7. How do you restore data and prove correctness after recovery?

Project-specific concepts to defend: Spring IoC and auto-configuration, MVC REST, Bean Validation, JPA mappings, PostgreSQL, Flyway, transactions, pagination, test slices, Testcontainers, Actuator.

Record commands and results in evidence files. An owner can alter CI; the gates are an honest learning contract, not tamper-proof certification. Mark incomplete behavior openly.
