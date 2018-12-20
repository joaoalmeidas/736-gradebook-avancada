
public class LivrodeNotasApp {

	public static void main(String[] args) {
		
		int[][] arrayNotas = {{87, 96, 70},
							  {68, 87, 90},
							  {94, 100, 90},
							  {100, 81, 82},
							  {83, 65, 85},
							  {78, 87, 65},
							  {85, 75, 83},
							  {91, 94, 100},
							  {76, 72, 84},
							  {87, 93, 73}};
		
		LivroDeNotas meuLivroDeNotas = new LivroDeNotas("Ciência da Computação - Programação 2", arrayNotas);
		
		System.out.printf("Bem-vindo ao livro de notas de %n%s%n%n", meuLivroDeNotas.getNomeDoCurso());
		
		meuLivroDeNotas.processaNotas();

	}

}
