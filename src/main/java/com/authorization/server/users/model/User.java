package com.authorization.server.users.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="sys_users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="user_id")
    private Long userId;

    @Column(name="user_username")
    private String username;

    @Column(name="email")
    private String email;

    @Column(name="user_firstname")
    private String userFirstname;

    @Column(name="user_lastname")
    private String userLastname;

    @Column(name="user_phone")
    private String userPhone;

    @Column(name="user_address")
    private String userAddress;

    @Column(name="user_gender")
    private String userGender;

    @Column(name="date_created")
    private Date dateCreated;

    @Column(name="last_login")
    private Date lastLogin;

    @Column(name="is_active")
    private boolean active;

    @JsonIgnore
    @Column(name="user_password")
    private String password;

    @Column(name="user_idno")
    private String idNo;



    @Transient
    private String status;

}

