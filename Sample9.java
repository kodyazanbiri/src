package Recursion;//Basamak deðerlerini toplama iþlemini özyinelemeli olarak kodlayýnýz

import java.util.Scanner;

public class Sample9 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = scan.nextInt();

		int account = SumOfDicits(number);
		System.out.println(account);

	}

	public static int SumOfDicits(int number) {
		
		if(number<10) 
			return number;
		
		else
			return SumOfDicits(number/10)+SumOfDicits(number%10); //recursion ile
	}
}