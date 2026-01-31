package Aula3;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        double fahrenheit;
        
        Scanner in = new Scanner(System.in);
        System.out.println("Digite uma temperatura em Fahrenheit");
        fahrenheit = in.nextDouble();
        double celsius = (fahrenheit - 32) * 5 / 9;

        System.out.println("A temperatura em celsius é: " + celsius + "°");
    }
}
