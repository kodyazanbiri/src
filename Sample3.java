package Recursion;//FACTOR�AL METODUYLA FAKT�R�YEL HESAPLAMA:(recursion(�zyinelemeli metodlar))

public class Sample3 {

	public static void main(String[] args) {
		
		int total=factorial(5);
		System.out.println(total);
		System.out.println("merhaba");

	}
	public static int factorial(int n) {
		if(n==0)
			return 1;
		else
			return n*factorial(n-1); //RECURSION metodu=fonksiyon kendi i�inde s�rekli �a��r�l�r
	}

}
//NOT:Fakt�riyel Hesaplamak i�in while ve for d�ng�s�yle yap�m�:

/*WH�LE ile yap�m�---------------
 * 
int i=5;
int sonuc=1;

while(i>0) {
  sonuc*=i;
	i--;
}
System.out.println(sonuc);	*/



/*FOR ile yap�m�-----------------
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