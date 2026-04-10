package com.security.dto;

import com.security.enums.Role;
import lombok.Data;
import lombok.Value;

import java.io.Serializable;


@Data
public class UserDtoResponse implements Serializable {
    String name;
    String email;
    Role role;
}