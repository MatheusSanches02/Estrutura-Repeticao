package Aula8_Repeticao;

public class ExercicioProposto1While {

	public static void main(String[] args) {
		
		int numero = 1;
		
		while(numero <= 100) 
		{
			numero = numero + 1;
			if (numero % 2 == 0) 
			{
				
				System.out.println(numero);
			}
		}

	}

}
