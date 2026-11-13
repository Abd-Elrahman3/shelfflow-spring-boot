# Implementation Labs and Contract Details

These details are part of the requirements and refine the README rules.

## Fixtures and full client journey

Create members Alice and Bob, a book with at least one nonblank author (max 100 characters each), and two copies. ISBN is unique. Use Clock fixed at 2028-02-20T12:00:00Z. Register → create book → create copy → borrow → fetch loan → list overdue after advancing the clock → return → repeat return. Expose UUIDs from create responses and return Location headers pointing to the created resource; add individual member/book/copy GET routes if you choose to make all Location targets dereferenceable.

Member email max length is 254 after normalization. Authors are trimmed and deduplicated. Borrowed/due dates are controlled by the service; callers may not set them. Loan API fields are id,copyId,memberId,borrowedOn,dueOn,returnedOn (null while active). Create-copy takes an empty body. Book list returns {items,page,size,totalElements}; overdue list uses the same envelope, with fine as a JSON decimal preserving two-place formatting.

## Database lab

Open two SQL sessions. Both attempt to claim the same copy; observe the row lock/unique constraint. Then race different copies for one member with four loans: locking only copies is insufficient to enforce the five-loan limit. Show member-first lock order. Include rollback after a loan insert and before copy status update.

## Spring lab

Enable the condition evaluation report, explain DataSource/JPA auto-configuration, bind a @ConfigurationProperties record for lending period/fine cap, and validate invalid configuration at startup. Defaults are 14 days, 0.50/day and 20.00 cap; contract tests use these values. Use constructor injection and demonstrate why a manually constructed service has no transactional proxy.
