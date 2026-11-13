package com.learning.shelfflow.api;
import java.util.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;
import static com.learning.shelfflow.api.Responses.*;
import com.learning.shelfflow.service.ShelfFlowService;

/** D4 transport skeleton. Implement validation, authorization and DTO/service mapping.
 * Throwing TODOs is deliberate: no endpoint claims business success yet.
 */
@RestController
public class BusinessApiController {
    private final ShelfFlowService service;
    public BusinessApiController(ShelfFlowService service) { this.service = service; }
    @PostMapping("/api/v1/members")
    public ResponseEntity<MemberView> createMember(@Valid @RequestBody Requests.CreateMember request) {
        throw new UnsupportedOperationException("TODO: D4 BR-401 BR-402 createMember");
    }
    @PostMapping("/api/v1/books")
    public ResponseEntity<BookView> createBook(@Valid @RequestBody Requests.CreateBook request) {
        throw new UnsupportedOperationException("TODO: D4 BR-401 BR-402 createBook");
    }
    @PostMapping("/api/v1/books/{bookId}/copies")
    public ResponseEntity<CopyView> createCopy(@PathVariable UUID bookId) {
        throw new UnsupportedOperationException("TODO: D4 BR-401 BR-402 createCopy");
    }
    @GetMapping("/api/v1/books")
    public ResponseEntity<PageView<BookView>> books(@RequestParam(defaultValue="0") int page, @RequestParam(defaultValue="20") int size, @RequestParam(required=false) String title) {
        throw new UnsupportedOperationException("TODO: D4 BR-401 BR-402 books");
    }
    @PostMapping("/api/v1/loans")
    public ResponseEntity<LoanView> borrow(@Valid @RequestBody Requests.Borrow request) {
        throw new UnsupportedOperationException("TODO: D4 BR-401 BR-402 borrow");
    }
    @GetMapping("/api/v1/loans/{loanId}")
    public ResponseEntity<LoanView> loan(@PathVariable UUID loanId) {
        throw new UnsupportedOperationException("TODO: D4 BR-401 BR-402 loan");
    }
    @PostMapping("/api/v1/loans/{loanId}/return")
    public ResponseEntity<LoanView> returnLoan(@PathVariable UUID loanId) {
        throw new UnsupportedOperationException("TODO: D4 BR-401 BR-402 returnLoan");
    }
    @GetMapping("/api/v1/reports/overdue")
    public ResponseEntity<PageView<OverdueView>> overdue(@RequestParam(defaultValue="0") int page, @RequestParam(defaultValue="20") int size) {
        throw new UnsupportedOperationException("TODO: D4 BR-401 BR-402 overdue");
    }
}
