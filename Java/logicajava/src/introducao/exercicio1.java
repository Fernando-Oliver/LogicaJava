package introducao;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int idade, meses, dias;

		System.out.print("Digite a idade: ");
		idade = ler.nextInt();
		System.out.print("Digite os meses: ");
		meses = ler.nextInt();
		System.out.print("Digite os Dias: ");
		dias = ler.nextInt();
		
		System.out.print("idade em Dias: "+dias);
		
		ler.close();	
	}

}
