package com.cyri.phoneservice.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class PhoneServiceController {
	 private static final Logger logger = LogManager.getLogger(PhoneServiceController.class);
	 	
	    @GetMapping("/welcome")
	    public String welcome() {
            logger.debug("Inside welcome method of controller");
	        return "Phone Service welcome"; 
	    }
}
