package ShowDoMilhao;

import java.util.Scanner;

public class instrucao {

	public static void instrucao() throws InterruptedException {
		
		System.out.println("\n\t+-------------------------------------------------------------------------------------------------------------------------------------------+\r");
		System.out.println("\tOlá jogador, bem vindo ao “Show do Milhão”!\r\n" + "\r\n"
				+ "\tO jogo consiste basicamente em responder corretamente 10 perguntas tendo em conta que terá 4 escolhas em cada uma, alguns pontos importantes do jogo são:\r\n"
				+ "\tComeçamos com um valor de mil reais e ele aumenta em cada reposta correta;\r\n"
				+ "\tSe caso você errar a resposta, voltará para o inicio do jogo;\n" 
				+ "\tLevamos em conta que se houver algum acerto no caminho, o valor das perguntas será somado e dado ao jogador.\n"
				+ "\r\tBoa sorte! =)\r");
		System.out.println("\t+-------------------------------------------------------------------------------------------------------------------------------------------+\n");

		tecleParaSair();

	}
	
	public static void tecleParaSair() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("\t\t\t\t\t\t\t>>>> TECLE ENTER PARA VOLTAR <<<<");
		
		try {
			System.in.read();
			entrada.nextLine();
		} catch (Exception e) {
		}
	}


}