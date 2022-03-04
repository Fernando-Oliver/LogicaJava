package lacosrepeticao;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n, soma=0;
		
		do {
		
			System.out.println("Digite um Número:");
		    n = sc.nextInt();
		    soma+=n;
		
		}
		while(n!=0);
		
		System.out.println("Valor Total: "+soma);
		
		sc.close();
	}

}
