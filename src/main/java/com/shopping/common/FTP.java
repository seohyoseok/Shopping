package com.shopping.common;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Properties;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.SftpException;

@Controller
public class FTP {

	/*
	 * @RequestMapping(value = "/ftpUpload.do", method = RequestMethod.GET)
	 * public String upload(Locale locale, Model model, HttpServletRequest
	 * request, HttpServletResponse response) {
	 * 
	 * try { String orignFileName = request.getParameter("upfile"); boolean
	 * mimeCheck; mimeCheck = MimeCheck.mimecheck(orignFileName);
	 * 
	 * if (mimeCheck == true) { String fileName = orignFileName.substring(0,
	 * orignFileName.indexOf(".")); String ext =
	 * orignFileName.substring(orignFileName.indexOf(".") + 1);
	 * System.out.println("원래 이름 :" + orignFileName); FTPCommon.connectFtp();
	 * FTPCommon.uploadFtp(fileName); FTPCommon.disconnectFtp(); } else {
	 * response.setCharacterEncoding("EUC-KR"); PrintWriter writer =
	 * response.getWriter(); writer.println("<script type='text/javascript'>");
	 * writer.println("alert('허용하지 않는 확장자입니다');");
	 * writer.println("history.back();"); writer.println("</script>");
	 * writer.flush(); } } catch (IOException e) {
	 * 
	 * e.printStackTrace(); }
	 * 
	 * return "/front/home"; }
	 */

	@RequestMapping(value = "/ftpUpload.do", method = RequestMethod.POST)
	public String upload2(HttpServletRequest request, HttpServletResponse reponse) throws IOException {

		FileUpload.upload(request,reponse);
		
		return "/front/home";

	}
}
