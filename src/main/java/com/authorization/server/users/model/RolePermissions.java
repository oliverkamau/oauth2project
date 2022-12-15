package com.authorization.server.users.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="system_role_permissions")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class RolePermissions {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="role_permission_id")
    private Long rolePermCode;

    @ManyToOne
    @JoinColumn(name="role_permission")
    private Roles roles;

    @ManyToOne
    @JoinColumn(name="permission_role")
    private Permissions permissions;

    @Column(name="user_role_permission")
    private String permissionName;
}
