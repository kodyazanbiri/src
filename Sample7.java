package Recursion;//kullanýcýdan kaç tane a harfini yan yana yazmak istediði bilgisini alýn ve girilen sayý kadar a harfini yan yana yazýn

import java.util.Scanner;

public class Sample7 {

	public static void main(String[] args) {
		
		int sayi;
		String hesaplanan="";
		
		System.out.println("sayý:");
		Scanner scan=new Scanner(System.in);
		sayi=scan.nextInt();
		
		hesaplanan=islem(sayi);
		System.out.println(hesaplanan);

	}
	public static String islem(int sayi) {
		if(sayi==1)
			return "a";
		else
			return "a"+islem(sayi-1);
	}

}
