package com.san.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.san.springboot.bean.UserDetils;
import com.san.springboot.service.AccountantService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping(value = "/bypass")
@Slf4j
public class WelcomeController {

//    @Autowired
//    private UserDetilsService detilsService;

    @Autowired
    private AccountantService accountantService;

    @GetMapping(value = "/welcome")
    public String welcomeMessage() {
        log.info("Your Welcome Here ....Sandeep");
        return "Hello Sandeep, Your Most Welcome Here in this portal..!!";
    }

    @PostMapping(value = "/newuser") // , consumes = MediaType.APPLICATION_JSON_VALUE, produces =
                                     // MediaType.APPLICATION_JSON_VALUE)
    // to access post mapping before spring security you need to disable csrf()
    public UserDetils addNewUser(@RequestBody UserDetils detils) {
        log.info("User Details Arrived here ...!!");
        return accountantService.addNewUser(detils);
    }

}
