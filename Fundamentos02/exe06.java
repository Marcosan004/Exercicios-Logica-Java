package Fundamentos02;

import java.util.Scanner;

public class exe06 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		for(int i = 0;i < 101; i++) {
			if (i < 50 && i < 60) {
				continue;
			}	
			System.out.println(i);
		}

	}

}
