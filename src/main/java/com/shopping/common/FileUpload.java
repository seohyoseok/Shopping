package com.shopping.common;

import java.io.IOException;
import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

public class FileUpload {
    
	public static void upload(HttpServletRequest request) throws IOException{
		MultipartHttpServletRequest multipartHttpServletRequest = (MultipartHttpServletRequest) request;
		Iterator<String> iterator = multipartHttpServletRequest.getFileNames();
		boolean mimeCheck = false;
		FTPCommon.connectFtp();
		while (iterator.hasNext()) {
			System.out.println("dmd");
			MultipartFile multipartFile = multipartHttpServletRequest.getFile((String) iterator.next());

			if (multipartFile.isEmpty() == false) {
				String orignFilename = multipartFile.getOriginalFilename();
				mimeCheck = MimeCheck.mimecheck(orignFilename);

				if (mimeCheck == true) {
					FTPCommon.uploadFtp();
				} else {
					System.out.println("접근불가");
				}
			}
		}
		FTPCommon.disconnectFtp();
		
	}
	
}
