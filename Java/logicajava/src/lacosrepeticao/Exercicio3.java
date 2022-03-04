package lacosrepeticao;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int idade, total1=0,total2=0;
        
        System.out.println("Digite a idade:" );
    	idade = sc.nextInt();
        
    	while(idade !=-99) {
        	
    		if(idade <=21) {
    			total1++;
    		}else if (idade > 50) {
    			total2++;
    		}
    		
        	System.out.println("Digite a idade:" );
        	idade = sc.nextInt();
        }
    	
    	System.out.println("Total de Pessoas com Menos de 21 Anos: "+total1);
    	System.out.println("Total de Pessoas com Mais de 50 Anos: "+total2);
	    sc.close();
	}

}
