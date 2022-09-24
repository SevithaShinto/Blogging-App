package com.sevitha.blog.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.sevitha.blog.entities.Category;
import com.sevitha.blog.entities.Post;
import com.sevitha.blog.entities.User;

public interface PostRepo extends JpaRepository<Post, Integer>{

	List<Post> findByUser(User user);
	
	List<Post> findByCategory(Category category);
	
//	List<Post> findByTitleContaining(String title);  //only string keywords can be searched
	
	@Query("select p from Post p where p.title like :key") //for searching string/number/any character
	List<Post> searchByTitle(@Param("key") String title);  //%key%
	
}
