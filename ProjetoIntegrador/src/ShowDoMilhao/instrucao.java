package ShowDoMilhao;

import ShowDoMilhao.sair; // importando a classe e o pacote para poder chamar metodo

import java.util.Scanner;

public class instrucao {

	public static void instrucao() throws InterruptedException {
		
		System.out.println("\r\t+========================================================================================+\n");
		System.out.println("\tOlá jogador, bem vindo ao “Show do Milhão”!\r\n" + "\r\n"
				+ "\tO jogo consiste basicamente em responder corretamente 10 perguntas tendo em conta que terá"
				+ "\n\t4 escolhas em cada uma, alguns pontos importantes do jogo são:\r\n"
				+ "\t\n\tComeçamos com um valor de mil reais e ele aumenta em cada reposta correta;\r\n"
				+ "\t\n\tSe caso você errar a resposta, voltará para o inicio do jogo;\n" 
				+ "\t\n\tLevamos em conta que se houver algum acerto no caminho, o valor das perguntas será somado"
				+ "\n\te dado ao jogador.");
		
		System.out.println("\r\t+========================================================================================+\n");
		System.out.println("\t                                       Boa Sorte! =)                                          ");
		System.out.println("\r\t+========================================================================================+");
	
		//chama metodo da classe sair para voltar ao menu
		
		sair voltarMenu = new sair();
		voltarMenu.voltaAoMenu();
	}
	
	


}