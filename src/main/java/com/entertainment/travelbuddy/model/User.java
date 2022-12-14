package com.entertainment.travelbuddy.model;
import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;
import javax.validation.constraints.NotBlank;


import java.util.Date;

@Entity
@Table(name = "user")

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createdDate;

    @NotBlank(message = "Please create your username.")
    @Column(name = "name", nullable = false)
    private String userName;

    @NotBlank(message = "Please create a password.")
    @Column(name = "name", nullable = false)
    private String password;

    @NotBlank(message = "Please enter your first name.")
    @Column(name = "name", nullable = false)
    private String firstName;

    @NotBlank(message = "Please enter your last name.")
    @Column(name = "name", nullable = false)
    private String lastName;

    @NotBlank(message = "Please enter your email address.")
    @Column(name = "name", nullable = false)
    private String email;

    @Column
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;

    @NotBlank(message = "Please tell us more about yourself here.")
    @Column(name = "name", nullable = false)
    private String aboutMe;

//    NEED TO ADD DEFAULT PICTURE
    @Column
    private String profilePicURL;



}
