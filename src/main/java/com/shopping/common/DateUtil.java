package com.shopping.common;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {

	/* 현재 분기 정보 반환 */
	public static int getCurrentQuarter() {
		int quarter = 0; // 1~3: 1분기 , 4~6: 2분기 , 7~9: 3분기, 10~12:4분기
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

	/* 현재 년도 반환 */
	public static int getCurrentYear() {
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		return year;
	}

	/* 현재 달정보 반환 */
	public static int getCurrentMonth() {
		Calendar cal = Calendar.getInstance();
		int month = cal.get(Calendar.MONTH) + 1;
		return month;
	}

	/* 현재 일정보 반환 */
	public static int getCurrentDate() {
		Calendar cal = Calendar.getInstance();
		int day = cal.get(Calendar.DATE);
		return day;
	}
	
	/*
	 *   yyyy-MM-dd 가운데 MM은 무조건 대문자 이어야함
	 *   yyyy-MM-dd hh:mm:ss a => 2009-09-19 03:49:43 오후 
	 *   SimpleDateFormat 사용법
	 *   http://everlikemorning.tistory.com/entry/SimpleDateFormat-%ED%8C%A8%ED%84%B4%EB%B0%8F-%EC%82%AC%EC%9A%A9%EC%98%88%EC%A0%9C
	 *   
	 */
	public static String getFormatData(String format){
		SimpleDateFormat sdf=new SimpleDateFormat(format);
		String f = sdf.format(new Date());
		return f;
	}

}
