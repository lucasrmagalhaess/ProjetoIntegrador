package ShowDoMilhao;

import java.util.Scanner;

public class jogar {

	static Scanner leitor = new Scanner(System.in);
	static int resposta1;
	static int pontuacao = 0;
	static boolean continuaJogo = true;                   // sempre sera verdadeiro no codigo ate que seja falso para algo

	public static void jogar() {

		System.out.println("\nA partida vai começar!\n");
		try {
			Thread.sleep(1500);						// tempo de espera pra carregar nova entrada de dados 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("PRIMEIRA PERGUNTA: \n");
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
						                  // pergunta 01
		    if (pergunta01() == 1) {    	
			tecleParaContinuar();

		} else {
			System.out.println("\n>>>>>>>>>>>>>>>>>>>>>>>> QUE PENA, VOCE ERROU! <<<<<<<<<<<<<<<<<<<<<<<<<<");
			System.out.println("                         Sua pontuação foi R$ "+pontuacao              );
			System.out.println("");
			tecleParaSair();
		   }
		
		
		
		if (continuaJogo) {				// pegunta 02			
			if (pergunta02() == 1) {
				tecleParaContinuar();
			} else {
				System.out.println("\n>>>>>>>>>>>>>>>>>>>>>>>> QUE PENA, VOCE ERROU! <<<<<<<<<<<<<<<<<<<<<<<<<<");
				System.out.println("                         Sua pontuação foi R$ "+pontuacao               );
				tecleParaSair();
			}
		}
		

		if (continuaJogo) {				// pergunta 03
			if (pergunta03() == 1) {
				tecleParaContinuar();

			} else {
				System.out.println("\n>>>>>>>>>>>>>>>>>>>>>>>> QUE PENA, VOCE ERROU! <<<<<<<<<<<<<<<<<<<<<<<<<<");
				System.out.println("                         Sua pontuação foi R$ "+pontuacao               );
				tecleParaSair();
			}
		}
		

		if (continuaJogo) {				// pergunta 04
			if (pergunta04() == 1) {
				tecleParaContinuar();

			} else {
				System.out.println("\n>>>>>>>>>>>>>>>>>>>>>>>> QUE PENA, VOCE ERROU! <<<<<<<<<<<<<<<<<<<<<<<<<<");
				System.out.println("                         Sua pontuação foi R$ "+pontuacao               );
				tecleParaSair();
			}
		}
		

		if (continuaJogo) {				// pergunta 05
			if (pergunta05() == 1) {
				tecleParaContinuar();

			} else {
				System.out.println("\n>>>>>>>>>>>>>>>>>>>>>>>> QUE PENA, VOCE ERROU! <<<<<<<<<<<<<<<<<<<<<<<<<<");
				System.out.println("                         Sua pontuação foi R$ "+pontuacao               );
				tecleParaSair();
			}
		}
		

		if (continuaJogo) {				// pergunta 06
			if (pergunta06() == 1) {
				tecleParaContinuar();

			} else {
				System.out.println("\n>>>>>>>>>>>>>>>>>>>>>>>> QUE PENA, VOCE ERROU! <<<<<<<<<<<<<<<<<<<<<<<<<<");
				System.out.println("                         Sua pontuação foi R$ "+pontuacao               );
				tecleParaSair();
			}
		}
		

		if (continuaJogo) {				// pergunta 07
			if (pergunta07() == 1) {
				tecleParaContinuar();

			} else {
				System.out.println("\n>>>>>>>>>>>>>>>>>>>>>>>> QUE PENA, VOCE ERROU! <<<<<<<<<<<<<<<<<<<<<<<<<<");
				System.out.println("                         Sua pontuação foi R$ "+pontuacao               );
				tecleParaSair();
			}
		}
		

		if (continuaJogo) {				// pergunta 08
			if (pergunta08() == 1) {
				tecleParaContinuar();

			} else {
				System.out.println("\n>>>>>>>>>>>>>>>>>>>>>>>> QUE PENA, VOCE ERROU! <<<<<<<<<<<<<<<<<<<<<<<<<<");
				System.out.println("                         Sua pontuação foi R$ "+pontuacao               );
				tecleParaSair();
			}
		}
		

		if (continuaJogo) {				// pergunta 09
			if (pergunta09() == 1) {
				tecleParaContinuar();

			} else {
				System.out.println("\n>>>>>>>>>>>>>>>>>>>>>>>> QUE PENA, VOCE ERROU! <<<<<<<<<<<<<<<<<<<<<<<<<<");
				System.out.println("                         Sua pontuação foi R$ "+pontuacao               );
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
				tecleParaSair();
				
		} else {
			System.out.println("\n>>>>>>>>>>>>>>>>>>>>>>>> QUE PENA, VOCE ERROU! <<<<<<<<<<<<<<<<<<<<<<<<<<");
			System.out.println("                         Sua pontuação foi R$ "+pontuacao               );
			tecleParaSair();
			}
		}

	} 
	
	
	   								// as perguntas e respostas estao aqui

	static int pergunta01() {
		System.out.println("1- Quantos títulos de Copa do Mundo tem o Brasil?: ");
		System.out.println("1) - 4");
		System.out.println("2) - 3");
		System.out.println("3) - 6");
		System.out.println("4) - 5");
		System.out.printf("Escolha sua alternativa: ");
		resposta1 = leitor.nextInt();

		if (resposta1 == 4) {
			pontuacao += 999;
			System.out.println("\nResposta Correta!");
			pontuacao++;
			return 1;
		} else {
			return 0;
		}
	}

	static int pergunta02() {
		System.out.println("SEGUNDA PERGUNTA: \n");
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("2- Qual bicho transmite a doença de Chagas? ");
		System.out.println("1) - Abelha");
		System.out.println("2) - Barbeiro");
		System.out.println("3) - Pulga");
		System.out.println("4) - Barata");
		System.out.printf("Escolha sua alternativa: ");
		resposta1 = leitor.nextInt();

		if (resposta1 == 2) {
			pontuacao += 999;
			System.out.println("\nResposta Correta!");
			pontuacao++;
			return 1;
		} else {
			return 0;
		}
	}

	static int pergunta03() {
		System.out.println("TERCEIRA PERGUNTA: \n");
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("3- Quingentésimo corresponde a qual número? ");
		System.out.println("1) - 500");
		System.out.println("2) - 5000");
		System.out.println("3) - 50");
		System.out.println("4) - 5");
		System.out.printf("Escolha sua alternativa: ");
		resposta1 = leitor.nextInt();

		if (resposta1 == 1) {
			pontuacao += 2999

			;
			System.out.println("\nResposta Correta!");
			pontuacao++;
			return 1;
		} else {
			return 0;
		}
	}

	static int pergunta04() {
		System.out.println("QUARTA PERGUNTA: \n");
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("4- Como se chama o estudo entre palavras e significados? ");
		System.out.println("1) - Fonética");
		System.out.println("2) - Filosofia");
		System.out.println("3) - Semântica");
		System.out.println("4) - Psiquiatria");
		System.out.printf("Escolha sua alternativa: ");
		resposta1 = leitor.nextInt();

		if (resposta1 == 3) {
			pontuacao += 4999;
			System.out.println("\nResposta Correta!");
			pontuacao++;
			return 1;
		} else {
			return 0;
		}
	}

	static int pergunta05() {
		System.out.println("QUINTA PERGUNTA: \n");
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("5- Que animal da fauna brasileira está retratado na nota de 10 reais? ");
		System.out.println("1) - Jabuti");
		System.out.println("2) - Onça");
		System.out.println("3) - Tucano");
		System.out.println("4) - Arara");
		System.out.printf("Escolha sua alternativa: ");
		resposta1 = leitor.nextInt();

		if (resposta1 == 4) {
			pontuacao += 9999;
			System.out.println("\nResposta Correta!");
			pontuacao++;
			return 1;
		} else {
			return 0;
		}
	}

	static int pergunta06() {
		System.out.println("SEXTA PERGUNTA: \n");
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("6- A compensação por perda é chamada de: ");
		System.out.println("1) - Déficit");
		System.out.println("2) - Indenização");
		System.out.println("3) - Indexação");
		System.out.println("4) - Indébito");
		System.out.printf("Escolha sua alternativa: ");
		resposta1 = leitor.nextInt();

		if (resposta1 == 2) {
			pontuacao += 29999;
			System.out.println("\nResposta Correta!");
			pontuacao++;
			return 1;
		} else {
			return 0;
		}
	}

	static int pergunta07() {
		System.out.println("SETIMA PERGUNTA: \n");
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("7- Qual montanha se localiza entre a fronteira do Tibet com o Nepal? ");
		System.out.println("1) - Monte Everest");
		System.out.println("2) - Rocinha Community");
		System.out.println("3) - Monte Carlo");
		System.out.println("4) - Monte Branco");
		System.out.printf("Escolha sua alternativa: ");
		resposta1 = leitor.nextInt();

		if (resposta1 == 1) {
			pontuacao += 49999;
			System.out.println("\nResposta Correta!");
			pontuacao++;
			;
			return 1;
		} else {
			return 0;
		}
	}

	static int pergunta08() {
		System.out.println("OITAVA PERGUNTA:\n");
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("8- Qual flor é o símbolo nacional do Egito e foi considerada sagrada na antiguidade? ");
		System.out.println("1) - Rosa");
		System.out.println("2) - Lírio");
		System.out.println("3) - Jasmin");
		System.out.println("4) - Lotus");
		System.out.printf("Escolha sua alternativa: ");
		resposta1 = leitor.nextInt();

		if (resposta1 == 4) {
			pontuacao += 99999;
			System.out.println("\nResposta Correta!");
			pontuacao++;
			return 1;
		} else {
			return 0;
		}
	}

	static int pergunta09() {
		System.out.println("NONA PERGUNTA: \n");
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("9- Quem compôs o Hino da Independência? ");
		System.out.println("1) - Tom Jobim");
		System.out.println("2) - Catroz Alves");
		System.out.println("3) - Dom Pedro I");
		System.out.println("4) - Tim Maia");
		System.out.printf("Escolha sua alternativa: ");
		resposta1 = leitor.nextInt();

		if (resposta1 == 3) {
			pontuacao += 499999;
			System.out.println("\nResposta Correta!");
			pontuacao++;
			return 1;
		} else {
			return 0;
		}
	}

	static int pergunta10() {
		System.out.println("DECIMA PERGUNTA: \n");
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("10- Quando começou e terminou a primeira Guerra Mundial? ");
		System.out.println("1) - 1914 - 1918");
		System.out.println("2) - 1902 - 1930");
		System.out.println("3) - 1937 - 1945");
		System.out.println("4) - 1912 - 1915");
		System.out.printf("Escolha sua alternativa: ");
		resposta1 = leitor.nextInt();

		if (resposta1 == 1) {
			pontuacao += 499999;
			System.out.println("\nResposta Correta!");
			pontuacao++;
			return 1;
		} else {
			return 0;
		}
	}										
											// funcao para chamar o resultado final ao acertar todas
	static int resultadoFinal() {   
		System.out.println("\r==========================================================================================");
		System.out.println("                       Parabéns, você chegou ao final do jogo!                         ");
		System.out.println("                               VOCE GANHOU R$ " + pontuacao                          );
		System.out.println("\n                               OBRIGADO POR JOGAR!                                        ");
		System.out.println("============================================================================================");
		return pontuacao;
	}
											// funcao espera o usuario digitar enter para prosseguir
	public static void tecleParaContinuar() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("\n============================");
		System.out.println("TECLE ENTER PARA CONTINUAR");
		System.out.println("============================");
		try {
			System.in.read();
			entrada.nextLine();
		} catch (Exception e) {
		}
	}
										// retorna ao inicio apos errar resposta ou volta ao menu
	public static void tecleParaSair() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("======================");
		System.out.println("TECLE ENTER PARA SAIR");
		System.out.println("======================");
		continuaJogo = false;
		try {
			System.in.read();
			entrada.nextLine();
		} catch (Exception e) {
		}
	}
}