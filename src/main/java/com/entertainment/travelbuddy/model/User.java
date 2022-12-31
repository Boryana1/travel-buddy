package com.entertainment.travelbuddy.model;
import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;
import javax.validation.constraints.NotBlank;

//  NEEDS FIXING

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
    @Column(name = "username", nullable = false)
    private String username;

    @NotBlank(message = "Please create a password.")
    @Column(name = "password", nullable = false)
    private String password;

    @NotBlank(message = "Please enter your first name.")
    @Column(name = "firstName", nullable = false)
    private String firstName;

    @NotBlank(message = "Please enter your last name.")
    @Column(name = "lastName", nullable = false)
    private String lastName;

    @NotBlank(message = "Please enter your email address.")
    @Column(name = "email", nullable = false)
    private String email;

    @Column
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;

    @NotBlank(message = "Please tell us more about yourself here.")
    @Column(name = "aboutMe", nullable = false)
    private String aboutMe;



//    NEED TO ADD DEFAULT PICTURE

    @Column
    private String profilePicURL;

    public User(User user) {
    }

    public User(Long id, Date createdDate, String username, String password, String firstName, String lastName, String email, Date birthday, String aboutMe, String profilePicURL) {
        this.id = id;
        this.createdDate = createdDate;
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.birthday = birthday;
        this.aboutMe = aboutMe;
        this.profilePicURL = profilePicURL;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getAboutMe() {
        return aboutMe;
    }

    public void setAboutMe(String aboutMe) {
        this.aboutMe = aboutMe;
    }

    public String getProfilePicURL() {
        return profilePicURL;
    }

    public void setProfilePicURL(String profilePicURL) {
        this.profilePicURL = profilePicURL;
    }

}
