package introducao;

import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		double a,b,c,d,e,f,x,y;
		
		System.out.print("Digite A: ");
        a = ler.nextDouble();
        System.out.print("Digite B: ");
        b = ler.nextDouble();
        System.out.print("Digite C: ");
        c = ler.nextDouble();
        System.out.print("Digite D: ");
        d = ler.nextDouble();
        System.out.print("Digite E: ");
        e = ler.nextDouble();
        System.out.print("Digite F: ");
        f = ler.nextDouble();
        
        x = (c*e-b*f)/(a*e-b*d);
        y = (a*f-c*d)/(a*e-b*d);
        

        System.out.print("Sistema Linear X: "+x+", Sistema Linear Y: "+y);
        ler.close();
	}

}
