
package AlgoritmosOrdenacao;


public class Bublesort {
    private int vetor[] = {25,57,48,37,12,92,33};
    
    public void bubleSort(){
        int it; //número de iterações
        int pos; // sempre use a posição atual
        int temp; // variável auxiliar
        
        for (it = 0; it < vetor.length-1; it++){
            for (pos = 0; pos < vetor.length -1; pos++){
                //comparo o elemento da posição e seu próximo
                if (vetor[pos] > vetor[pos + 1]){//o elemento atual é maior que seu próximo?
                    //então troca
                    temp = vetor[pos];
                    vetor[pos] = vetor[pos+1];
                    vetor[pos+1] = temp;
                }
            }
            System.out.println("---------->Final da iteração " + it);
            mostraVetor();
            System.out.println("\n");
        }                   
    
    }
    
    public void mostraVetor(){
        for (int i = 0; i < vetor.length; i++){
            System.out.print (vetor[i] + " ");
        }
        System.out.println(" ");
    }
}
   
    