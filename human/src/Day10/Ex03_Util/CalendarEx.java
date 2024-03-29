package Day10.Ex03_Util;

import java.util.Calendar;

public class CalendarEx {
	
	public static void main(String[] args) {
		// Calendar : 날짜 및 시간을 다루는 클래스
		
		Calendar calendar = Calendar.getInstance();	//new키워드로 객체생성안하고, getInstance메소드를 가져와서 생성
		System.out.println("오늘 날짜");
		System.out.print(calendar.get(Calendar.YEAR) + "년"); 		// 4자리의 년도
		System.out.print(calendar.get(Calendar.MONTH) +1 + "월"); 	// 월(0~11) / 0부터여서 +1
		System.out.print(calendar.get(Calendar.DATE) + "일"); 		// 일(1~31)
		System.out.println();
	 
		System.out.println("현재 시간");
		System.out.print(calendar.get(Calendar.HOUR) + "시"); 		//
		System.out.print(calendar.get(Calendar.MINUTE) + "분"); 	//
		System.out.print(calendar.get(Calendar.SECOND) + "초"); 	//
		
		
	}
	
}