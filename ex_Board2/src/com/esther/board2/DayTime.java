package com.esther.board2;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DayTime {
	
	public void time() { //날짜보여주는 함수
		LocalDate now = LocalDate.now(); //현재날짜구하기
		System.out.print(" access time : "+now+"    "); //결과출력
		
		LocalTime nowT = LocalTime.now(); //현재시간구하기
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH시 mm분 ss초");
		//포멧정리하기
		String formatedNowT = nowT.format(formatter);
		//포멧적용
		System.out.println(formatedNowT); //결과출력
	}
	
	public String rnowtime() { //지금시간을 리턴하는 함수
		LocalDate now = LocalDate.now(); //현재날짜구하기
		String s = now+" "; //결과출력
		
		LocalTime nowT = LocalTime.now(); //현재시간구하기
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH시 mm분 ss초");
		//포멧정리하기
		String formatedNowT = nowT.format(formatter);
		//포멧적용
		String result = s + formatedNowT; //결과출력
		return result;
		
	}
	
//	LocalDateTime curDateTime = LocalDateTime.now();
//	LocalDate curDate = LocalDate.now();
//	LocalTime curTime = LocalTime.now();
//	
//	LocalDateTime targetDateTime = LocalDateTime.of(curDate, curTime);
//	
//	
//	public void time() {
//		System.out.println("접속시간:" + curDateTime);
////		System.out.println("   ");
////		System.out.println(targetDateTime);
//	}
//	public void date() {
//		LocalDate now = LocalDate.now();
//		System.out.println(now);
//	}

}
