package com.sevitha.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sevitha.blog.entities.User;

public interface UserRepo extends JpaRepository<User, Integer>{

}
