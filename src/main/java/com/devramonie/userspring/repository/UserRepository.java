package com.devramonie.userspring.repository;

import com.devramonie.userspring.entities.Users;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<Users, Long> {

}
