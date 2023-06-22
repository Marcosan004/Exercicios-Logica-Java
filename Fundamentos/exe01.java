package Fundamentos;

import java.util.Scanner;

public class exe01 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

	System.out.println("Digite um valor para verificar se é positivo ou negativo: ");
	float valor = entrada.nextFloat();
	if (valor > 0) {
		System.out.println(valor + " É positivo!");
	}
	else {
		System.out.println(valor + " É negativo!");
	}
	
	
		
	}

}
