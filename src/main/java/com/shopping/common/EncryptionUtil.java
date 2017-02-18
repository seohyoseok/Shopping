package com.shopping.common;

import java.security.MessageDigest;

public class EncryptionUtil {

	public static String getEncrypt(String txt) throws Exception{
		StringBuffer sb = new StringBuffer();
		
		MessageDigest digest= MessageDigest.getInstance("MD5");
		digest.update(txt.getBytes());
		
		byte[] mgstr=digest.digest();
		
		for(int i=0; i<mgstr.length; i++){
			String tmp = Integer.toHexString((int)mgstr[i] & 0x00ff );
			sb.append(tmp);
		}
		return sb.toString();
	}
	
}
