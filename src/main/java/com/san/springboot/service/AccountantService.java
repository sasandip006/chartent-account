package com.san.springboot.service;

import java.util.List;

import com.san.springboot.bean.Accountant;
import com.san.springboot.bean.UserDetils;

public interface AccountantService {

    public Accountant searchForAccountantId(long id) throws CloneNotSupportedException;

    public List<Accountant> getAllAccountants() throws CloneNotSupportedException;

    public UserDetils addNewUser(UserDetils detils);

}
