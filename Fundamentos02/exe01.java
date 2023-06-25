package Fundamentos02;

import java.util.Scanner;

public class exe01 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quantos alunos tem na sua sala?");
		int alunos = entrada.nextInt();
		
		double somaNota = 0;
		int cont = 0;
		while (cont < alunos) {
			System.out.println("Digite a nota do " + (cont+1) + "° aluno");
			double nota = entrada.nextInt();
			
			somaNota += nota;
			cont++;
		}
		
		double media = somaNota / alunos; 
		System.out.println("A media da turma é: " + media);
	}

}
