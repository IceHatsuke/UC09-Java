package Aula1;

public class variavel {
    public static void main(String[] args) {
        
        String nome;
        int x,y;
        String sobreNome;
        int hora, minuto;
        String mensagem;

        mensagem = "Olá, tudo bem?"; // atribuindo a String a variavel mensagem
        hora = 11; // atribuindo o valor 11 a variavel hora
        minuto = 56; // atribuindo o valor 56 a variavel minuto
        x = 3;
        y = x; // qual o valor do y aqui?
        System.out.println(y); // tem o mesmo valor de x, ou seja, 3
        System.out.println(mensagem);
        System.out.print("A hora é: ");
        System.out.print(hora);
        System.out.print(":");
        System.out.print(minuto);

        System.out.println((hora * 60)+ minuto);
        System.out.println(minuto/60);
        System.out.println((minuto * 60)/60);

    }
}
