package com.san.springboot.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Accountant {

    private int id;
    private String firstName;
    private String lastName;
    private long age;
    private long experiance;
    private String gender;

}
