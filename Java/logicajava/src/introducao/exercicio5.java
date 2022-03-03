package introducao;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		
		int n1, n2, n3, p1=2, p2=3, p3=5;
        double soma;
        Scanner ler = new Scanner(System.in);
        
		System.out.print("Digite a nota 1: ");
		n1 = ler.nextInt();
		System.out.print("Digite a nota 2: ");
		n2 = ler.nextInt();
		System.out.print("Digite a nota 3: ");
		n3 = ler.nextInt();
		
	    soma = (n1 + n2 + n3) /(p1 + p2 + p3);
	    
	    System.out.print("Média da Nota: "+soma);
	    
	    ler.close();
	}

}
