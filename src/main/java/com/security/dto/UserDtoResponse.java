package com.security.dto;

import lombok.Data;
import lombok.Value;

import java.io.Serializable;


@Data
public class UserDtoResponse implements Serializable {
    String name;
    String email;
}