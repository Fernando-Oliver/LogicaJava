package lacosrepeticao;

import java.util.Scanner;
import java.util.Locale;

public class Exercicio6 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
        int n, soma=0,cont=0;
        double media=0;
		
        do {
        	System.out.println("Digite um Valor: ");
        	n = sc.nextInt();
        	
        	if(n%3==0) {
        		System.out.println(n);
        		soma += n;
        		cont++;
        	}
        	
        }while(n!=0);
        
        media = soma /cont;
        System.out.printf("Quantidade de Números Múltiplos por Três: %d, Valor total dos Múltiplos: %d, Média dos Múltiplos: %.1f",cont,soma,media);
        sc.close();
	}

}
