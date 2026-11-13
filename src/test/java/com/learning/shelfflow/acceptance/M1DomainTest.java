package com.learning.shelfflow.acceptance;
import com.learning.shelfflow.domain.*;
import com.learning.shelfflow.exception.*;
import java.util.*;
import java.time.*;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
/** Provided behavioral examples. These fail until M1 is implemented. Add boundary cases. */
@Tag("M1")
class M1DomainTest {
    @Test void normalizesMemberIdentity() {
        var member = new Member(UUID.randomUUID(), " ADA@EXAMPLE.COM ", " Ada ", Instant.EPOCH);
        assertEquals("ada@example.com", member.getEmail());
        assertEquals("Ada", member.getDisplayName());
    }
    @Test void rejectsBlankName() {
        assertThrows(IllegalArgumentException.class, () -> new Member(UUID.randomUUID(), "a@b.com", "  ", Instant.EPOCH));
    }
    @Test void dueDateIsNotOverdueAndLeapYearIsHandled() {
        var borrowed = LocalDate.of(2028, 2, 20);
        var loan = new Loan(UUID.randomUUID(), UUID.randomUUID(), UUID.randomUUID(), borrowed, borrowed.plusDays(14), null);
        assertEquals(LocalDate.of(2028,3,5), loan.getDueOn());
        assertFalse(loan.isOverdue(LocalDate.of(2028,3,5)));
        assertTrue(loan.isOverdue(LocalDate.of(2028,3,6)));
    }
}
