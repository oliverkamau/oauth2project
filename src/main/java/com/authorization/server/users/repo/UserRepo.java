package com.authorization.server.users.repo;

import com.authorization.server.users.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {

    User findByEmailAndActiveTrue(String email);
}
