package Number_04;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		Person[] array = new Person[5];
		
		System.out.println("�̸��� Ű�� �Է��ϼ��� ");
		
		for (int i = 0; i < array.length; i++) {
			array[i] = new Person();
			System.out.print("�̸� : ");
			array[i].name = input.next();
			System.out.print("Ű : ");
			array[i].height = input.nextInt();
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("�̸� : " + array[i].name + " " + "Ű : " + array[i].height);
		}
		
		System.out.println(array[0].getMaximum(array));
	}

}
