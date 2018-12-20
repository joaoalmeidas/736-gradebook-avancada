import java.util.Scanner;

public class LivrodeNotasApp {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int opcao =  -999999;
		int alunos, provas, aluno, prova, nota;
		
		
		System.out.printf("Bem vindo a administra��o das notas.");
		
		
		System.out.println("Livro de Notas inexistente.\nInsira as informa��es a seguir");
		
		System.out.printf("N�mero de alunos: ");
		alunos = input.nextInt();
		
		System.out.printf("N�mero de avalia��es: ");
		provas = input.nextInt();
		
		LivroDeNotas meuLivroDeNotas = new LivroDeNotas("Ci�ncia da Computa��o - Programa��o 2", alunos, provas);
		
		do {
			
			System.out.printf("O que deseja fazer?\n"
					+ "1 - Inserir uma nota para um aluno\n"
					+ "2 - Exibir relat�rio\n");
			
			opcao = input.nextInt();
			
			if(opcao == 1) {
				
				System.out.println("Para qual aluno cadastrar a nota?");
				aluno = input.nextInt();
				
				System.out.println("Em qual avalia��o?");
				prova = input.nextInt();
				
				System.out.println("Qual a nota?");
				nota = input.nextInt();
				
				meuLivroDeNotas.daNota(aluno, prova, nota);
				
			}else if(opcao == 2){
				
				System.out.printf("Bem-vindo ao livro de notas de %n%s%n%n", meuLivroDeNotas.getNomeDoCurso());
				meuLivroDeNotas.processaNotas();
				
			}else {
					
				System.out.println("Op��o inv�lida, escolha uma das op��es exibidas na tela.\n");
					
			}
			
		}while(opcao != -999999);
		
		//LivroDeNotas meuLivroDeNotas = new LivroDeNotas("Ci�ncia da Computa��o - Programa��o 2", 8, 3);
		
		
		
		
		meuLivroDeNotas.processaNotas();

	}

}
