package Recursion; //kullan�c�dan ka� tane say�y� yan yana yazmak istedi�i bilgisini al�p say�lar� geriye doru s�f�ra kadar yan yana yaz
                  //recursion ile yap

import java.util.Scanner;

public class Sample6 {

	public static void main(String[] args) {
		
		int number;
		String toplam="";
		
		Scanner scan=new Scanner(System.in);
		System.out.println("ka� say� yan yana yaz�ls�n:");
		number=scan.nextInt();
		
		 toplam=say�lar(number);
		System.out.println("birle�tirme i�leminin sonucu:"+toplam);
		

	}
	public static String say�lar(int number) {
		if(number==1)
			return "10";
		else
			return number+say�lar(number-1); //recursion ile
	}
	

}
