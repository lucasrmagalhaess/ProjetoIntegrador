package ShowDoMilhao;

public class sair {

	public void sair()  {
		
		System.out.println("\t+=============================================================+");
		System.out.println("\tEste, é um projeto desenvolvido pelos alunos pertencentes a\n"
					+ "\tTurma C de Análise e Desenvolvimento de Sistemas do 1º Semestre.");
		System.out.println("\t+=============================================================+");

		System.out.println("Camille Pereira\n");
		System.out.println("Gabriel Gonzaga\n");
		System.out.println("João Pereira\n");
		System.out.println("Lucas Rodrigues");
		System.out.println("----------------\n");
		Thread.currentThread();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}
}
