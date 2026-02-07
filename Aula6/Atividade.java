package Aula6;

import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;

import Aula1.dobro;

public class Atividade {
    public static class MaratonaFilmes {
        
        public static void exibirCabecalho()
        {
            System.out.println("\t=================================");
            System.out.printf("\tGERENCIADOR DE MARATONA DE FILMES\n");
            System.out.println("\t=================================\n");
        }

        public static double calcularTempoTotal(int quantidadeFilmes, double duracaoMedia)
        {
            return quantidadeFilmes * duracaoMedia;
        }

        public static String classificarMaratona(double horasTotais)
        {
            String banana = "";
            

            if(horasTotais <= 4)
            {
                banana = "Maratona Leve";
            }
            else if(horasTotais > 4 && horasTotais <= 8)
            {
                banana = "Maratona Moderada";
                System.out.println("Entrei no if banana");
            }
            else if(horasTotais > 8)
            {
                banana = "Maratona Épica!";
            }
            return banana;
        
        }

        static boolean isValida(int quantidadeFilmes)
        {
            return quantidadeFilmes > 0;
        }

        public static void main(String[] args) {
            String nomeUsuario;
            String validacao;
            int quantidadeFilmes = 4;
            double horaTotal;
            double tempo = 2.0;
            //double filmedouble = quantidadeFilmes;
            boolean teste = isValida(quantidadeFilmes);
            Scanner in = new Scanner(System.in);
            
            if(teste)
            {
                validacao = "true";
            }
            else
            {
                validacao = "false";
            }

            exibirCabecalho();
            
            horaTotal = calcularTempoTotal(quantidadeFilmes, tempo);
            
            
            System.out.println("Informações da Maratonha: \n");
            System.out.println("Usuário: \n");
            System.out.println("Filmes planejados: \n");
            System.out.println("Duração media por filme: \n");
            System.out.println("\n");
            System.out.println("Cálculos: \n");
            System.out.println("Tempo Total: \n" + horaTotal);
            System.out.println("Classificação: \n" + classificarMaratona(calcularTempoTotal(quantidadeFilmes, tempo)));
            System.out.println("Validação: \n" + validacao);

        }
        
    }
    
}
