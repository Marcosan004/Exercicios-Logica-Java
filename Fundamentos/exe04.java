package Fundamentos;

import java.util.Scanner;

public class exe04 {

		public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in);
			
			System.out.println("Digite a primeira nota: ");
			float n1 = entrada.nextFloat();
			
			System.out.println("Digite a segunda nota: ");
			float n2 = entrada.nextFloat();
		
			float media = (n1 + n2) /2;
			
			System.out.println("A sua media é: " + media);
	}

}
