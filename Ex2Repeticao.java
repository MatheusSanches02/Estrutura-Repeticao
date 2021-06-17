package Aula8_Repeticao;

import java.util.Scanner;

public class Ex2Repeticao {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int numero1;
		
		System.out.println("Digite um numero inteiro maior que '1': ");
		numero1 = input.nextInt();
		
		for(int i=1; i < numero1; i++ ) 
		{
			if(i%2 != 0) 
			{
				System.out.println("O numero de impares é: " + i);
			}
		}

	}

}
