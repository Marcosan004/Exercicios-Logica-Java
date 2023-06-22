package Fundamentos;

import java.util.Scanner;

public class exe05 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite F para feminino e M para Masculino: ");
		String letra = entrada.nextLine();
		
		if (letra.equals("F") || letra.equals("f")){
			System.out.println("Feminino");
		}
		else if (letra.equals("M") || letra.equals("m")){
			System.out.println("Masculino");
		}
		else {
			System.out.println("Letra INVALIDA!");
		}

	}

}
