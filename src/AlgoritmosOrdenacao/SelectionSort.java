
package AlgoritmosOrdenacao;


public class SelectionSort {
    
    private int vetor[] = {25,57,48,37,12,92,33};
    
    public void selectionSort(){    
                
        int it,i, temp;
        int posMenorInicial;
        int posMenor = 0;
        
        
        for (it = 0; it < vetor.length-1; it++ ){
            posMenorInicial = it;
            posMenor = it + 1;
            for (i = posMenorInicial +1; i < vetor.length; i++){
                if (vetor[i] < vetor[posMenor]){
                    posMenor = i;                    
                }
                    
            }
            if (vetor[posMenor] < vetor[posMenorInicial]){
                    //troca
                    temp = vetor[posMenorInicial];
                    vetor[posMenorInicial] = vetor[posMenor];
                    vetor[posMenor] = temp;
            }
            System.out.println("\n");
            System.out.println("--> Iteração " + it);       
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
