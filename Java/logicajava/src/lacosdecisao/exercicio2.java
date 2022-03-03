package lacosdecisao;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n1, n2,n3;

		System.out.println("Entre com o Primeiro Número");
		n1 =sc.nextInt();
		System.out.println("Entre com o Segundo Número");
		n2 =sc.nextInt();
		System.out.println("Entre com o Terceiro Número");
		n3 =sc.nextInt();
		
		if (n1 < n2 && n2 < n3) {
			System.out.printf("Ordem Crescente %d, %d, %d",n1,n2,n3);
			}
		else if (n1 < n3 && n3 < n2){
			System.out.printf("Ordem Crescente %d, %d, %d",n1,n3,n2);
			}
		else if (n2 < n1 && n1 < n3) {
			System.out.printf("Ordem Crescente %d, %d, %d",n2,n1,n3);
		    }
		else if(n2 < n3 && n3 < n1) {
			System.out.printf("Ordem Crescente %d, %d, %d",n2,n3,n1);
		}
		else if (n3 < n1 && n3 < n2) {
			System.out.printf("Ordem Crescente %d, %d, %d",n3,n1,n2);
		}
		else {   // n3 < n2 && n2 < n1
			System.out.printf("Ordem Crescente %d, %d, %d",n3,n2,n1);
		}
		
		sc.close();
	}

}
