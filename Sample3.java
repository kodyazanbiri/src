package Recursion;//FACTORÝAL METODUYLA FAKTÖRÝYEL HESAPLAMA:(recursion(özyinelemeli metodlar))

public class Sample3 {

	public static void main(String[] args) {
		
		int total=factorial(5);
		System.out.println(total);

	}
	public static int factorial(int n) {
		if(n==0)
			return 1;
		else
			return n*factorial(n-1); //RECURSION metodu=fonksiyon kendi içinde sürekli çaðýrýlýr
	}

}
//NOT:Faktöriyel Hesaplamak için while ve for döngüsüyle yapýmý:

/*WHÝLE ile yapýmý---------------
 * 
int i=5;
int sonuc=1;

while(i>0) {
  sonuc*=i;
	i--;
}
System.out.println(sonuc);	*/



/*FOR ile yapýmý-----------------
 * 
 * public static void main(String[] args) {

		int sonuc = deger(5);
		System.out.println(sonuc);
	}

	public static int deger(int x) {

		int sonuc = 1;
		for (int i = 1; i <= 5; i++) {
			sonuc *= i;
		}
		return sonuc;
	}
}  */