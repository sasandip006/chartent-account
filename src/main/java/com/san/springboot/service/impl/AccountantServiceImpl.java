package com.san.springboot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.san.springboot.SingletonAccountantList;
import com.san.springboot.bean.Accountant;
import com.san.springboot.bean.UserDetils;
import com.san.springboot.repository.UserDetilsRepository;
import com.san.springboot.service.AccountantService;

@Service
public class AccountantServiceImpl implements AccountantService {

    @Autowired
    private PasswordEncoder encoder;

    @Autowired
    private UserDetilsRepository detilsRepository;

    @Override
    public Accountant searchForAccountantId(long id) throws CloneNotSupportedException {
        return SingletonAccountantList.getInstance().getAccountantsList().stream().filter(acc -> acc.getId() == id)
                .findFirst().orElseThrow(() -> new RuntimeException("Accoutant Not Found For ID: " + id));
    }

    @Override
    public List<Accountant> getAllAccountants() throws CloneNotSupportedException {
        return SingletonAccountantList.getInstance().getAccountantsList();
    }

    public UserDetils addNewUser(UserDetils detils) {
        detils.setPassword(encoder.encode(detils.getPassword()));
        UserDetils savedUser = detilsRepository.save(detils);
        return savedUser;
    }
}
