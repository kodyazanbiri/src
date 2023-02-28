package Recursion;//sayı 3'e bölünebiliyormu programı:3'e bölünebilme kuralı sayı rakamlar toplamı 3'e bölünecektir

import java.util.Scanner;

public class Sample2 {

	public static void main(String[] args) {

		int number, total;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number:");
		number = scan.nextInt();
		
		total = SumOfDicits(number);
		System.out.println("sum of dicits:" + total);
	
		String DoİtDivide=((total%3)==0)? "Dividing":"not dividing";
		System.out.println("Is it divisible by 3? "+DoİtDivide);
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
