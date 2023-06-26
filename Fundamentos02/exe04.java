package Fundamentos02;

import java.util.Scanner;

public class exe04 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
	System.out.println("Digite o número: ");
	int num = entrada.nextInt();
	
	int contPar = 0;
	int contImpar = 0;
	
    System.out.println("Pares: ");
	while(contPar < num) {
		if (contPar % 2 == 0) {
            System.out.println(contPar);
        }
		contPar++;
	}
	
    System.out.println("Impares: ");
	while(contImpar < num) {
		if (contImpar % 2 == 1) {
            System.out.println(contImpar);
        }
		contImpar++;
	}
	
	}

}
