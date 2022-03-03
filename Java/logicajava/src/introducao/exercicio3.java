package introducao;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class exercicio3 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
        
		int duracao;
		
        System.out.print("Digite o Total de Segundos do Evento: ");
        duracao = ler.nextInt();
		
        long horas = TimeUnit.SECONDS.toHours(duracao);
        duracao -= TimeUnit.HOURS.toSeconds(horas);
        
        long minutos = TimeUnit.SECONDS.toMinutes(duracao);
        duracao -= TimeUnit.MINUTES.toSeconds(minutos);
        
        long segundos = duracao;
        
        System.out.println("Duração total do evento: "+horas+" Horas "+minutos+
        		" Minutos, "+segundos+" Segundos");
        
		ler.close();
		
	}

}
