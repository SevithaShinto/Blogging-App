package com.sevitha.blog.service;

import com.sevitha.blog.payloads.CommentDto;

public interface CommentService {
	
	 CommentDto createComment(CommentDto commentDto,Integer postId);
	
	 void deleteComment(Integer commentId);

}
