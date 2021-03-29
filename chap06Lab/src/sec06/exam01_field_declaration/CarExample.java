package sec06.exam01_field_declaration;

import java.util.Scanner;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		System.out.println("제조사: " + myCar.company);
		System.out.println("모델명: " + myCar.model);
		System.out.println("색깔: " + myCar.color);
		System.out.println("최고속력: " + myCar.maxSpeed);
		System.out.println("현재속력: " + myCar.speed);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("\n========\n속도변경: ");
		myCar.speed = sc.nextInt();
		System.out.println("바뀐 현재속력: " + myCar.speed);
		
		sc.close();
	}

}
