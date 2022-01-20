package com.codegym.validateform.model;

import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Data
public class User {
    private int id;
    @Size(min = 5,max = 45)
    private String name;
    @Pattern(regexp = "^[0-9\\-\\+]{9,15}$")
    private String phone;
    @Min(18)
    private int age;
    @Pattern(regexp = "\\S+@\\S+\\.\\S+")
    private String email;
}
