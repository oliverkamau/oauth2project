package com.authorization.server.users.repo;

import com.authorization.server.users.model.Permissions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PermissionsRepo extends JpaRepository<Permissions,Long> {
}
