package Recursion;//B�R SAYININ RAKAMLAR TOPLAMINI BULMA:

import java.util.Scanner;

public class Sample1 {

	public static void main(String[] args) {
		
		int number,total;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		number=scan.nextInt();
		
		total=SumOfDicits(number);//say�y� SumOfDicits metoduna att�k,metoduda total de�i�kenine att�k yani say�n�n rakamlar toplam�n� total de�i�kenine att�k
		System.out.println(number+",sum of dicits:"+total);

	}
	
	public static int SumOfDicits(int number) {
		
		int result=0;
		
		while(number>0) {
			result=result+(number%10);
			number=number/10;
		}
		return result;
	}
}