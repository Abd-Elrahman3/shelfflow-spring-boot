package com.learning.shelfflow.exception;

import java.util.*;
import java.time.*;
import java.math.BigDecimal;
import com.learning.shelfflow.exception.*;


public class ConflictException extends RuntimeException {
    public ConflictException(String message) { super(message); }
}
