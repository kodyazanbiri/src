package Recursion;//g�nderilen paremetreye kadar olan say�lar� toplayan bir recursion metod yaz

public class Sample10 {

	public static void main(String[] args) {

		System.out.println(value(5));

	}

	public static int value(int x) {
		if (x == 0)
			return 0;
		else
			return (x + value(x - 1)); // recursion ile fonk kendini s�rekli �a��r�r
	}

}
