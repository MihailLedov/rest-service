package com.ledok.spring.restservice.jpa.repository;

import com.ledok.spring.restservice.jpa.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {
}
