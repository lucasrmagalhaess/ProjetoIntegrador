package ShowDoMilhao;

import java.util.Scanner;

public class sair {

	public void sair()  {
		
		System.out.println("\n\t##############################################################");
		System.out.println("\tEste, é um projeto desenvolvido pelos alunos pertencentes a\n"
					+ "\tTurma C de Análise e Desenvolvimento de Sistemas do 1º Semestre   ");
		System.out.println("\t##############################################################\n");

		System.out.println("Camille Pereira");
		System.out.println("Gabriel Gonzaga");
		System.out.println("João Pereira");
		System.out.println("Lucas Rodrigues\n");
		voltaAoMenu();
		
	    }
			
	
	
	
	public static void voltaAoMenu() {
	Scanner entrada = new Scanner(System.in);
	System.out.println("\t\t\t\t\t>>>> TECLE ENTER PARA VOLTAR AO MENU <<<<");
	
	try {
		System.in.read();
		entrada.nextLine();
	} catch (Exception e) {
	}
}
	
 }
