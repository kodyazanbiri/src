package Recursion; //bir kenar�n�n uzunlu�u girilen say�n�n bir eksi�i kadar olan dikd�rgen yaz 

import java.util.Scanner;

public class Sample8 {

	public static void main(String[] args) {
		
		int number;
		String account="";
		
		System.out.println("say�:");
		Scanner scan=new Scanner(System.in);
		number=scan.nextInt();
		
		account=islem(number);
		System.out.println(account);

	}
	public static String islem(int number) {
		if(number==1)
			return "";
		else
			return "aaaa\n"+islem((number-1));

	}

}
