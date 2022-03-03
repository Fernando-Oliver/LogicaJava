package introducao;

import java.util.*;

public class exercicio6 {

	public static void main(String[] args) {
		
		double x1, x2, y1, y2, d;
        Scanner ler = new Scanner(System.in);
         
        System.out.print("Digite a Diferença dos 2 Pontos: ");
        x1 = ler.nextDouble();
        System.out.print("Digite a Diferença dos 2 Pontos: ");
        x2 = ler.nextDouble();
        System.out.print("Digite a Diferença dos 2 Pontos: ");
        y1 = ler.nextDouble();
        System.out.print("Digite a Diferença dos 2 Pontos: ");
        y2 = ler.nextDouble();
        
        d = Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2));
        
        System.out.print("A Distância dos 2 Pontos: "+d);
        
        ler.close();
        
	}

}
