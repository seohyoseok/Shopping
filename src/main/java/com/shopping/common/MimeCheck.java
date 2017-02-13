package com.shopping.common;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
/* 2017 02 08 ����Ÿ�� üũ �߰� ��ȿ�� */
public class MimeCheck {
    
	
	public static boolean mimecheck(String originfileName) throws IOException{
		
		/* ����Ÿ��üũ (�ڹ�7 �������ķ� �����ϴ� ����Ÿ�� �˻� ���)*/
		Path source = Paths.get(originfileName);
		String mimeType=Files.probeContentType(source);
		boolean mimeCheck=false;
		String[] validType={
				"image/jpeg",
				"image/gif",
				"image/bmp",
				"image/png",
				"application/vnd.ms-excel",
				"application/pdf",
				"application/vnd.ms-powerpoint",
				"application/msword",
				"application/haansoftdocx",
				"application/haansoftxls",
				"application/haansofthwp"
		}; //����Ÿ����� ���
		
		for(int i=0; i<validType.length; i++){ //���� ����Ÿ�԰� ����Ʈ�� ����Ÿ�԰� ��
		    if(validType[i].equals(mimeType)){
		    	mimeCheck=true;                // ������ true
		    	break;
		    }
		}
		return mimeCheck;
	}
	
	public static String getMimeType(String originfileName) throws IOException{
		
		Path source = Paths.get(originfileName);
		String mimeType=Files.probeContentType(source);
		return mimeType;
	}
	
}
