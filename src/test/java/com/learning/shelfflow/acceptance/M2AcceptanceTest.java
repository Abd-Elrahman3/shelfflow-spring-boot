package com.learning.shelfflow.acceptance;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
/** Required test exercises. Read docs/ACCEPTANCE_TESTS.md for setup and expected results. */
@Tag("M2")
class M2AcceptanceTest {
    /** BR-201: Two concurrent SQL inserts for an active loan on the same copy cannot both commit; orphan copy/member foreign keys fail. */
    @Test void br201_acceptance() {
        fail("TODO: M2 BR-201 replace this with a behavior test; do not disable or delete it");
    }
    /** BR-202: A page of 20 books does not issue 21 author queries. Capture SQL counts and EXPLAIN ANALYZE for a catalog of 10,000 books. */
    @Test void br202_acceptance() {
        fail("TODO: M2 BR-202 replace this with a behavior test; do not disable or delete it");
    }
}
