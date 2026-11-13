package com.learning.shelfflow.service;

import java.util.*;
import java.time.*;
import java.math.BigDecimal;
import com.learning.shelfflow.exception.*;
import com.learning.shelfflow.domain.*;
import com.learning.shelfflow.repository.ShelfFlowRepository;

@org.springframework.stereotype.Service
public class ShelfFlowService {
    private final ShelfFlowRepository repository;
    private final Clock clock;
    public ShelfFlowService(ShelfFlowRepository repository, Clock clock) {
        this.repository = Objects.requireNonNull(repository);
        this.clock = Objects.requireNonNull(clock);
    }
    /** M3 BR-301; see README for the full invariant and docs/ACCEPTANCE_TESTS.md for failure cases. */
    public Loan borrow(UUID memberId, UUID copyId) {
        throw new UnsupportedOperationException("TODO: M3 BR-301 borrow");
    }
    /** M3 BR-302; see README for the full invariant and docs/ACCEPTANCE_TESTS.md for failure cases. */
    public Loan returnLoan(UUID loanId) {
        throw new UnsupportedOperationException("TODO: M3 BR-302 returnLoan");
    }
    /** D5 BR-501; see README for the full invariant and docs/ACCEPTANCE_TESTS.md for failure cases. */
    public List<Loan> overdue(int page, int size) {
        throw new UnsupportedOperationException("TODO: D5 BR-501 overdue");
    }
    /** D5 BR-502; see README for the full invariant and docs/ACCEPTANCE_TESTS.md for failure cases. */
    public int scheduleReminders(LocalDate date) {
        throw new UnsupportedOperationException("TODO: D5 BR-502 scheduleReminders");
    }
}
