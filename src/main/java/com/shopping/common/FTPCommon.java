package com.shopping.common;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.SftpException;

public class FTPCommon {
	protected static String FTP_IP = "192.168.0.24";
	protected static int FTP_PORT = 22;
	protected static String FTP_ID = "admin";
	protected static String FTP_PW = "admin";
	protected static String FTP_PATH = "";
	static ChannelSftp chSftp = null;
	static FileInputStream fi = null;

	/* sftp 연결 */
	public static void connectFtp() {
		Session ses = null; // 접속계정
		Channel ch = null; // 접속
		JSch jsch = new JSch(); // jsch 객체를 생성

		try {
			// 세션 객체를 생성(사용자 이름, 접속할 호스트, 포트)
			ses = jsch.getSession(FTP_ID, FTP_IP, FTP_PORT);
			// 비밀번호 설정
			ses.setPassword(FTP_PW);

			// 세션과 관련된 정보를 설정
			Properties p = new Properties();

			// 호스트 정보를 검사하지 않음
			p.put("StrictHostKeyChecking", "no");
			ses.setConfig(p);

			System.out.println("연결중");

			// 접속
			ses.connect();

			// 채널을 오픈(sftp)
			ch = ses.openChannel("sftp");

			// 채널에 연결(sftp)
			ch.connect();

			// 채널을 FTP용 채널 객체로 개스팅
			chSftp = (ChannelSftp) ch;
            System.out.println("연결완료");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/* sftp 끈기 */
	public static void disconnectFtp() {
		try {
			chSftp.quit(); // Sftp 연결 종료
			System.out.println("FTP 연결을 종료합니다.");
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

	/* 파일 업로드 */
	public static void uploadFtp(String filename) {
        System.out.println("파일 보내는중");
		String filePath = "C:/Users/seo/Desktop/"+filename;
		System.out.println("filePath:"+filePath);
	    										
		File file = new File(filePath); // file 객체 생성 (파일 경로 입력)
		try {
			fi = new FileInputStream(file);
			chSftp.cd("/"); // 서버의 경로
			chSftp.put(fi, file.getName()); // 서버에 파일 보내기
			System.out.println("파일보냄 완료");
		} catch (SftpException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				fi.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
