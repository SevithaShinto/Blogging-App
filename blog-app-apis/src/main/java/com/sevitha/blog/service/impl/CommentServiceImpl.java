package com.sevitha.blog.service.impl;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sevitha.blog.entities.Comment;
import com.sevitha.blog.entities.Post;
import com.sevitha.blog.exceptions.ResourceNotFoundException;
import com.sevitha.blog.payloads.CategoryDto;
import com.sevitha.blog.payloads.CommentDto;
import com.sevitha.blog.repository.CommentRepo;
import com.sevitha.blog.repository.PostRepo;
import com.sevitha.blog.service.CategoryService;
import com.sevitha.blog.service.CommentService;

@Service
public class CommentServiceImpl implements CommentService {
	
	@Autowired
	private PostRepo postRepo;
	
	@Autowired
	private CommentRepo commentRepo;
	
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public CommentDto createComment(CommentDto commentDto, Integer postId) {
		Post post=this.postRepo.findById(postId).orElseThrow(()->new ResourceNotFoundException("Post", "Post Id", postId));
		
		Comment comment = this.modelMapper.map(commentDto, Comment.class);
		comment.setPost(post);
		Comment savedComment = this.commentRepo.save(comment);
		
		return this.modelMapper.map(savedComment, CommentDto.class);
	}

	@Override
	public void deleteComment(Integer commentId) {
		Comment commentDel = this.commentRepo.findById(commentId).orElseThrow(()->new ResourceNotFoundException("Comment", "Comment Id", commentId));
		this.commentRepo.delete(commentDel);
	}

	
}
