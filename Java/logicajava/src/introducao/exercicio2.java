package introducao;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int idade, meses;
		double dias;

		System.out.print("Digite a Idade em Dias: ");
		dias = ler.nextDouble();
		
		idade = (int)(dias / 365);
		meses = idade * 12;
		
		System.out.print("idade: "+idade+" Anos, "+meses+" Meses, "+"e "+dias+" Dias");

		ler.close();
	}
         
}
