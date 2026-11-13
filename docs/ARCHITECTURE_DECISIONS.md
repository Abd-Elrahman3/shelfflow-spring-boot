# Architecture Decision Requirements

Create at least five ADRs as you implement. Each must include context, decision, alternatives, tradeoff, failure mode and verification evidence. Start with:

1. Application/service boundaries for ShelfFlow; why a modular monolith or separate services fits this stage.
2. Database constraints, isolation and lock/transaction strategy.
3. API protocol and compatibility policy.
4. Idempotency, timeouts, retry and recovery strategy.
5. Security trust boundaries, operational limits and data retention.

Add decisions for Spring IoC and auto-configuration, MVC REST, Bean Validation, JPA mappings, PostgreSQL, Flyway, transactions, pagination, test slices, Testcontainers, Actuator. Diagrams must show data ownership and synchronous versus asynchronous calls. Never justify a choice only because a library is popular.

## ADR template

Title / Status / Context / Decision / Alternatives considered / Consequences / Failure scenario / Verification command and result.
