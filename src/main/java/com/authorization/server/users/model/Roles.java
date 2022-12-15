package com.authorization.server.users.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="roles_table")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Roles {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="role_id")
    private Long roleCode;


    @Column(name="role_name")
    private String roleName;

    @Column(name="role_desc")
    private String roleDesc;

}
