package Aula3;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int totalseg;
    System.out.println("Digite os segundos");
    totalseg = in.nextInt();
    int min = totalseg / 60;
    int segrest = totalseg % 60;
    
    System.out.println(min + " Minutos e " + segrest + " Segundos");
    

     
    }
}

