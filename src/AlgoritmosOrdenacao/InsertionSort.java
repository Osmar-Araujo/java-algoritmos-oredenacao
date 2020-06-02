
package AlgoritmosOrdenacao;

// a comparação para este tipo de algoritmo é um jogo de cartas
public class InsertionSort {
    private int vetor[] = {25,57,48,37,12,92,33};
    
    public void insertionSort(){
        int cartatual, it;
        int j;
        
        // seleciona a "carta da vez", tencionando que esta seja a de menor valor
        for (it = 1; it < vetor.length; it++){
            cartatual = vetor[it];//guarda a carta
            for (j = it - 1; (j >= 0) && vetor [j] > cartatual; j--){
                vetor[j+1] = vetor[j];//trocando todos os que são maiores          
            }                       
            vetor[j+1] = cartatual;
            System.out.println("\n");
            System.out.println("-----> Iteração "+ it);          
            mostraVetor();
        }        
    }
    
    public void mostraVetor(){
        for (int i = 0; i < vetor.length; i++){            
            System.out.print (vetor[i] + " ");
        }
        System.out.println(" ");
    }
    
}
