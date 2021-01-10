package com.example.sleuth;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private static Logger log = LoggerFactory.getLogger(DemoController.class);

    @RequestMapping("/")
    public String home() {
        log.info("Receive Request.");
        log.info("traceId={}", MDC.get("traceId"));
        log.info("spanId={}", MDC.get("spanId"));
        return "Hello World";
    }
}
