package com.learning.shelfflow.acceptance;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
/** Required test exercises. Read docs/ACCEPTANCE_TESTS.md for setup and expected results. */
@Tag("M3")
class M3AcceptanceTest {
    /** BR-301: With four active loans and two simultaneous borrow attempts, exactly one succeeds. A forced exception after loan insertion leaves no loan or copy change. */
    @Test void br301_acceptance() {
        fail("TODO: M3 BR-301 replace this with a behavior test; do not disable or delete it");
    }
    /** BR-302: Repeat tomorrow: the first returnedOn is unchanged; no extra notification record or availability increment appears. */
    @Test void br302_acceptance() {
        fail("TODO: M3 BR-302 replace this with a behavior test; do not disable or delete it");
    }
}
