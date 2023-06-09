package com.teksystems.formbeans;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UserFormBean {

    private Integer id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;
}
