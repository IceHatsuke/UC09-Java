package Aula2;

import java.util.Scanner;

public class Scanbug {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        String nome;
        int idade;
    
        System.out.print("Digite seu nome\n");
        nome = in.nextLine();

        System.out.print("Digite sua idade\n");
        idade = in.nextInt();

        System.out.printf("Olá %s, sua idade é: %d\n",nome,idade);
    }

}
