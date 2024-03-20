package test.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class buildTestController {

    @GetMapping("/health")
    public String healthCheck() {
        return "health check";
    }
}
