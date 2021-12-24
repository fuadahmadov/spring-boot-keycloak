package com.springboot.keycloak;

import javax.annotation.security.RolesAllowed;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RolesAllowed("USER")
    @GetMapping("/welcome")
    public String endpoint1() {
        return "welcome";
    }

    @GetMapping("/bye")
    public String endpoint2() {
        return "bye";
    }

    @GetMapping("/public")
    public String endpoint3() {
        return "public";
    }
}
