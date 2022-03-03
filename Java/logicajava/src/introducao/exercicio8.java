package introducao;

import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {

		int vPercDistribuidor = 29, vPercImpostos = 45;
        double  vCustoFabrica, vValorDistribuidor, vValorImposto, vCustoConsumidor;  
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Informe o valor de custo de fábrica: ");
        vCustoFabrica = ler.nextDouble();
        
        vValorDistribuidor = vCustoFabrica + (vCustoFabrica * vPercDistribuidor / 100);

        vValorImposto = vCustoFabrica + (vCustoFabrica * vPercImpostos / 100);

        vCustoConsumidor = vCustoFabrica + vValorDistribuidor + vValorImposto ;
        
        System.out.print("O custo ao consumidor é: "+vCustoConsumidor);
        ler.close();
	}

}
