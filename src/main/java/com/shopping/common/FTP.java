package com.shopping.common;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FTP {
	@RequestMapping(value = "/ftpUpload.do", method = RequestMethod.GET)
	public String upload(Locale locale, Model model, HttpServletRequest request, HttpServletResponse response) throws IOException {
	    
		String orignFileName=request.getParameter("upfile");
		boolean mimeCheck=MimeCheck.mimecheck(orignFileName);
		
	    if(mimeCheck==true){
	    	
	    	String fileName=orignFileName.substring(0, orignFileName.indexOf("."));
	    	
	    	String mimeType=MimeCheck.getMimeType(orignFileName);  //images/png
	    	int extIndex=mimeType.indexOf("/");
	    	String ext=mimeType.substring(extIndex+1); //Ȯ����
	    	
	    	System.out.println("�����̸�:"+fileName);
	    	System.out.println("Ȯ����:"+ext);
	    	
	    }else{
	    	 response.setCharacterEncoding("EUC-KR");
		     PrintWriter writer = response.getWriter();
		     writer.println("<script type='text/javascript'>");
		     writer.println("alert('������� �ʴ� Ȯ�����Դϴ�');");
		     writer.println("history.back();");
		     writer.println("</script>");
		     writer.flush();
	    }
		
		
		
	   
		return "/front/home";
	}
}
