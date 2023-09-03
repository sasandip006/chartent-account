package com.san.springboot.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.san.springboot.bean.UserDetils;
import com.san.springboot.bean.UserInfoDetailsMapper;
import com.san.springboot.repository.UserDetilsRepository;
import com.san.springboot.service.UserDetilsService;

@Service
public class UserDetilsServiceImpl implements UserDetilsService {


    @Autowired
    private UserDetilsRepository detilsRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<UserDetils> user = detilsRepository.findByName(username);
        return user.map(UserInfoDetailsMapper::new)
                .orElseThrow(() -> new UsernameNotFoundException("User Not Found: " + username));
    }


}
