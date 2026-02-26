package Aula9;

public class Array {

    public static void printaArray(int[] a){
        for(int v : a){
            System.out.println(v);
        }
        //for(int z = 0; z < a.length; z++){
        //    System.out.println(a[z]);
        //}
    }

    public static void main(String[] args) {
        //Inicialização dos Vetores
        int[] counts;
        double[] values;
        int size = 10;

        //Criação dos Vetores
        counts = new int[4];
        values = new double[size];

        //int[] a = {1, 2, 3, 4};
        counts[0] = 7;
        counts[1] = counts[0] * 2;
        counts [2] ++;
        counts[3] -= 60;
        //printaArray(counts);
        printaArray(counts);

        for(int i = 0; i < 4; i++){
            System.out.println(counts[i]);
        }
        
        //int i = 0;
        //while (i < 4) {
          //  System.out.println(counts[i]);
            //i++;
        } 
    }
//}
