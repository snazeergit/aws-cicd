package com.nt.controller;

import com.nt.service.WelcomeService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/welcome")
public class WelcomeController {

    @Autowired
    private WelcomeService welcomeService;

    @Operation(summary = "Get welcome message", description = "Returns a welcome message to the user")
    @GetMapping("/message")
    public ResponseEntity<String> generateWishMessage() {
        String message = welcomeService.greetMessage();
        return new ResponseEntity<>(message, HttpStatus.OK);
    }
}
