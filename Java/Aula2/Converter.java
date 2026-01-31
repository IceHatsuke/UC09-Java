package Aula2;

/*
    Converte centimetros para pés e polegadas
 */

import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        // Declaração de variaveis
        double cm,pes;
        double polegadas;
        //double metros;
        //double km;
        final double CM_POR_POL = 2.54;
        final double POL_POR_PES = 12.0;
        int pol;
        Scanner in = new Scanner(System.in);
        // Fim das declarações

        System.out.println("Digite um valor EXATO em cm");
        cm = in.nextDouble();
        //metros = (cm/100);
       // km = (metros/1000);
        polegadas = (cm / CM_POR_POL);
        pes = (polegadas / POL_POR_PES);
        //System.out.println("Valor em polegadas: "+ polegadas);
        //System.out.println("Valor em metros: "+ metros);
        //System.out.println("Valor em KM: "+ km);

        // Casting
        pol = (int)polegadas;

        // Saída de dados
        System.out.printf("%.2f cm = %.2f pol = %.2f pés\n", cm,polegadas,pes);
        System.out.printf("%d Esse é o valor da variavel pol\n",pol);
    }
}
