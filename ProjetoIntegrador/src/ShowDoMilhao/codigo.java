package ShowDoMilhao;

import java.util.Timer;
import java.util.Scanner;

public class codigo {

	public static void main(String[] args) throws InterruptedException {


		Scanner entrada = new Scanner(System.in);
		Timer time = new Timer();
		instrucao instrucao = new instrucao();
		sair sair = new sair();
		jogar jogar = new jogar();
		boolean menu = false;
		
	System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> BEM VINDO AO SHOW DO MILHÃO! <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<\n");
	try {
		Thread.sleep(1500);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
		

		int opcao = 0;

		do {

			System.out.println("\t+========================================= MENU =========================================+\r");
			System.out.println("\t                                       1. Instruções"                                      );
			System.out.println("\t                                       2. Iniciar Jogo"                                    );
			System.out.println("\t                                       3. Sair"                                            );
			System.out.println("\r\t+========================================================================================+\n");
			System.out.printf ("\nEscolha sua opção: ");
			opcao = entrada.nextInt();

			switch (opcao) {

			case 1:
				instrucao.instrucao();

				break;

			case 2:

				jogar.jogar();
				break;

			case 3:

				sair.sair();
				break;

			}

		} while (opcao != 0);
		
		         
		
}
}