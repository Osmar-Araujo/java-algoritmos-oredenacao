
package AlgoritmosOrdenacao;


public class QuickSort {
    private int vetor[] = {25,57,48,37,12,92,33};
    
    public int[] getVetor(){
        return vetor;
    }
    
    public int partition(int inicio, int fim){
        int ref, up, down, temp;        
                
        ref = vetor [inicio];
        down = inicio;
        up = fim;
        
        while (down < up){
            //encontrando um número maior que o pivô.
            while(vetor[down] <= ref && down < fim){
                down++; //avanço para encontrar um valor maior
                System.out.println("\n");
                System.out.println("---------> Iteração down");
                mostraVetor();
            }
            //também quero encontrar a partir do fim um valor menor que o ref
        
            while (vetor[up] > ref){
                up--;
                System.out.println("\n");
                System.out.println("-----------> Iteração up"); 
                mostraVetor();
            }
            if (down < up){ // ainda não se cruzaram os índices
                //troca
                temp = vetor[down];
                vetor[down] = vetor[up];
                vetor[up] = temp;
            }
        }
        vetor[inicio] = vetor[up];
        vetor[up] = ref;
        
        return up;//a posição up é que denota onde está o pivô        
    }
    
    public void quickSort(int inicio, int fim){
        int pivo;
        if (inicio > fim){
            return;
        }
        pivo = partition(inicio, fim);
        quickSort(inicio, pivo-1);             
        quickSort(pivo+1,fim);
    }
    
    
    public void mostraVetor(){
        for (int i = 0; i < vetor.length; i++){            
            System.out.print (vetor[i] + " ");
        }
        System.out.println(" ");
    }   
}
