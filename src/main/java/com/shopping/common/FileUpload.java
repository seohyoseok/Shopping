package com.shopping.common;

import java.awt.PageAttributes.OriginType;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

public class FileUpload {

/*	public static void upload(HttpServletRequest request, HttpServletResponse response) throws IOException {
		MultipartHttpServletRequest multipartHttpServletRequest = (MultipartHttpServletRequest) request;
		Iterator<String> iterator = multipartHttpServletRequest.getFileNames();
		boolean mimeCheck = false;
		FTPCommon.connectFtp();

		while (iterator.hasNext()) { // �� 3����
			MultipartFile multipartFile = multipartHttpServletRequest.getFile((String) iterator.next());
			if (multipartFile.isEmpty() == false) {
				String orignFilename = multipartFile.getOriginalFilename();
				mimeCheck = MimeCheck.mimecheck(orignFilename);

				if (mimeCheck == true) {
					FTPCommon.uploadFtp(orignFilename);
				} else {
					System.out.println("���ٺҰ�");
				}
			}
		}

		FTPCommon.disconnectFtp();

	}*/
	
	public static void upload(HttpServletRequest request, HttpServletResponse response) throws IOException {
		MultipartHttpServletRequest multipartHttpServletRequest = (MultipartHttpServletRequest) request;
		Iterator<String> iterator = multipartHttpServletRequest.getFileNames();
		String orignFilename2[] = null;
		
		Map<String, MultipartFile> files= multipartHttpServletRequest.getFileMap();
		
		boolean mimeCheck = true;
		FTPCommon.connectFtp();

		while (iterator.hasNext()) { // �� 3����
			MultipartFile multipartFile = multipartHttpServletRequest.getFile((String) iterator.next());
			if (multipartFile.isEmpty() == false) {
				String orignFilename = multipartFile.getOriginalFilename();
				mimeCheck = MimeCheck.mimecheck(orignFilename);
				System.out.println("mimeTypeCheck:"+mimeCheck);
                if(mimeCheck==false){
                	System.out.println("����1");
                	break;
                }
			}
			System.out.println("����2");
		}
		
		/*if(mimeCheck==true){
		   for(int i=0; i<files.size(); i++){
			   MultipartFile multipartFile = multipartHttpServletRequest.getFile((String) iterator.next());  //���⼭ �������µ� �𸣰ٴ� ..
			   orignFilename2[i] = multipartFile.getOriginalFilename();
			   
			   System.out.println("originFilename:"+orignFilename2[i]);
		   }
		}*/

		FTPCommon.disconnectFtp();

	}

}
