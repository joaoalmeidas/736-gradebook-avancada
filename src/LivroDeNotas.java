
public class LivroDeNotas {
	
	private String NomeDoCurso;
	private int[][] notas;
	
	public LivroDeNotas(String nomeDoCurso, int[][] notas) {
		super();
		NomeDoCurso = nomeDoCurso;
		this.notas = notas;
	}

	public String getNomeDoCurso() {
		return NomeDoCurso;
	}

	public void setNomeDoCurso(String nomeDoCurso) {
		NomeDoCurso = nomeDoCurso;
	}

	public int[][] getNotas() {
		return notas;
	}

	public void setNotas(int[][] notas) {
		this.notas = notas;
	}
	
	public void processaNotas() {
		
		exibeNotas();
		
		System.out.printf("%n%s %d%n%s %d%n%n",
				"A menor nota no livro de notas �", retornaMenorNota(),
				"A maior nota no livro de notas �", retornaMaiorNota());
		
		exibeGrafico();	
	}
	
	public int retornaMenorNota() {
		
		int menorNota = notas[0][0];
		
		for(int[] notasEstudantes : notas) {
			
			for(int nota : notasEstudantes) {
				
				if(nota < menorNota) {
					
					menorNota = nota;
					
				}
				
			}
			
		}
		
		return menorNota;
		
	}
	
	public int retornaMaiorNota() {
		
		int maiorNota = notas[0][0];
		
		for(int[] notasEstudantes : notas) {
			
			for(int nota : notasEstudantes) {
				
				if(nota > maiorNota) {
					
					maiorNota = nota;
					
				}
				
			}
			
		}
		
		return maiorNota;
	}
	
	public double retornaMedia(int[] conjuntoDeNotas) {
		
		int total = 0;
		
		for(int nota : conjuntoDeNotas) {
			
			total += nota;
			
		}
		
		return (double) total / conjuntoDeNotas.length;
		
	}
	
	public void exibeGrafico() {
		
		System.out.println("Distribui��o m�dia das notas:");
		
		int[] frequencia = new int[11];
		
		for(int[] notasEstudantes : notas) {
			
			for(int nota: notasEstudantes) {
				++frequencia[nota / 10];
			}
			
		}
		
		for(int cont = 0; cont < frequencia.length; cont++) {
			
			if(cont == 10) {
				System.out.printf("%5d: ", 100);
			}else {
				System.out.printf("%02d-%02d: ", cont * 10, cont * 10 + 9);
			}
			
			for(int estrelas = 0; estrelas < frequencia[cont]; estrelas++) {
				System.out.printf("*");
			}
			
			System.out.println();
			
		}
		
		
		
	}
	
	public void exibeNotas() {
		
		System.out.printf("As notas s�o : %n%n");
		System.out.print("                ");
		
		for(int prova = 0; prova < notas[0].length; prova++) {
			
			System.out.printf("Prova %d ", prova + 1);
			
		}
		
		System.out.println("M�dia");
		
		for(int estudante = 0; estudante < notas.length; estudante++) {
			
			System.out.printf("Estudante %2d", estudante + 1);
			
			for(int prova : notas[estudante]) {
				
				System.out.printf("%8d", prova);
				
			}
			
			double media = retornaMedia(notas[estudante]);
			System.out.printf("%9.2f%n", media);
			
		}
	}
	
}