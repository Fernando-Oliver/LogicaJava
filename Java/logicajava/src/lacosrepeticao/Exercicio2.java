package lacosrepeticao;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n, soma1=0, soma2 = 0;
		
		for(int i = 1; i <= 10; i++) {
			
			System.out.println("Entre com um valor: ");
			n = sc.nextInt();
			
			if(n%2==0) {
				soma1 ++;
			}
			else {
				soma2 ++;
			}
		}
		
		System.out.println("Quantidade de Números Pares: "+soma1);
		System.out.println("Quantidade de Números Impar: "+soma2);
		sc.close();
	}

}
