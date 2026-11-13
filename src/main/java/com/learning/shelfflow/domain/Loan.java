package com.learning.shelfflow.domain;

import java.util.*;
import java.time.*;
import java.math.BigDecimal;
import com.learning.shelfflow.exception.*;


/** M1 domain skeleton. dueOn = borrowedOn + 14 days; returnedOn is nullable; no public setters. See README sections 4–5. */
public class Loan {
    private UUID id;
    private UUID copyId;
    private UUID memberId;
    private LocalDate borrowedOn;
    private LocalDate dueOn;
    private LocalDate returnedOn;

    /** TODO: M1 BR-101 BR-102: validate, normalize and assign; preserve documented nullability. */
    public Loan(UUID id, UUID copyId, UUID memberId, LocalDate borrowedOn, LocalDate dueOn, LocalDate returnedOn) {
        throw new UnsupportedOperationException("TODO: M1 BR-101 BR-102 domain construction");
    }
    public UUID getId() { return id; }
    public UUID getCopyId() { return copyId; }
    public UUID getMemberId() { return memberId; }
    public LocalDate getBorrowedOn() { return borrowedOn; }
    public LocalDate getDueOn() { return dueOn; }
    public LocalDate getReturnedOn() { return returnedOn; }

    /** M1 BR-102. True only for unreturned loans strictly after dueOn. */
    public boolean isOverdue(LocalDate today) {
        throw new UnsupportedOperationException("TODO: M1 BR-102");
    }

    /** M3 BR-302. Preserve first return date; validate before mutation. */
    public void returnOn(LocalDate today) {
        throw new UnsupportedOperationException("TODO: M3 BR-302");
    }

    /** D5 BR-501. 0.50 per overdue day capped at 20.00, scale two. */
    public BigDecimal fineOn(LocalDate today) {
        throw new UnsupportedOperationException("TODO: D5 BR-501");
    }
}
