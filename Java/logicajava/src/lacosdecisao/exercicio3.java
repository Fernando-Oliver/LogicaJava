package lacosdecisao;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n1;
		
		System.out.println("Entre com a idade");
		n1 =sc.nextInt();
		
		if(n1 >= 10 && n1 <= 14) {
			System.out.println("infantil");
		}
		else if(n1 > 14 && n1 <= 17) {
			System.out.println("Juvenil");
		}
		else if (n1 > 17 && n1 <= 25){
			System.out.println("Adulto");
		}
		
		sc.close();
	}

}
