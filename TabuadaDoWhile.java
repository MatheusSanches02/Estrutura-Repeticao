package Aula8_Repeticao;

import java.util.Scanner;

public class TabuadaDoWhile {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int num, multi;
		int cont = 0;
		do
		{
		System.out.println("Qual numero voce quer saber a tabuada? ");
		num = input.nextInt();
		}while(num <=2 || num >=1000);
		do 
		{
			cont = cont + 1;
			multi = cont * num;
			System.out.println(num + " x " + cont + " = " + multi);
		}while(cont < 10);

	}

}
