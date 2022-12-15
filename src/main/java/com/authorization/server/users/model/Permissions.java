package com.authorization.server.users.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="system_permissions")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Permissions {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="permission_id")
    private Long permCode;

    @Column(name="permission_name")
    private String permName;

    @Column(name="permission_desc")
    private String permDesc;

}
