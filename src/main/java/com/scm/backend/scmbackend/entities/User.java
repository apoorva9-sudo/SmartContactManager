package com.scm.backend.scmbackend.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name="users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class User {
    @Id
    private String id;


    @Column(name = "name", nullable = false)
    @NotBlank(message=" User is required")
    private String name;


    @Column(unique = true, nullable = false)
    @Email(message = "Invalid email format")
    @NotBlank(message = "Email is required")
    private String email;

    @Size(min = 6, message = "Password must be at least 6 characters long")
    private String password;


    @Lob
    private String about;

    @Column(length = 1000)
    private String profilePicture;
    @Pattern(regexp = "^[6-9]\\d{9}$", message = "Phone number must be a valid Indian 10-digit number")
    private String phoneNumber;
    // information
    private boolean enabled = false;
    private boolean emailVerified = false;
    private boolean phoneVerified = false;

    @Enumerated(value = EnumType.STRING)
    // SELF, GOOGLE, FACEBOOK, TWITTER, LINKEDIN, GITHUB
    private Providers provider = Providers.SELF;

    private String  emailToken;
    @OneToMany(mappedBy = "user",fetch=FetchType.LAZY,cascade=CascadeType.ALL,orphanRemoval = true)
    private Set<Contact> contacts=new LinkedHashSet<>();

}
