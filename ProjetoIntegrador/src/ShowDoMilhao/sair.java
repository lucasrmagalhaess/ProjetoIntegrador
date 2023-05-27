package ShowDoMilhao;

import java.util.Scanner;

public class sair {

	public void sair() {

		System.out.println("\r\t+========================================================================================+\n");
		System.out.println("\tEste, é um projeto desenvolvido pelos alunos pertencentes a Turma C de Análise e "
				+ "\n\tDesenvolvimento de Sistemas do 1º Semestre.   ");
		System.out.println("\r\t+========================================================================================+");
		
		System.out.println("\n\tCamille Pereira");
		System.out.println("\n\tGabriel Gonzaga");
		System.out.println("\n\tJoão Pereira");
		System.out.println("\n\tLucas Rodrigues");
		System.out.println("\r\t+========================================================================================+");
		voltaAoMenu();
	}

	public static void voltaAoMenu() {
		System.out.println("\n                                       TECLE ENTER PARA VOLTAR AO MENU                                          ");
		System.out.println("\r\t+========================================================================================+\n");

		
		try {
			System.in.read();
			Scanner entrada = null;
			entrada.nextLine();
		} catch (Exception e) {
		}
	}


}