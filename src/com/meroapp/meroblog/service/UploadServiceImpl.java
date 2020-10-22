package com.meroapp.meroblog.service;

import java.io.File;
import java.io.IOException;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class UploadServiceImpl implements UploadService{
	
	public static final String UPLOAD_DIR = "/Users/stim/desktop/uploads/images";

	@Override
	public boolean uploadImage(MultipartFile image) {
		
			boolean uploaded = false;
			
			File upload_path = new File(UPLOAD_DIR);
			
			if(!upload_path.exists()) {
				upload_path.mkdirs();
			}
			
			File upload_file = 
					new File(UPLOAD_DIR + File.separator + image.getOriginalFilename() );
			
			try {
				image.transferTo(upload_file);
				uploaded = true;
			} 
			catch (IllegalStateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		return uploaded;
	}
	
	

}
