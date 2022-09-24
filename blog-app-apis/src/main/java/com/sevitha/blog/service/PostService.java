package com.sevitha.blog.service;

import java.util.List;

import com.sevitha.blog.entities.Post;
import com.sevitha.blog.payloads.PostDto;
import com.sevitha.blog.payloads.PostResponse;

public interface PostService {

	//create
	PostDto createPost(PostDto postDto, Integer userId , Integer CategoryId);
	
	//update
	PostDto updatePost(PostDto postDto,Integer postId);
	
	///delete
	void deletePost(Integer postId);
	
	//get all posts
//	List<PostDto> getAllPost(Integer pageNumber, Integer pageSize);
	PostResponse getAllPost(Integer pageNumber, Integer pageSize, String sortBy, String sortDir);
	
	//get single post
	PostDto getPostById(Integer postId);
	
	//get all post by category
	List<PostDto> getPostsByCategory(Integer categoryId);
	
	//get all posts by user
	List<PostDto> getPostsByUser(Integer userId);
	
	//search posts
	List<PostDto> searchPosts(String keyword);
	
}
