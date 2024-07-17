package com.example.l3ks1krestapi.Repository;

import com.example.l3ks1krestapi.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
    Optional<User> findByEmail(String email);
    Optional<User> findByUuid(UUID uuid);
}
