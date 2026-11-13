package com.learning.shelfflow.domain;

import java.util.*;
import java.time.*;
import java.math.BigDecimal;
import com.learning.shelfflow.exception.*;


/** M1 domain skeleton. ISBN is exactly 13 ASCII digits in this exercise; title 1–200 trimmed characters. See README sections 4–5. */
public class Book {
    private UUID id;
    private String isbn;
    private String title;
    private Set<String> authors;

    /** TODO: M1 BR-101 BR-102: validate, normalize and assign; preserve documented nullability. */
    public Book(UUID id, String isbn, String title, Set<String> authors) {
        throw new UnsupportedOperationException("TODO: M1 BR-101 BR-102 domain construction");
    }
    public UUID getId() { return id; }
    public String getIsbn() { return isbn; }
    public String getTitle() { return title; }
    public Set<String> getAuthors() { return authors; }
}
