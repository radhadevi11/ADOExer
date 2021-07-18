package com.radha.ado.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
    @RequestMapping("/")
    public String getGreetings() {
        return "Welcome to ADO Deployment";
    }
}
