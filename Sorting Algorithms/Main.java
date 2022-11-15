import java.util.Random;

public class Main {
	// Método Main
	public static void main(String[] args) {
		long inicio, fim;
		double intervalo;
		int[] ordenado; // Vetor que irá receber o vetor inicial já ordenado
		
		// Instanciamento do Objeto random com a seed formada pelos últimos 5 dígitos do prontuário
		Random random = new Random(75338);
		
		// Vetor para armazenar os valores inteiros
		int[] vetor = new int[6];
		
		// Laço for para popular o vetor
		for (int i=0; i<vetor.length; ++i) {
			vetor[i] = random.nextInt(50);
		}
		// Adquire a hora do sistema em nanossegundos no início da execução
		inicio = System.nanoTime();
		ordenado = SortingAlgs.insertionSort(vetor);
		fim = System.nanoTime(); // Adquire a hora do sistema em nanossegundos ao término do execução
		
		intervalo = (double) (fim - inicio)/1000000000; // Calcula o intervalo de tempo em que a ordenação ocoreu em segundos
		apresentarTempo(intervalo); // Apresenta este tempo decorrido
		// Só após o tempo de ordenação ter sido estimado é que o vetor ordenado é impresso
		imprimir(ordenado);
	}
	
	// Método para imprimir o tempo de execução
	public static void apresentarTempo(double tempo) {
		System.out.println("Tempo de execucao: " + tempo + " segundos.");
	}
	
	// Método para imprimir o vetor
	public static void imprimir(int[] A) {
		for (int i=0; i<A.length; ++i) {
			System.out.print(A[i] + " ");
		}
		System.out.println();
	}
}
