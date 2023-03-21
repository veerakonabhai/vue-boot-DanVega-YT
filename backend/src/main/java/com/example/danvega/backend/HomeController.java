package com.example.danvega.backend;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin //we need this line when we want to hit from different url
public class HomeController {
    
    @GetMapping("/") //for home page(localhost:8085)
    public String home() {
        return "Hello from Spring boot dan-vega YT video";
    }

    @GetMapping("/veera") //for different page(localhost:8085/veera)
    public String veera() {
        return "Hello from Veera";
    }

}
