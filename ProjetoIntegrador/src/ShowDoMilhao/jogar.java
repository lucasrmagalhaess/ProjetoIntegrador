package ShowDoMilhao;

import ShowDoMilhao.sair;
import java.util.Scanner;

public class jogar {

	static Scanner leitor = new Scanner(System.in);
	static int resposta1;          				//variavel que guarda o valor da resposta
	static int pontuacao = 0;
	static boolean continuaJogo = true;                   // sempre sera verdadeiro no codigo ate que seja falso para algo

	public static void jogar() {

		System.out.println("\n\tA partida vai começar!\n");
		try {
			Thread.sleep(1500);						// tempo de espera pra carregar nova entrada de dados 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("\tPRIMEIRA PERGUNTA: \n");
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
					                  // pergunta 01
		    if (pergunta01() == 1) {    	
			tecleParaContinuar();

		} else {
			errouResposta();
			tecleParaSair();
		   }
		
		
		if (continuaJogo) {				// pegunta 02			
			if (pergunta02() == 1) {
				tecleParaContinuar();
			} else {
				errouResposta();
				tecleParaSair();
			}
		}
		

		if (continuaJogo) {				// pergunta 03
			if (pergunta03() == 1) {
				tecleParaContinuar();

			} else {
				errouResposta();
				tecleParaSair();
			}
		}
		

		if (continuaJogo) {				// pergunta 04
			if (pergunta04() == 1) {
				tecleParaContinuar();

			} else {
				errouResposta();
				tecleParaSair();
			}
		}
		

		if (continuaJogo) {				// pergunta 05
			if (pergunta05() == 1) {
				tecleParaContinuar();

			} else {
				errouResposta();
				tecleParaSair();
			}
		}
		

		if (continuaJogo) {				// pergunta 06
			if (pergunta06() == 1) {
				tecleParaContinuar();

			} else {
				errouResposta();
				tecleParaSair();
			}
		}
		

		if (continuaJogo) {				// pergunta 07
			if (pergunta07() == 1) {
				tecleParaContinuar();

			} else {
				errouResposta();
				tecleParaSair();
			}
		}
		

		if (continuaJogo) {				// pergunta 08
			if (pergunta08() == 1) {
				tecleParaContinuar();

			} else {
				errouResposta();
				tecleParaSair();
			}
		}
		

		if (continuaJogo) {				// pergunta 09
			if (pergunta09() == 1) {
				tecleParaContinuar();

			} else {
				errouResposta();
				tecleParaSair();
			}
		}
		

		if (continuaJogo) {				// pergunta 10
			if (pergunta10() == 1) {
				resultadoFinal();
				try {
					Thread.sleep(1500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				sair voltarMenu = new sair();          // chama o metodo da classe sair 
				voltarMenu.voltaAoMenu();
				
	} else {
		errouResposta();
			tecleParaSair();
			}
		}

	} 
	
	
	   								// as perguntas e respostas estao aqui

	static int pergunta01() {
		System.out.println("");
		System.out.println("\t1- Quantos títulos de Copa do Mundo tem o Brasil?: ");
		System.out.println("\tA) - 4");
		System.out.println("\tB) - 3");
		System.out.println("\tC) - 6");
		System.out.println("\tD) - 5");
		System.out.printf("\tEscolha sua alternativa: ");
		String resposta1 = leitor.nextLine().toLowerCase();                    //serve para converter para minuscula 

		if (resposta1.equals("d")) {                                          //compara com minuscula
			pontuacao += 999;
			System.out.println("\r\t+========================================================================================+\n");
			System.out.println("\t                                    ✓  RESPOSTA CORRETA!  ✓	"                                      );
			System.out.println("\r\t+========================================================================================+\n");

			pontuacao++;
			return 1;
		} else {
			return 0;
		}
	}

	static int pergunta02() {
		System.out.println("\tSEGUNDA PERGUNTA: \n");
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("\t2- Qual bicho transmite a doença de Chagas? ");
		System.out.println("\tA) - Abelha");
		System.out.println("\tB) - Barbeiro");
		System.out.println("\tC) - Pulga");
		System.out.println("\tD) - Barata");
		System.out.printf("\tEscolha sua alternativa: ");
		String resposta1 = leitor.nextLine().toLowerCase();

		if (resposta1.equals("b")) {
			pontuacao += 999;
			System.out.println("\r\t+========================================================================================+\n");
			System.out.println("\t                                    ✓  RESPOSTA CORRETA!  ✓	"                                      );
			System.out.println("\r\t+========================================================================================+\n");
			pontuacao++;
			return 1;
		} else {
			return 0;
		}
	}

	static int pergunta03() {
		System.out.println("\tTERCEIRA PERGUNTA: \n");
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("\t3- Quingentésimo corresponde a qual número? ");
		System.out.println("\tA) - 500");
		System.out.println("\tB) - 5000");
		System.out.println("\tC) - 50");
		System.out.println("\tD) - 5");
		System.out.printf("\tEscolha sua alternativa: ");
		String resposta1 = leitor.nextLine().toLowerCase();

		if (resposta1.equals("a")) {
			pontuacao += 2999;
			System.out.println("\r\t+========================================================================================+\n");
			System.out.println("\t                                    ✓  RESPOSTA CORRETA!  ✓	"                                      );
			System.out.println("\r\t+========================================================================================+\n");
			pontuacao++;
			return 1;
		} else {
			return 0;
		}
	}

	static int pergunta04() {
		System.out.println("\tQUARTA PERGUNTA: \n");
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("\t4- Como se chama o estudo entre palavras e significados? ");
		System.out.println("\tA) - Fonética");
		System.out.println("\tB) - Filosofia");
		System.out.println("\tC) - Semântica");
		System.out.println("\tD) - Psiquiatria");
		System.out.printf("\tEscolha sua alternativa: ");
		String resposta1 = leitor.nextLine().toLowerCase();

		if (resposta1.equals("c")) {
			pontuacao += 4999;
			System.out.println("\r\t+========================================================================================+\n");
			System.out.println("\t                                    ✓  RESPOSTA CORRETA!  ✓	"                                      );
			System.out.println("\r\t+========================================================================================+\n");
			pontuacao++;
			return 1;
		} else {
			return 0;
		}
	}

	static int pergunta05() {
		System.out.println("\tQUINTA PERGUNTA: \n");
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("\t5- Que animal da fauna brasileira está retratado na nota de 10 reais? ");
		System.out.println("\tA) - Jabuti");
		System.out.println("\tB) - Onça");
		System.out.println("\tC) - Tucano");
		System.out.println("\tD) - Arara");
		System.out.printf("\tEscolha sua alternativa: ");
		String resposta1 = leitor.nextLine().toLowerCase();

		if (resposta1.equals("d")) {
			pontuacao += 39999;
			System.out.println("\r\t+========================================================================================+\n");
			System.out.println("\t                                    ✓  RESPOSTA CORRETA!  ✓	"                                      );
			System.out.println("\r\t+========================================================================================+\n");
			pontuacao++;
			return 1;
		} else {
			return 0;
		}
	}

	static int pergunta06() {
		System.out.println("\tSEXTA PERGUNTA: \n");
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("\t6- A compensação por perda é chamada de: ");
		System.out.println("\tA) - Déficit");
		System.out.println("\tB) - Indenização");
		System.out.println("\tC) - Indexação");
		System.out.println("\tD) - Indébito");
		System.out.printf("\tEscolha sua alternativa: ");
		String resposta1 = leitor.nextLine().toLowerCase();

		if (resposta1.equals("b")) {
			pontuacao += 49999;
			System.out.println("\r\t+========================================================================================+\n");
			System.out.println("\t                                    ✓  RESPOSTA CORRETA!  ✓	"                                      );
			System.out.println("\r\t+========================================================================================+\n");
			pontuacao++;
			return 1;
		} else {
			return 0;
		}
	}

	static int pergunta07() {
		System.out.println("\tSETIMA PERGUNTA: \n");
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("\t7- Qual montanha se localiza entre a fronteira do Tibet com o Nepal? ");
		System.out.println("\tA) - Monte Everest");
		System.out.println("\tB) - Rocinha Community");
		System.out.println("\tC) - Monte Carlo");
		System.out.println("\tD) - Monte Branco");
		System.out.printf("\tEscolha sua alternativa: ");
		String resposta1 = leitor.nextLine().toLowerCase();

		if (resposta1.equals("a")) {
			pontuacao += 99999;
			System.out.println("\r\t+========================================================================================+\n");
			System.out.println("\t                                    ✓  RESPOSTA CORRETA!  ✓	"                                      );
			System.out.println("\r\t+========================================================================================+\n");
			pontuacao++;
			;
			return 1;
		} else {
			return 0;
		}
	}

	static int pergunta08() {
		System.out.println("\tOITAVA PERGUNTA:\n");
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("\t8- Qual flor é o símbolo nacional do Egito e foi considerada sagrada na antiguidade? ");
		System.out.println("\tA) - Rosa");
		System.out.println("\tB) - Lírio");
		System.out.println("\tC) - Jasmin");
		System.out.println("\tD) - Lotus");
		System.out.printf("\tEscolha sua alternativa: ");
		String resposta1 = leitor.nextLine().toLowerCase();

		if (resposta1.equals("d")) {
			pontuacao += 99999;
			System.out.println("\r\t+========================================================================================+\n");
			System.out.println("\t                                   ✓  RESPOSTA CORRETA!  ✓	"                                      );
			System.out.println("\r\t+========================================================================================+\n");
			pontuacao++;
			return 1;
		} else {
			return 0;
		}
	}

	static int pergunta09() {
		System.out.println("\tNONA PERGUNTA: \n");
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("\t9- Quem compôs o Hino da Independência? ");
		System.out.println("\tA) - Tom Jobim");
		System.out.println("\tB) - Catroz Alves");
		System.out.println("\tC) - Dom Pedro I");
		System.out.println("\tD) - Tim Maia");
		System.out.printf("\tEscolha sua alternativa: ");
		String resposta1 = leitor.nextLine().toLowerCase();

		if (resposta1.equals("c")) {
			pontuacao += 199999;
			System.out.println("\r\t+========================================================================================+\n");
			System.out.println("\t                                    ✓  RESPOSTA CORRETA!  ✓	"                                      );
			System.out.println("\r\t+========================================================================================+\n");
			pontuacao++;
			return 1;
		} else {
			return 0;
		}
	}

	static int pergunta10() {
		System.out.println("\tDECIMA PERGUNTA: \n");
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("\t10- Quando começou e terminou a primeira Guerra Mundial? ");
		System.out.println("\tA) - 1914 - 1918");
		System.out.println("\tB) - 1902 - 1930");
		System.out.println("\tC) - 1937 - 1945");
		System.out.println("\tD) - 1912 - 1915");
		System.out.printf("\tEscolha sua alternativa: ");
		String resposta1 = leitor.nextLine().toLowerCase();

		if (resposta1.equals("a")) {
			pontuacao += 499999;
			System.out.println("\r\t+========================================================================================+\n");
			System.out.println("\t                                    ✓  RESPOSTA CORRETA!  ✓	"                                      );
			System.out.println("\r\t+========================================================================================+\n");

			pontuacao++;
			return 1;
		} else {
			return 0;
		}
	}										
											// funcao para chamar o resultado final ao acertar todas
	static int resultadoFinal() {   
		System.out.println("\r\t==========================================================================================");
		System.out.println("\t\t                       Parabéns, você chegou ao final do jogo!                         ");
		System.out.println("\t\t                               VOCE GANHOU R$ " + pontuacao                          );
		System.out.println("\n\t\t                                OBRIGADO POR JOGAR!                                        ");
		System.out.println("\t============================================================================================");
		pontuacao = 0;
		return 0;
	}
											// funcao espera o usuario digitar enter para prosseguir
	public static void tecleParaContinuar() {
		Scanner entrada = new Scanner(System.in);
	
		System.out.println("\t                                  TECLE ENTER PARA CONTINUAR"                                      );
		System.out.println("\r\t+========================================================================================+\n");
		continuaJogo = true;

		try {
			System.in.read();
			entrada.nextLine();
		} catch (Exception e) {
		}
	}
										// retorna ao inicio apos errar resposta ou volta ao menu
	public static void tecleParaSair() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("\t                                    TECLE ENTER PARA SAIR"                                      );
		System.out.println("\r\t+========================================================================================+\n");

		continuaJogo = false;
		try {
			System.in.read();
			entrada.nextLine();
		} catch (Exception e) {
		}
	}
	
	static int errouResposta() {             // funcao para usar no else quando resposta for errada
		
		System.out.println("\r\t+========================================================================================+\n");
		System.out.println("\t                                    Que pena, você errou!                                   ");
		System.out.println("\t                                     Você ganhou R$ " +pontuacao                                        );
		System.out.println("\t                                     OBRIGADO POR JOGAR!                                        ");
		System.out.println("\r\t+========================================================================================+");
		pontuacao = 0;
		System.out.println("");
		return 0;
                } 
}