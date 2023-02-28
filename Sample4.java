package Recursion; //bu örnekte 2!=2 olduðunu biliyoruz ve bizden faktöriyel hesabý yapmammýzý istiyor

import java.util.Scanner;

public class Sample4 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number:");
		int number = scan.nextInt();

		if (number > 2) {
			int total = factorial(number);
			System.out.println(total);
		} else
			System.out.println("sayýnýz ikiden küçük");

	}

	public static int factorial(int number) {

		if (number == 2)
			return 2;
		else
			return number * factorial(number - 1);
	}

}
