package Aula8;

public class AnaliseMeteorologia {
    //CIDADES
    static String [] cidades = {"São Paulo", "Rio de Janeiro", "Belo Horizonte", "Curitiba", "Salvador"};
    //TEMPERATURAS
    static double [][] temperatura = 
    {
        {20.5, 25.1},
        {28.3, 18.7},
        {31.8, 21.9},
        {30.2, 20.5},
        {20.7, 11.3}
    };
    //UMIDADES
    static int [][] umidade = 
    {
        {85, 60, 75},
        {78, 55, 70},
        {90, 65, 80},
        {72, 58, 70},
        {80, 50, 68}
    };
    //CALCULA A MEDIA DA TEMPERATURA
    public static double calcularMediaPonderadaTemperatura(double max, double min){
        if(max < -50 || max > 60 || min < -50 || min > 60)
        {
            return 0;
        }
        return (max * 0.7) + (min * 0.3);
    }
    //MOSTRA A CLASSIFICAÇÃO DO CLIMA
    public static void classificarClima(double tempMedia, int umidadeMedia){
        if(tempMedia >= 30 && umidadeMedia >= 75)
        {
            System.out.println("MUITO QUENTE E ÚMIDO");
        }
        else if(tempMedia >= 20 && tempMedia <= 25 && umidadeMedia >= 50 && umidadeMedia <= 70)
        {
            System.out.println("CONFORTAVEL");
        }
        else if(tempMedia <= 15 || umidadeMedia <= 50)
        {
            System.out.println("FRIO E SECO");
        }

    }
    //MOSTRA QUAL CIDADE TEM A MAIOR DIFERENÇA ENTRE: TEMPERATURA MAXIMA E TEMPERATURA MINIMA
    public static int identificarCidadeComMaiorAmplitudeTermica(){
        int indice = 0;
        double maiorAmplitude = 0;

        for(int i = 0; i < temperatura.length; i++){
            double amplitude = temperatura[i][0] - temperatura[i][1];
            if(amplitude > maiorAmplitude)
            {
                maiorAmplitude = amplitude;
                indice = i;
            }
        }
        return indice;
    }
    //CALCULA O INDICE DE CALOR 
    public static double calcularIndiceCalor(double temp, int umidade){
        double indice = temp + 0.5 * (umidade / 100.0) * (temp - 20);
        return Math.round(indice * 10.0) / 10.0;
    }
    //MOSTRA O NIVEL DE ALERTA
    public static int gerarAlertas(int cidadeIndex){
        double max = temperatura[cidadeIndex][0];
        double min = temperatura[cidadeIndex][1];
        int umidadeMedia = calcularMediaUmidade(cidadeIndex);
        double variacao = max - min;

        if(max > 35 || umidadeMedia > 90)
        {
            return 2;
        }
        else if((max >= 30 && max <= 35 && umidadeMedia > 80 ) || variacao > 15)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }

    public static void calcularEstatisticasAvancadas(){

    }
    //COMPARA QUAL CIDADE É MAIS QUENTE, A MEDIA PONDERADA E A MEDIA DA UMIDADE
    public static String compararCidades(int cidade1, int cidade2){
        double media1 = calcularMediaPonderadaTemperatura(temperatura[cidade1][0], temperatura[cidade1][1]);
        double media2 = calcularMediaPonderadaTemperatura(temperatura[cidade2][0], temperatura[cidade2][1]);

        int umidade1 = calcularMediaUmidade(cidade1);
        int umidade2 = calcularMediaUmidade(cidade2);

        if(media1 > media2)
        {
            return cidades[cidade1] + "É mais quente";
        }
        else if(media2 > media1)
        {
            return cidades[cidade2] + "É mais quente";
        }
        else
        {
            return "É Mais confortavel";
        }
    }
    //GERA O RELATORIO DE TODAS AS CIDADES E CALCULA 
    public static void gerarRelatorioDetalhado(){
        System.out.printf("============================================================\n");
        System.out.printf("\tSISTEMA DE ANÁLISE METEOROLÓGICA INTELIGENTE\t\n");
        System.out.printf("============================================================\n");
        System.out.printf("\n\t\tANÁLISE DETALHADA POR CIDADE: \n");
        System.out.printf("\t---------------------------------------------\n");
        System.out.printf("CIDADE | T.MAX | T.MED | UMID% | CLASSIFICAÇÃO     | ALERTA\n");
        System.out.printf("\t---------------------------------------------\n");


    }
    //RETORNA MEDIA DA UMIDADE
    public static int calcularMediaUmidade(int cidadeIndex){
        int soma = 0;
        for (int i = 0; i < 3; i++) {
            soma += umidade[cidadeIndex][i];
        }
        return soma / 3;
    }

    public static void main(String[] args) {
        gerarRelatorioDetalhado();
    }
}
