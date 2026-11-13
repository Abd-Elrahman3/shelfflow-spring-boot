package com.learning.shelfflow.domain;

import java.util.*;
import java.time.*;
import java.math.BigDecimal;
import com.learning.shelfflow.exception.*;


/** M1 domain skeleton. AVAILABLE or LOANED; only the lending service changes availability. See README sections 4–5. */
public class BookCopy {
    private UUID id;
    private UUID bookId;
    private CopyStatus status;
    private long version;

    /** TODO: M1 BR-101 BR-102: validate, normalize and assign; preserve documented nullability. */
    public BookCopy(UUID id, UUID bookId, CopyStatus status, long version) {
        throw new UnsupportedOperationException("TODO: M1 BR-101 BR-102 domain construction");
    }
    public UUID getId() { return id; }
    public UUID getBookId() { return bookId; }
    public CopyStatus getStatus() { return status; }
    public long getVersion() { return version; }
}
