package Recursion; //kullanýcýdan kaç tane sayýyý yan yana yazmak istediði bilgisini alýp sayýlarý geriye doru sýfýra kadar yan yana yaz
                  //recursion ile yap

import java.util.Scanner;

public class Sample6 {

	public static void main(String[] args) {
		
		int number;
		String toplam="";
		
		Scanner scan=new Scanner(System.in);
		System.out.println("kaç sayý yan yana yazýlsýn:");
		number=scan.nextInt();
		
		 toplam=sayýlar(number);
		System.out.println("birleþtirme iþleminin sonucu:"+toplam);
		

	}
	public static String sayýlar(int number) {
		if(number==1)
			return "10";
		else
			return number+sayýlar(number-1); //recursion ile
	}
	

}
