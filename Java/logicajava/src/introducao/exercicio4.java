package introducao;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		double a,b,c,d,r,s;
		
		System.out.print("Digite O Valor de A: ");
		a = ler.nextDouble();
		System.out.print("Digite O Valor de B: ");
		b = ler.nextDouble();
		System.out.print("Digite O Valor de C: ");
		c = ler.nextDouble();
		
		r = (a*a)+(b*b);
		s = (b*b)+(c*c);
		d = (r+s)/ 2;

		System.out.print("Valor de D: "+d);
		ler.close();
}
}