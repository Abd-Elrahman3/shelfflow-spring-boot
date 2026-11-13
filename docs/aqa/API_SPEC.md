# API Test Specification

The authoritative contract is [API Requirements](../API_REQUIREMENTS.md). Build a test matrix for all 8 operations.

For each: test successful response/status/headers, malformed payload, boundary values, missing resource, duplicate request, authorization denial and relevant unavailable dependency. Check database side effects after rejection. Use exact request bytes for signatures, real JWT validation tests for issuer/audience, and protocol-specific assertions for GraphQL/gRPC/streaming.

| Rule | Required sample |
| --- | --- |
| BR-401 | Client can register a member, create a book/copy, borrow and return using api/examples.http. |
| BR-402 | Duplicate normalized email → code MEMBER_EMAIL_EXISTS; missing member → MEMBER_NOT_FOUND; malformed UUID → 400. |
| BR-501 | 1 day → 0.50; 40 and 41 days → 20.00; due today → absent. |
| BR-502 | Run scheduler twice on the same date and simulate a sender failure: one reminder intent exists and the next run can retry it. |

Do not call real carrier/payment/customer services. Build deterministic local provider fixtures and record request counts and idempotency keys.
