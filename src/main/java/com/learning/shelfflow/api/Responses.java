package com.learning.shelfflow.api;
import java.util.*;
import java.time.*;
import java.math.BigDecimal;
/** Transport shapes. TODO: D4 BR-401 add field validation, defensive copies and mapping tests.
 * Treat secrets and internal persistence fields as excluded unless explicitly part of the contract.
 */
public final class Responses {
    private Responses() {}
    public record MemberView(UUID id, String email, String displayName, Instant joinedAt) {}
    public record BookView(UUID id, String isbn, String title, Set<String> authors) {}
    public record CopyView(UUID id, UUID bookId, String status, long version) {}
    public record LoanView(UUID id, UUID copyId, UUID memberId, LocalDate borrowedOn, LocalDate dueOn, LocalDate returnedOn) {}
    public record OverdueView(UUID loanId, LocalDate dueOn, long daysOverdue, BigDecimal fine) {}
    public record PageView<T>(List<T> items, int page, int size, long totalElements) {}
}
