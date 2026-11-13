# API Requirements

## 1. Transport contract

| Method / protocol | Path / operation | Request / headers | Response |
| --- | --- | --- | --- |
| POST | /api/v1/members | {email,displayName} | 201 Member; 400 invalid; 409 duplicate |
| POST | /api/v1/books | {isbn,title,authors:[string]} | 201 Book; 409 duplicate ISBN |
| POST | /api/v1/books/{bookId}/copies | {} | 201 BookCopy; 404 book |
| GET | /api/v1/books | page,size,title query parameters | 200 Page<Book> |
| POST | /api/v1/loans | {memberId,copyId} | 201 Loan; 404 missing; 409 unavailable/limit |
| GET | /api/v1/loans/{loanId} | — | 200 Loan; 404 missing |
| POST | /api/v1/loans/{loanId}/return | {} | 200 Loan, including replay; 404 missing |
| GET | /api/v1/reports/overdue | page,size | 200 Page<{loanId,dueOn,daysOverdue,fine}> |

JSON UUIDs and timestamps are strings. Instants use RFC 3339 UTC. Money represented as decimal values must serialize without binary floating-point loss; integer minor units remain integers. Successful entity DTOs expose the documented public model fields, omitting secrets, internal hashes and versioning infrastructure except explicit version/ETag fields. Reject unknown write fields where they could spoof ownership or alter privileged state. Missing required fields, malformed UUIDs and invalid bounds return 400 before side effects. JSON requests use Content-Type: application/json; unsupported content types return 415.

## 2. Authentication and authorization

This first project is an explicitly local, unauthenticated learning API. Keep loopback binding. Authentication becomes mandatory in SeatLock. Do not treat this as a production deployment template.

## 3. Error contract

REST errors use application/problem+json with type,title,status,detail,instance,code and traceId; validation adds fieldErrors:[{field,message}]. Use stable public codes, not exception class names. Domain conflict → 409, not 500. Missing resource → 404. Optimistic version mismatch → 412 where specified. Body limit → 413. Rate limit → 429 with Retry-After. Temporary unavailable dependency → 503 with bounded Retry-After. These general mappings do not override more specific rule contracts above.

Example:

```json
{"type":"urn:problem:business-conflict","title":"Conflict","status":409,"detail":"The requested state transition is not allowed","instance":"/api/v1/resource/example","code":"STATE_CONFLICT","traceId":"example-trace"}
```

GraphQL uses errors[].extensions.code and may return partial data; do not turn every resolver failure into an HTTP 500. gRPC uses canonical status codes and explicit deadlines, with typed error details where needed. Once SSE/WebSocket headers are committed, close or send a documented protocol error rather than attempting to replace the HTTP status.

## 4. Compatibility and limits

REST paths are versioned except /graphql, infrastructure health and the specified WebSocket path. Additive response fields are compatible; changing meaning/nullability/status requires a migration plan. Defaults: page size 20, max 100; stable sort needs a unique tie breaker. Limit request body size and concurrency explicitly. Use client-generated idempotency keys only for endpoints requiring them and preserve the documented scope/retention. A timeout does not prove a remote action failed.

## 5. Required contract tests

For every operation cover success, malformed input, missing resource, duplicate/state conflict and relevant authorization denial. Validate status, headers and response fields, plus absence of unintended DB/broker effects. Document client retry behavior. Test provider callbacks using exact raw bytes and deterministic secrets. Use local simulators rather than paid services.

See [Implementation Labs and Contract Details](IMPLEMENTATION_LABS.md) for concrete fixtures, payload semantics and boundary experiments. These are required, not optional extras.
