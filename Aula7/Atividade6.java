package Aula7;

public class Atividade6 {
    public static void main(String[] args) {
        int num = 5;
        int fator = 1;

        for (int i = num; i >= 1; i--){
            fator *= i;
        }
        System.out.println(fator);
    }
}
