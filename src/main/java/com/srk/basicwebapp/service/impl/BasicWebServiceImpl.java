package com.srk.basicwebapp.service.impl;

import com.srk.basicwebapp.service.BasicWebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BasicWebServiceImpl implements BasicWebService {
    
    public String getWelcomeMessage() {
        return "Welcome to Spring Boot Basic Web App!";
    }
}
