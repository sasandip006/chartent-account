package com.san.springboot.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.san.springboot.bean.UserDetils;

@Repository
public interface UserDetilsRepository extends JpaRepository<UserDetils, Integer> {

    Optional<UserDetils> findByName(String username);

}
