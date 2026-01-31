package Aula3;

import java.util.Scanner;

class Matematica {
public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);
    //double x;
    double diam;
    //double raio;
    double resultado;
    //x = Math.PI;

    //double quad = Math.pow(2.0, 3.0);
    //System.out.println(quad);
    System.out.println("Digite o diametro");
    diam = in.nextDouble();
    //raio = diam/2;
    resultado = (Math.pow((diam/2), 2.0) * Math.PI);
    System.out.println(resultado);

}    
}
