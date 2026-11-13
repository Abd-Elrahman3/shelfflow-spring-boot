package com.learning.shelfflow.api;
import java.util.*;
import java.time.*;
import java.math.BigDecimal;
/** Transport shapes. TODO: D4 BR-401 add field validation, defensive copies and mapping tests.
 * Treat secrets and internal persistence fields as excluded unless explicitly part of the contract.
 */
public final class Requests {
    private Requests() {}
    public record CreateMember(String email, String displayName) {}
    public record CreateBook(String isbn, String title, List<String> authors) {}
    public record Borrow(UUID memberId, UUID copyId) {}
}
