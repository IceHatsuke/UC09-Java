package Aula2;

import java.util.Scanner;

public class Converter2 {

    public static double polegada;
    public static final double CM_PARA_POLEGADA = 2.54;
    public static final double POL_PARA_PES = 12.0;
      
    
    public static void cmParaPolegada(double d){
        polegada = d / CM_PARA_POLEGADA;
        System.out.printf("Valor digitado %.2f", polegada);
        
    }
    
    public static void polegadaParaPes(double p){
        polegada = p / POL_PARA_PES;
        System.out.printf("Valor digitado %.2f", polegada);   
    }
    
    public static void cmParaMetro(){
        
    }
    
    public static void metroParaKM(){
        
    }
    
    public static void main(String[] args) {
        double cm;
        double pol;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o valor em CM");
        cm = in.nextDouble();
        cmParaPolegada(cm);
        System.out.println("Digite o valor em polegada");
        pol = in.nextDouble();
        polegadaParaPes(pol);
        
    }
}
