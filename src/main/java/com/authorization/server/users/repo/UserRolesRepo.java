package com.authorization.server.users.repo;



import com.authorization.server.users.model.User;
import com.authorization.server.users.model.UserRoles;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRolesRepo extends JpaRepository<UserRoles, Long> {
    List<UserRoles> findByUser(User user);
}
