package com.learning.shelfflow.domain;

import java.util.*;
import java.time.*;
import java.math.BigDecimal;
import com.learning.shelfflow.exception.*;


/** M1 domain skeleton. Email trimmed/lowercase using Locale.ROOT; unique normalized email. See README sections 4–5. */
public class Member {
    private UUID id;
    private String email;
    private String displayName;
    private Instant joinedAt;

    /** TODO: M1 BR-101 BR-102: validate, normalize and assign; preserve documented nullability. */
    public Member(UUID id, String email, String displayName, Instant joinedAt) {
        throw new UnsupportedOperationException("TODO: M1 BR-101 BR-102 domain construction");
    }
    public UUID getId() { return id; }
    public String getEmail() { return email; }
    public String getDisplayName() { return displayName; }
    public Instant getJoinedAt() { return joinedAt; }
}
