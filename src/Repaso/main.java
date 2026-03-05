package Repaso;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("INGRESE N: ");
		int n = sc.nextInt();
		int suma = 0;
		
		for (int i = 1; i <= n; i++) {
			if (i % 4 == 0 ) {
				suma += i;
			}
		}
		System.out.println("LA SUMA DE DIVISIBLES ENTRE 4 ES: ");
		sc.close();

	}

}
