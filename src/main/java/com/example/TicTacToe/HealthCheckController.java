package com.example.TicTacToe;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//A controller for when you want to return data
// (e.g. JSON or XML) rather than a view (HTML)
@RestController
public class HealthCheckController {

    //The ProgramStatus method will be called when an HTTP Get request is received at the /healthcheck URL.
    @GetMapping("/healthcheck")
    public ProgramStatus programStatus() {
        // Returns a HealthStatus object with "ok" status
        // Spring automatically converts the following to JSON: {"status": "ok"}
        return new ProgramStatus("ok");
    }
}
