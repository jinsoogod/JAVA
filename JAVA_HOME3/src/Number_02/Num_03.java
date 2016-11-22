package Number_02;

import java.util.Calendar;

/*
 * 	어제날짜를 구하기 위한 프로그램
 * */

public class Num_03 {

	public static void main(String[] args) {
		
		 Calendar calendar = Calendar.getInstance();   
		 
		 //1월은 0으로 표시되기 때문에 +1
		 calendar.add(Calendar.MONTH, 1);
		 //어제를 나타내기위에 하루를 뺌
		 calendar.add(Calendar.DATE, -1);
		
	
		 System.out.println("어제의 날짜 : " + calendar.get(Calendar.YEAR)+"-"+ calendar.get(Calendar.MONTH)+"-"+calendar.get(Calendar.DATE));
	}

}
