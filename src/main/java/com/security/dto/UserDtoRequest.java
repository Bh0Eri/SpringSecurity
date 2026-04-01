package com.security.dto;

import com.security.enums.Role;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.Value;
import org.hibernate.validator.constraints.CodePointLength;
import org.hibernate.validator.constraints.Length;

import java.io.Serializable;


@Data
public class UserDtoRequest implements Serializable {
    @NotNull
    String name;
    @Email(message = "Email not valid")
    @NotBlank
    String email;
    @NotNull
    @Length(message = "Need to have more than 6 digits", min = 6, max = 100)
    @CodePointLength
    String password;
    Role role;
}