package Number_02;

import java.util.Calendar;

/*
 * 	������¥�� ���ϱ� ���� ���α׷�
 * */

public class Num_03 {

	public static void main(String[] args) {
		
		 Calendar calendar = Calendar.getInstance();   
		 
		 //1���� 0���� ǥ�õǱ� ������ +1
		 calendar.add(Calendar.MONTH, 1);
		 //������ ��Ÿ�������� �Ϸ縦 ��
		 calendar.add(Calendar.DATE, -1);
		
	
		 System.out.println("������ ��¥ : " + calendar.get(Calendar.YEAR)+"-"+ calendar.get(Calendar.MONTH)+"-"+calendar.get(Calendar.DATE));
	}

}
