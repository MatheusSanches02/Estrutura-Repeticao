package Aula8_Repeticao;

public class ExemploPraticoRepeticao1 {

	public static void main(String[] args) {
		
		double salario = 1000.0;
		System.out.println("Sal�rio inicial: R$" + salario);
		
		while(salario < 5000) 
		{
			salario = salario + (salario * 0.1);
			//System.out.println("Sal�rio: R$" + salario);
			System.out.printf("/n Sal�rio: R$ %.2f", salario);
		}
	}

}
