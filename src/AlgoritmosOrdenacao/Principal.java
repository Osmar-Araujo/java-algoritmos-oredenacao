
package AlgoritmosOrdenacao;

public class Principal {
    public static void main (String args[]) {
        
        System.out.println("-------Buble Sort-------");
        System.out.println("\n");
        Bublesort buble = new Bublesort();
        buble.bubleSort();
        
        System.out.println("\n\n");
        
        System.out.println("------Selection Sort------");
        SelectionSort  sel = new SelectionSort();        
        sel.selectionSort();
        
        System.out.println("\n\n");
        
        System.out.println("-------Insretion Sort------");
        InsertionSort insertion = new InsertionSort();
        insertion.insertionSort();
        
        System.out.println("\n\n");
        
        System.out.println("--------Quick Sort---------");
        QuickSort quick = new QuickSort();
        quick.quickSort(0,quick.getVetor().length-1);
        quick.mostraVetor();
        
    }
    
    
}



