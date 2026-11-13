package com.learning.shelfflow.repository;

import java.util.*;
import java.time.*;
import java.math.BigDecimal;
import com.learning.shelfflow.exception.*;
import com.learning.shelfflow.domain.*;

public interface ShelfFlowRepository {
    Optional<Loan> findLoan(UUID id);
    Loan saveLoan(Loan loan);
    Optional<BookCopy> lockCopy(UUID id);
    Optional<Member> lockMember(UUID id);
    long countActiveLoans(UUID memberId);
}
