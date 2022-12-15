package com.authorization.server.users.repo;

import com.authorization.server.users.model.RolePermissions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RolePermissionsRepo extends JpaRepository<RolePermissions,Long> {
}
