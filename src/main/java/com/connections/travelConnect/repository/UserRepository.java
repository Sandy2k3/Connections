package com.connections.travelConnect.repository;

import com.connections.travelConnect.dto.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users , Long> {

    Users findByUsername(String username);
}
