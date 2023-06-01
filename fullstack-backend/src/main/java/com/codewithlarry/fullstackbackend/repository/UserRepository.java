package com.codewithlarry.fullstackbackend.repository;

import com.codewithlarry.fullstackbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
