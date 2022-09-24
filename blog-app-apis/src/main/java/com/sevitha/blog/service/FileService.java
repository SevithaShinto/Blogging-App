package com.sevitha.blog.service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.springframework.web.multipart.MultipartFile;

//For uploading image
public interface FileService {

	String uploadImage(String path, MultipartFile file)throws IOException;
	
	InputStream getResource(String path,String fileName) throws FileNotFoundException;
	
}
