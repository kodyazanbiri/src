package Recursion;    //bu �rnekte 2!=2 oldu�unu biliyoruz ve bizden fakt�riyel hesab� yapmamm�z� istiyor

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
			System.out.println("say�n�z ikiden k���k");

	}

	public static int factorial(int number) {

		if (number == 2)
			return 2;
		else
			return number * factorial(number - 1);
	}

}
