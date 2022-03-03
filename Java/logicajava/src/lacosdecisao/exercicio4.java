package lacosdecisao;

import java.util.Scanner;
import java.util.Locale;

public class exercicio4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n1; 
		double valor;
		
		System.out.println("Entre com o Valor");
		n1 =sc.nextInt();
		
		if(n1%2==0) {
			
			valor = Math.sqrt(n1);
			System.out.println("Número PAR");
			System.out.printf("Raiz Quadrada de %d é %.2f",n1,valor);
		}
		
		else {
			valor = Math.pow(n1, 2);
			System.out.println("Número impar");
			System.out.printf("%d Elevado ao Quadrado é %.2f",n1,valor);
		}
		
		sc.close();

	}

}
