package Aula8_Repeticao;

import java.util.Scanner;

public class ExercicioProposto2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int num1, num2, num3, num4, num5, num6;
		int  soma = 0;
		int positivos = 0;
		float media;
		
		System.out.println("Numero Inteiro: ");
		num1 = input.nextInt();
		System.out.println("Numero Inteiro: ");
		num2 = input.nextInt();
		System.out.println("Numero Inteiro: ");
		num3 = input.nextInt();
		System.out.println("Numero Inteiro: ");
		num4 = input.nextInt();
		System.out.println("Numero Inteiro: ");
		num5 = input.nextInt();
		System.out.println("Numero Inteiro: ");
		num6 = input.nextInt();
		
		while(num1 > 0) 
		{
			soma = soma + num1;
			positivos = positivos + 1;
			break;
	
		}
		while(num2 > 0) 
		{
			soma = soma + num2;
			positivos = positivos + 1;
			break;
		}
		while(num3 > 0) 
		{
			soma = soma + num3;
			positivos = positivos + 1;
			break;
		}
		while(num4 > 0) 
		{
			soma = soma + num4;
			positivos = positivos + 1;
			break;
		}
		while(num5 > 0) 
		{
			soma = soma + num5;
			positivos = positivos + 1;
			break;
		}
		while(num6 > 0) 
		{
			soma = soma + num6;
			positivos = positivos + 1;
			break;
		}
		System.out.println("A soma dos numeros positivos é: " + soma);
		System.out.println("A quantidade de numeros positivos é: " + positivos);
		media = soma / positivos;
		System.out.println("A media dos numeros positivos é: " + media);
		
		
	}

}
