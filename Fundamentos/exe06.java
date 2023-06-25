package Fundamentos;

import java.util.Scanner;

public class exe06 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		int cont = 0;
		
		System.out.println("Telefonou para a vitima?");
		char resp1 = entrada.next().charAt(0);
		if (resp1 == 's') {
			cont ++;
		}
		
		System.out.println("Esteve no local do crime?");
		char resp2 = entrada.next().charAt(0);
		if (resp2 == 's') {
			cont++;
		}
		
		System.out.println("Mora perto da vitima?");
		char resp3 = entrada.next().charAt(0);
		if (resp3 == 's') {
			cont++;
		}
		
		System.out.println("Devia para a vitima?");
		char resp4 = entrada.next().charAt(0);
		if (resp4 == 's') {
			cont++;
		}
		
		System.out.println("Ja trabalhou com a vitima?");
		char resp5 = entrada.next().charAt(0);
		if (resp5 == 's') {
			cont++;
		}

		if (cont == 2) {
			System.out.println("Suspeito");
		}
		else if (cont == 3 || cont == 4) {
			System.out.println("Cumplice");
		}
		else if (cont == 5) {
			System.out.println("Assasino");
		}
		else {
			System.out.println("Inocente");
		}
	}

}
