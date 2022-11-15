public class SortingAlgs {
	// Selection Sort
	public static int[] selectionSort(int[] A) {
		// Laço for para iterar por todo o vetor
		for (int i=0; i<A.length; ++i) {
			// A variável min, que armazena o menor índice do subarray, recebe o valor de i
			int min = i;
			/*
			 * Laço for para iterar desde o elemento imediatamente à direita até o fim do vetor em busca de um elemento
			 * que seja menor que o elemento no menor índice.
			*/
			for (int j=i+1; j<A.length; ++j) {
				/*
				 *  Caso seja encontrado um elemento menor que o na posição min, estes trocam de posição entre si.
				 *  Ou seja, os menores elementos vão sendo posto à esquerda.
				*/
				if (A[j]<A[min]) {
					int aux = A[j];
					A[j] = A[min];
					A[min] = aux;
				}
			}
		}
		// Retorna o vetor A ordenado
		return A;
	}
	
	// BubbleSort
	public static int[] bubbleSort(int[] A) {
		int flag = 0; // flag para armazenar quantas trocas de posição ocorreram
		// Primeiro laço de iteração que irá determinar o elemento que será comparado com os demais
		for (int i=0; i<A.length; ++i) {
			flag = 0; // Renovação da flag para que o valor não seja contaminado com execuções anteriores
			// Segundo laço de iteração para comparar o i-ésimo termo com os demais
			for (int j=i+1; j<A.length; ++j) {
				// Caso o i-ésimo termo seja maior que o j-ésimo termo, eles trocam de lugar
				if (A[i]>A[j]) {
					int aux = A[j];
					A[j] = A[i];
					A[i] = aux;
					flag++; // A flag de troca de posições aumenta em 1 o seu valor
				}
			}
			// Caso não haja troca de posição, isso quer dizer que o vetor já está ordenado
			if (flag==0) {break;}
		}
		// Retorna o vetor A ordenado
		return A;
	}
	
	// InsertionSort
	public static int[] insertionSort(int[] A) {
		int chave; // Variável chave, que irá armazenar o valor do i-ésimo elemento do vetor
		// Laço for que percorre o vetor do segundo índice até seu fim
		for (int i = 1; i<A.length; ++i) {
			// O valor do elemento no índice i é armazenado na variável chave;
			chave = A[i];
			// A variável j é instanciada e recebe o valor imediatamente menor que o de i
			int j = i - 1;
			/* 
			 * Um laço de repetição while é rodado enquanto o valor de j for maior ou igual a 0
			 * e o valor do j-ésimo elemento for maior que o valor do i-ésimo elemento.
			 * 
			 * Ou seja, o subarray será percorrido da direita para a esquerda em busca de um valor à esquerda que
			 * seja maior que a chave (último elemento adicionado ao subarray). Caso exista tal elemento, o índice
			 * imediatamente à direita receberá o valor deste j-ésimo elemento.
			*/
			while ((j>=0) && (A[j]>chave)) {
				A[j+1] = A[j];
				j--; // O valor de j é decrescido em 1
			}
			/*
			 *  O elemento no índice imediatamente à direita do primeiro elemento encontrado que seja menor que a chave
			 *  Recebe o valor da chave, para justamente manter o vetor em ordem crescente.
			 *  Caso a chave seja o menor elemento do vetor, esta chave ocupará o índice [0] do vetor.
			*/
			A[j+1] = chave;
		}
		// Retorna o vetor A ordenado
		return A;
	}
	
	// ShellSort - Fonte: https://www.geeksforgeeks.org/shellsort/
	public static int[] shellSort(int[] A) {
		int n = A.length; // Utiliza a variável N para armazenar o tamanho do vetor
        for (int interv = n/2;  interv > 0; interv /= 2) {
            for (int i = interv; i < n; i += 1) {
                int temp = A[i];
                int j;
                for (j = i; j >= interv && A[j - interv] > temp; j -= interv)
                    A[j] = A[j - interv];
                A[j] = temp; 
            }
        }
		// Retorna o vetor A ordenado
		return A;
	}
}
