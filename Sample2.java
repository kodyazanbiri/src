package Recursion;//say� 3'e b�l�nebiliyormu program�:3'e b�l�nebilme kural� say� rakamlar toplam� 3'e b�l�necektir

import java.util.Scanner;

public class Sample2 {

	public static void main(String[] args) {

		int number, total;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number:");
		number = scan.nextInt();
		
		total = SumOfDicits(number);
		System.out.println("sum of dicits:" + total);
	
		String Do�tDivide=((total%3)==0)? "Dividing":"not dividing";
		System.out.println("Is it divisible by 3? "+Do�tDivide);
	}

	public static int SumOfDicits(int number) {
		int result = 0;
		while (number > 0) {
			result = result + (number % 10);
			number = number / 10;
		}
		return result;

	}

}
