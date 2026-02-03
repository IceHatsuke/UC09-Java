package Aula4;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        String nome;
        int senha;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o nome de usuário");
        nome = in.nextLine();
        System.out.println("Digite a senha");
        senha = in.nextInt();

        if(nome == "admin" || senha == 1234)
        {
            System.out.println("Acesso concedido!");
        }
        else
        {
            System.out.println("Acesso negado!");
        }
    }
}
