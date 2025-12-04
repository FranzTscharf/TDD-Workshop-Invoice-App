
package com.example.api;

import com.example.raw.*;
import com.example.refactored.*;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
public class DemoController {

    @GetMapping("/api/customers")
    public String customers(){
        new CustomerManager().handleCustomers(Arrays.asList("Anna","Ben","Chris"));
        return "RAW customers executed.";
    }

    @GetMapping("/api/customers/refactored")
    public String customersRef(){
        new CustomerManagerRefactored().handleCustomers(Arrays.asList("Anna","Ben","Chris"));
        return "REFACTORED customers executed.";
    }
}
