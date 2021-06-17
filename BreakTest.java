package Aula8_Repeticao;

/*
 * Suponha que você é um programador e quer saber se entre os números 1
 * e um milhão existe um número que é múltiplo de 17 e 19, ao mesmo tempo
 * Ou seja, queremos saber se existe um número entre 1 e um milhão que
 * deixa resto 0 na divisão por 17 e por 19. Caso existe, imprima o menor.
 * */
public class BreakTest {
	public static void main(String[] args) {
		long i = System.currentTimeMillis();
		
		boolean imprimir = true;
		for(int count = 1; count < 1000000; count++) {
			if((count % 17 == 0) && (count % 19 == 0)) {
				if(imprimir) {
					System.out.println(count);
					imprimir = false;
				}
			}
		}
		System.out.println("Tempo de execução em milisegundos: " + (System.currentTimeMillis() - i));
		
		System.out.println("\n\ncom o uso do BREAK!!! \n");
		
		i = System.currentTimeMillis();
		for(int count = 1; count <1000000; count++) {
			if((count % 17 == 0) && (count % 19 == 0)) {
				System.out.println(count);
				break;
				
			}
		}
		System.out.println("Tempo de execução em milisegundos: " + (System.currentTimeMillis() - i));
	}
}
