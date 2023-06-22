package Fundamentos;

import java.util.Scanner;

public class exe02 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);

		System.out.println("Digite N1: ");
		int n1 = entrada.nextInt();
		
		System.out.println("Digite N2: ");
		int n2 = entrada.nextInt();
		
		System.out.println("Digite N3: ");
		int n3 = entrada.nextInt();
		
		int maior = n1;
		int menor = n1;
		
		if (n2 > maior) {
			maior = n2;
		}
		if (n3 > maior){
			maior = n3;
		}
		System.out.println("O número maior é: " + maior);
		
		if (n2 < menor) {
			menor = n2;
		}
		if (n3 < menor){
			menor = n3;
		}
		System.out.println("O número menor é: " + menor);
		
	}

}
