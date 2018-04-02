package com.srk.basicwebapp.controller;

import com.srk.basicwebapp.service.BasicWebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicWebController {

    @Autowired
    private BasicWebService service;

    @RequestMapping("/welcome")
    public String welcomeMessage() {
        return service.getWelcomeMessage();
    }
}
