package Aula8_Repeticao;

/*
 * Suponha que voc� � um programador e quer saber se entre os n�meros 1
 * e um milh�o existe um n�mero que � m�ltiplo de 17 e 19, ao mesmo tempo
 * Ou seja, queremos saber se existe um n�mero entre 1 e um milh�o que
 * deixa resto 0 na divis�o por 17 e por 19. Caso existe, imprima o menor.
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
		System.out.println("Tempo de execu��o em milisegundos: " + (System.currentTimeMillis() - i));
		
		System.out.println("\n\ncom o uso do BREAK!!! \n");
		
		i = System.currentTimeMillis();
		for(int count = 1; count <1000000; count++) {
			if((count % 17 == 0) && (count % 19 == 0)) {
				System.out.println(count);
				break;
				
			}
		}
		System.out.println("Tempo de execu��o em milisegundos: " + (System.currentTimeMillis() - i));
	}
}
