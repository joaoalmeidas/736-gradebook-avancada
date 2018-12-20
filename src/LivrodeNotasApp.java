import java.util.Scanner;

public class LivrodeNotasApp {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int opcao =  -999999;
		int alunos, provas, aluno, prova, nota;
		
		
		System.out.printf("Bem vindo a administração das notas.");
		
		
		System.out.println("Livro de Notas inexistente.\nInsira as informações a seguir");
		
		System.out.printf("Número de alunos: ");
		alunos = input.nextInt();
		
		System.out.printf("Número de avaliações: ");
		provas = input.nextInt();
		
		LivroDeNotas meuLivroDeNotas = new LivroDeNotas("Ciência da Computação - Programação 2", alunos, provas);
		
		do {
			
			System.out.printf("O que deseja fazer?\n"
					+ "1 - Inserir uma nota para um aluno\n"
					+ "2 - Exibir relatório\n");
			
			opcao = input.nextInt();
			
			if(opcao == 1) {
				
				System.out.println("Para qual aluno cadastrar a nota?");
				aluno = input.nextInt();
				
				System.out.println("Em qual avaliação?");
				prova = input.nextInt();
				
				System.out.println("Qual a nota?");
				nota = input.nextInt();
				
				meuLivroDeNotas.daNota(aluno, prova, nota);
				
			}else if(opcao == 2){
				
				System.out.printf("Bem-vindo ao livro de notas de %n%s%n%n", meuLivroDeNotas.getNomeDoCurso());
				meuLivroDeNotas.processaNotas();
				
			}else {
					
				System.out.println("Opção inválida, escolha uma das opções exibidas na tela.\n");
					
			}
			
		}while(opcao != -999999);
		
		//LivroDeNotas meuLivroDeNotas = new LivroDeNotas("Ciência da Computação - Programação 2", 8, 3);
		
		
		
		
		meuLivroDeNotas.processaNotas();

	}

}
