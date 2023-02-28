package Recursion;//BİR SAYININ RAKAMLAR TOPLAMINI BULMA:

import java.util.Scanner;

public class Sample1 {

	public static void main(String[] args) {
		
		int number,total;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		number=scan.nextInt();
		
		total=SumOfDicits(number);//sayıyı SumOfDicits metoduna attık,metoduda total değişkenine attık yani sayının rakamlar toplamını total değişkenine attık
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