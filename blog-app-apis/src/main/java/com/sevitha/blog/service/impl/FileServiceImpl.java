package com.sevitha.blog.service.impl;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;

import org.springframework.web.multipart.MultipartFile;

import com.sevitha.blog.service.FileService;

public class FileServiceImpl implements FileService {

//	private static final String String = null;

	@Override
	public String uploadImage(String path, MultipartFile file) throws IOException {
		//File name
		String name = file.getOriginalFilename();
		//abc.png
		
		
		//random name generate file
		String randomID = UUID.randomUUID().toString();
//		String fileName1=randomID.concat(name.substring(name.lastIndexOf(Str. ".")));
		
		//Fullpath
//		String filePath=path+ File.separator +fileName1;
		
		
		return null;
	}

	@Override
	public InputStream getResource(String path, String fileName) throws FileNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

}
