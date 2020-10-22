package com.meroapp.meroblog.service;

import org.springframework.web.multipart.MultipartFile;

public interface UploadService {

	
	public boolean uploadImage(MultipartFile image);
	
	
}
