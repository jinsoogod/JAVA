package Number_04;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		Person[] array = new Person[5];
		
		System.out.println("이름과 키를 입력하세요 ");
		
		for (int i = 0; i < array.length; i++) {
			array[i] = new Person();
			System.out.print("이름 : ");
			array[i].name = input.next();
			System.out.print("키 : ");
			array[i].height = input.nextInt();
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("이름 : " + array[i].name + " " + "키 : " + array[i].height);
		}
		
		System.out.println(array[0].getMaximum(array));
	}

}
