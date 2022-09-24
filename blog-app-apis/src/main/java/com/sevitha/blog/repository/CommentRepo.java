package com.sevitha.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sevitha.blog.entities.Comment;

public interface CommentRepo extends JpaRepository<Comment, Integer>{

}
