package Aula8;

public class AnaliseMeteorologia {

    public static void calcularMediaPonderadaTemperatura(double max, double min){
        //Utiliza array
    }

    public static void classificarClima(double tempMedia, int umidadeMedia){
        if(tempMedia >= 30 || umidadeMedia >= 75)
        {
            System.out.println("MUITO QUENTE E ÚMIDO");
        }
        else if(tempMedia >= 20 && tempMedia == 25 || umidadeMedia >= 50 && umidadeMedia == 70)
        {
            System.out.println("CONFORTAVEL");
        }
        else if(tempMedia <= 15 || umidadeMedia <= 50)
        {
            System.out.println("FRIO E SECO");
        }

    }

    public static void identificarCidadeComMaiorAmplitudeTermica(){

    }

    public static void calcularIndiceCalor(double temp, int umidade){

    }

    public static void gerarAlertas(int cidadeIndex){

    }

    public static void calcularEstatisticasAvancadas(){

    }

    public static void compararCidades(int cidade1, int cidade2){

    }

    public static void gerarRelatorioDetalhado(){
        System.out.printf("============================================================\n");
        System.out.printf("\tSISTEMA DE ANÁLISE METEOROLÓGICA INTELIGENTE\t\n");
        System.out.printf("============================================================\n");
        System.out.printf("\n\t\tANÁLISE DETALHADA POR CIDADE: \n");
    }

    public static void main(String[] args) {
        gerarRelatorioDetalhado();
    }
}
