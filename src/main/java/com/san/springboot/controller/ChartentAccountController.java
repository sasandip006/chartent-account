package com.san.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.san.springboot.bean.Accountant;
import com.san.springboot.service.AccountantService;

@RestController // we cant use @Controller and @Rest Controller in one application if use then
                // then clear need to define in security
@RequestMapping("/ca")
public class ChartentAccountController {

    @Autowired
    private AccountantService accService;

    @GetMapping("/greet")
    public String helloGreet() {
        return "Welcome to the chartent accountant portal ...!!";
    }

    @GetMapping("/accountant")
    @PreAuthorize("hasRole('ROLE_USER')") // static & dynamic @PreAuthorize ("hasRole('ROLE_USER')")
    // @PreAuthorize("hasRole('ROLE_USER') and hasRole('ROLE_ADMIN')")
    // @PreAuthorize("#user.name == principal.name)
    //@PreAuthorize("#contact.name == principal.name")    public void doSomething(Contact contact)
    public List<Accountant> returnAccountant() throws CloneNotSupportedException {
        return accService.getAllAccountants();
    }

    @GetMapping("/accountant/{id}")
    @Secured("ROLE_USER") // static @Secured(ROLE_USER) @Secured({ROLE_ADMIN , ROLE_USER})
    public Accountant searchAccountant(@PathVariable(name = "id") long id) throws CloneNotSupportedException {
        Accountant accountant = accService.searchForAccountantId(id);
        return accountant;
    }
}
