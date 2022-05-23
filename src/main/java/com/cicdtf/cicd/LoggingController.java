package com.cicdtf.cicd;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@PropertySource("classpath:application.properties")
public class LoggingController {

    @Value("${logging-module.version}")
    private String version;

    @GetMapping("/")
    public String version() {
        return String.format("Project Version아이우에오 : %s", version);
    }

    @GetMapping("/health") public String checkHealth() {
        return "healthy";
    }
}
