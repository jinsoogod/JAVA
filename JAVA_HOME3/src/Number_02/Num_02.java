package Number_02;

/*
 *  문자열 나누는 프로그램
 * */
public class Num_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String string = "By doubting we come at the truth";
		String[] Value = string.split(" ");
		
		for (int i = 0; i < Value.length; i++) {
			System.out.println(Value[i]);
		}
	}

}
