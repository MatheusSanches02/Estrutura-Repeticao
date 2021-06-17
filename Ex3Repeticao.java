package Aula8_Repeticao;

import java.util.Scanner;

public class Ex3Repeticao {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int senhaPadrao = 12345;
		int senha;
		
		for(int i = 1; i <=3; i++) 
		{
			System.out.println("Senha: ");
			senha = input.nextInt();
			if(senha == senhaPadrao) 
			{
				System.out.println("Senha valida!");
				break;
			}
			else 
			{
				System.out.println("Senha invalida!");
			}
		}

	}

}
