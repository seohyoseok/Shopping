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

	/* sftp ���� */
	public static void connectFtp() {
		Session ses = null; // ���Ӱ���
		Channel ch = null; // ����
		JSch jsch = new JSch(); // jsch ��ü�� ����

		try {
			// ���� ��ü�� ����(����� �̸�, ������ ȣ��Ʈ, ��Ʈ)
			ses = jsch.getSession(FTP_ID, FTP_IP, FTP_PORT);
			// ��й�ȣ ����
			ses.setPassword(FTP_PW);

			// ���ǰ� ���õ� ������ ����
			Properties p = new Properties();

			// ȣ��Ʈ ������ �˻����� ����
			p.put("StrictHostKeyChecking", "no");
			ses.setConfig(p);

			System.out.println("������");

			// ����
			ses.connect();

			// ä���� ����(sftp)
			ch = ses.openChannel("sftp");

			// ä�ο� ����(sftp)
			ch.connect();

			// ä���� FTP�� ä�� ��ü�� ������
			chSftp = (ChannelSftp) ch;
            System.out.println("����Ϸ�");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/* sftp ���� */
	public static void disconnectFtp() {
		try {
			chSftp.quit(); // Sftp ���� ����
			System.out.println("FTP ������ �����մϴ�.");
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

	/* ���� ���ε� */
	public static void uploadFtp(String filename) {
        System.out.println("���� ��������");
		String filePath = "C:/Users/seo/Desktop/"+filename;
		System.out.println("filePath:"+filePath);
	    										
		File file = new File(filePath); // file ��ü ���� (���� ��� �Է�)
		try {
			fi = new FileInputStream(file);
			chSftp.cd("/"); // ������ ���
			chSftp.put(fi, file.getName()); // ������ ���� ������
			System.out.println("���Ϻ��� �Ϸ�");
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
