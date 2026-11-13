# Starter File Map

These are intentionally unfinished building blocks, not a complete solution. Add missing DTOs, entity mappings, repository queries, configuration and tests as specified. No business endpoint is provided complete.

| File | Purpose |
| --- | --- |
| src/main/java/com/learning/shelfflow/ShelfFlowApplication.java | Boot/Clock/exception infrastructure or security placeholder |
| src/main/java/com/learning/shelfflow/advanced/HealthDiagnostics.java | Unfinished learner code; see rule IDs in Javadoc |
| src/main/java/com/learning/shelfflow/advanced/ReminderJob.java | Unfinished learner code; see rule IDs in Javadoc |
| src/main/java/com/learning/shelfflow/api/ApiExceptionHandler.java | Unfinished learner code; see rule IDs in Javadoc |
| src/main/java/com/learning/shelfflow/api/ShelfFlowController.java | Unfinished learner code; see rule IDs in Javadoc |
| src/main/java/com/learning/shelfflow/config/TimeConfig.java | Boot/Clock/exception infrastructure or security placeholder |
| src/main/java/com/learning/shelfflow/domain/Book.java | Unfinished learner code; see rule IDs in Javadoc |
| src/main/java/com/learning/shelfflow/domain/BookCopy.java | Unfinished learner code; see rule IDs in Javadoc |
| src/main/java/com/learning/shelfflow/domain/CopyStatus.java | Unfinished learner code; see rule IDs in Javadoc |
| src/main/java/com/learning/shelfflow/domain/Loan.java | Unfinished learner code; see rule IDs in Javadoc |
| src/main/java/com/learning/shelfflow/domain/Member.java | Unfinished learner code; see rule IDs in Javadoc |
| src/main/java/com/learning/shelfflow/exception/ConflictException.java | Boot/Clock/exception infrastructure or security placeholder |
| src/main/java/com/learning/shelfflow/exception/NotFoundException.java | Boot/Clock/exception infrastructure or security placeholder |
| src/main/java/com/learning/shelfflow/persistence/MemberEntity.java | Unfinished learner code; see rule IDs in Javadoc |
| src/main/java/com/learning/shelfflow/repository/PostgresShelfFlowRepository.java | Unfinished learner code; see rule IDs in Javadoc |
| src/main/java/com/learning/shelfflow/repository/ShelfFlowRepository.java | Unfinished learner code; see rule IDs in Javadoc |
| src/main/java/com/learning/shelfflow/service/ShelfFlowService.java | Unfinished learner code; see rule IDs in Javadoc |
| src/test/java/com/learning/shelfflow/acceptance/D4AcceptanceTest.java | Behavioral examples / test exercise |
| src/test/java/com/learning/shelfflow/acceptance/D5AcceptanceTest.java | Behavioral examples / test exercise |
| src/test/java/com/learning/shelfflow/acceptance/D6AcceptanceTest.java | Behavioral examples / test exercise |
| src/test/java/com/learning/shelfflow/acceptance/D7AcceptanceTest.java | Behavioral examples / test exercise |
| src/test/java/com/learning/shelfflow/acceptance/M1DomainTest.java | Behavioral examples / test exercise |
| src/test/java/com/learning/shelfflow/acceptance/M2AcceptanceTest.java | Behavioral examples / test exercise |
| src/test/java/com/learning/shelfflow/acceptance/M3AcceptanceTest.java | Behavioral examples / test exercise |
| src/test/java/com/learning/shelfflow/structure/StarterStructureTest.java | Behavioral examples / test exercise |

Constructors use declared fields in README order. Implement validation and assignment before services. Repository ports describe the first core use cases; extend them as necessary. Advanced component methods are starting boundaries, not prescribed complete architecture. Keep provided behavioral constructor/method signatures while adding overloads or collaborators.

## Typed transport exercises

- `src/main/java/com/learning/shelfflow/api/BusinessApiController.java`: typed D4 transport skeleton; validate and map according to API_REQUIREMENTS.md.
- `src/main/java/com/learning/shelfflow/api/Requests.java`: typed D4 transport skeleton; validate and map according to API_REQUIREMENTS.md.
- `src/main/java/com/learning/shelfflow/api/Responses.java`: typed D4 transport skeleton; validate and map according to API_REQUIREMENTS.md.
