package com.shopping.common;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
/* 2017 02 08 마임타입 체크 추가 서효석 */
public class MimeCheck {
    
	
	public static boolean mimecheck(String originfileName) throws IOException{
		
		/* 마임타입체크 (자바7 버전이후로 존재하는 마임타입 검사 방법)*/
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
		}; //마임타입허용 목록
		
		for(int i=0; i<validType.length; i++){ //웹의 마임타입과 리스트의 마입타입과 비교
		    if(validType[i].equals(mimeType)){
		    	mimeCheck=true;                // 맞으면 true
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
