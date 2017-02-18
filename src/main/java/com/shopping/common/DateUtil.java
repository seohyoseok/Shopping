package com.shopping.common;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {

	/* ���� �б� ���� ��ȯ */
	public static int getCurrentQuarter() {
		int quarter = 0; // 1~3: 1�б� , 4~6: 2�б� , 7~9: 3�б�, 10~12:4�б�
		int month = getCurrentMonth();
		if (month < 4) { // 1,2,3
			quarter = 1;
		} else if (month > 3 && month < 7) {
			quarter = 2;
		} else if (month > 6 && month < 10) {
			quarter = 3;
		} else if (month > 9) {
			quarter = 4;
		}
		return quarter;
	}

	/* ���� �⵵ ��ȯ */
	public static int getCurrentYear() {
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		return year;
	}

	/* ���� ������ ��ȯ */
	public static int getCurrentMonth() {
		Calendar cal = Calendar.getInstance();
		int month = cal.get(Calendar.MONTH) + 1;
		return month;
	}

	/* ���� ������ ��ȯ */
	public static int getCurrentDate() {
		Calendar cal = Calendar.getInstance();
		int day = cal.get(Calendar.DATE);
		return day;
	}
	
	/*
	 *   yyyy-MM-dd ��� MM�� ������ �빮�� �̾����
	 *   yyyy-MM-dd hh:mm:ss a => 2009-09-19 03:49:43 ���� 
	 *   SimpleDateFormat ����
	 *   http://everlikemorning.tistory.com/entry/SimpleDateFormat-%ED%8C%A8%ED%84%B4%EB%B0%8F-%EC%82%AC%EC%9A%A9%EC%98%88%EC%A0%9C
	 *   
	 */
	public static String getFormatData(String format){
		SimpleDateFormat sdf=new SimpleDateFormat(format);
		String f = sdf.format(new Date());
		return f;
	}

}
