package Recursion; //bir kenarýnýn uzunluðu girilen sayýnýn bir eksiði kadar olan dikdörgen yaz 

import java.util.Scanner;

public class Sample8 {

	public static void main(String[] args) {
		
		int number;
		String account="";
		
		System.out.println("sayý:");
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
