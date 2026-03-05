package Repaso;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("INGRESE N: ");
		int n = sc.nextInt();
		long factorial = 1;
		
		for (int i = 1; i <= n; i++) {
				factorial *= i;
		}
		System.out.println("EL FACTORIAL DE " + n + " es: " + factorial);
		sc.close();

	}

}
