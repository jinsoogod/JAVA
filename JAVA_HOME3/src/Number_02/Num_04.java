package Number_02;

import java.util.Arrays;

/*
 * 배열을 정렬하는 프로그램
 * */
public class Num_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double[] darray = {1.23, 1.5234, 1.111, 1.125, 1.6745, 1.9790, 1.23678, 1.3534};
		
		Arrays.sort(darray);
		
		for (int i = 0; i < darray.length; i++) {
			System.out.println(darray[i]);
		}
		
		
	}

}
