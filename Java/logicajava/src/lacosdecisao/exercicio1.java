package lacosdecisao;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n1, n2,n3;
		
		System.out.println("Entre com o Primeiro N�mero");
		n1 =sc.nextInt();
		System.out.println("Entre com o Segundo N�mero");
		n2 =sc.nextInt();
		System.out.println("Entre com o Terceiro N�mero");
		n3 =sc.nextInt();
		
		if(n1 > n2 && n1 >n3) {
			System.out.println("Maior N�mero"+n1);
		}
		else if(n2 >n3) {
			System.out.println("Maior N�mero"+n2);
		}
		else{
			System.out.println("Maior N�mero"+n3);
		}

		sc.close();
	}

}
