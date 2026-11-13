package com.learning.shelfflow.exception;

import java.util.*;
import java.time.*;
import java.math.BigDecimal;
import com.learning.shelfflow.exception.*;


public class NotFoundException extends RuntimeException {
    public NotFoundException(String message) { super(message); }
}
