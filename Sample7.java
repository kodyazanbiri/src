package Recursion;//kullan�c�dan ka� tane a harfini yan yana yazmak istedi�i bilgisini al�n ve girilen say� kadar a harfini yan yana yaz�n

import java.util.Scanner;

public class Sample7 {

	public static void main(String[] args) {
		
		int sayi;
		String hesaplanan="";
		
		System.out.println("say�:");
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
