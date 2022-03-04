package lacosrepeticao;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
    Scanner sc = new Scanner(System.in);
		int idade;
		char sexo, estado;
		int cont1 =0,cont2 =0,cont3 =0,cont4 =0,cont5 =0,cont6 =0,total=1;
		
		System.out.println("informe sua idade: ");
		idade = sc.nextInt();
		System.out.println("imforme seu Gênero: ");
		sexo = sc.next().charAt(0);
		System.out.println("imforme seu Estado: ");
		estado = sc.next().charAt(0);
		 
		while(total <=150) {
			total++;
			if(idade < 18 && estado == '1') {
				cont6++;
				cont1++;
			}
			else if(idade > 40 && estado =='2') {
				cont5++;
			}
			else if(sexo == '3' && estado =='1') {
				cont4++;
				cont1++;
			}
			else if(sexo =='2' && estado =='3')  {
				cont3++;
			}
			else if(sexo =='1' && estado =='2') {
            	cont2++;
			}
			else if(estado =='1') {
            	cont1++;
			}
			System.out.println("informe sua idade: ");
			idade = sc.nextInt();
			System.out.println("informe seu Gênero: ");
			sexo = sc.next().charAt(0);
			System.out.println("informe seu Estado: ");
			estado = sc.next().charAt(0);
		}
		
		System.out.println("Total de Pessoas Calmas: "+cont1);
		System.out.println("Total de Mulheres Nervosas: "+cont2);
		System.out.println("Total de Homens Agressivos: "+cont3);
		System.out.println("Total de Outros Gêneros Calmos: "+cont4);
		System.out.println("Total de Pessoas Nervosas Com Mais de 40 Anos: "+cont5);
		System.out.println("Total de Pessoas Nervosas Com Menos de 18 Anos: "+cont6);
        
		sc.close();
	}

}
