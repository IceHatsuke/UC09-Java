package Aula3;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        double preco;
        int quantidade;
        
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o preço do produto");
        preco = in.nextDouble();
        
        System.out.println("Digite a quantidade");
        quantidade = in.nextInt();
        
        double custoTotal = preco * quantidade;

        System.out.println("Custo Total é: " + custoTotal);
    }
}
