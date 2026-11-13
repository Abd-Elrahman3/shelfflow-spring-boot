package com.learning.shelfflow.repository;

import java.util.*;
import java.time.*;
import java.math.BigDecimal;
import com.learning.shelfflow.exception.*;
import com.learning.shelfflow.domain.*;

/** M2 BR-201/BR-202. Implement using real PostgreSQL; do not substitute an in-memory map. */
@org.springframework.stereotype.Repository
public class PostgresShelfFlowRepository implements ShelfFlowRepository {
    @Override public Optional<Loan> findLoan(UUID id) {
        throw new UnsupportedOperationException("TODO: M2 BR-201 BR-202 findLoan");
    }
    @Override public Loan saveLoan(Loan loan) {
        throw new UnsupportedOperationException("TODO: M2 BR-201 BR-202 saveLoan");
    }
    @Override public Optional<BookCopy> lockCopy(UUID id) {
        throw new UnsupportedOperationException("TODO: M2 BR-201 BR-202 lockCopy");
    }
    @Override public Optional<Member> lockMember(UUID id) {
        throw new UnsupportedOperationException("TODO: M2 BR-201 BR-202 lockMember");
    }
    @Override public long countActiveLoans(UUID memberId) {
        throw new UnsupportedOperationException("TODO: M2 BR-201 BR-202 countActiveLoans");
    }
}
