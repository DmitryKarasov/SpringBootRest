package com.karasov.springbootrest.model;

import com.karasov.springbootrest.auth.Authorities;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class User {

    @NotBlank(message = "Name is mandatory")
    private String user;
    @NotBlank(message = "Password is mandatory")
    @Size(min = 3)
    private String password;
    private List<Authorities> authorities;
}
