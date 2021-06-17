package Aula8_Repeticao;

import java.util.Scanner;

public class ExemploPraticoRepeticao4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int num;
		
		do 
		{
			System.out.println("Digit um numero entre 1 e 5: ");
			num = input.nextInt();
			System.out.println("Numero digitado: " + num);
		}while (num < 1 || num > 5);
		

	}

}
