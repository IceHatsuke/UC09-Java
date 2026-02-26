package Aula7;

public class Strings {
    public static void main(String[] args) {
        String fruta = "banAna";
        char letra = 'a';

        String s1 = "Alan Turing";
        String s2 = "Ada Lovelace";
        int diff = s1.compareTo(s2);

        if(diff < 0)
        {
            System.out.println("S1 vem antes do S2");
        }
        else if(diff > 0)
        {
            System.out.println("S2 vem antes do S1");
        }
        else
        {
            System.out.println("Os nomes são iguais");
        }
        System.out.println(diff);

        for (int i = 0; i < 1000; i++){
            System.out.print((char)(letra + 1));
        }

       //for (char c = 'A'; c <= 'z'; c++){
         //   System.out.printf("%d", (int)c);
        //}
    }
}
