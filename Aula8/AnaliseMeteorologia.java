package Aula8;

public class AnaliseMeteorologia {
    // Declaração de dados fixos
    // Vetor (array) de nomes das cidades
    // String = texto
    // static = pertence à classe, não precisa criar objeto
    static String [] cidades = {"São Paulo", "Rio de Janeiro", "Belo Horizonte", "Curitiba", "Salvador"};
    
    // Matriz 5x2 de temperaturas
    // double = número com casas decimais
    // cada linha representa uma cidade
    // coluna 0 = Temperatura máxima
    // coluna 1 = Temperatura mínima
    static double [][] temperatura = 
    {
        {20.5, 25.1}, // Temperaturas para São Paulo
        {28.3, 18.7}, // Temperaturas para Rio de Janeiro
        {31.8, 21.9}, // Temperaturas para Belo Horizonte
        {30.2, 20.5}, // Temperaturas para Curitiba
        {20.7, 11.3}  // Temperaturas para Salvador
    };

    // Matriz 5x3 de umidades
    // int = número inteiro
    // coluna 0 = manhã 
    // coluna 1 = tarde
    // coluna 2 = noite
    static int [][] umidade = 
    {
        {85, 60, 75}, // Umidade para São Paulo
        {78, 55, 70}, // Umidade para Rio de Janeiro
        {90, 65, 80}, // Umidade para Belo Horizonte
        {72, 58, 70}, // Umidade para Curitiba
        {80, 50, 68}  // Umidade para Salvador
    };

    // Método principal (Main)
    // main é o ponto inicial do programa
    // public = pode ser acessado de fora da classe
    // static = executa sem criar objeto da classe
    // void = não retorna valor
    // String[] args = parâmetro padrão do Java
    public static void main(String[] args) {
        // Chama o método que imprime todo o relatório
        gerarRelatorioDetalhado();
    }

    // Método para calcular a média ponderada das temperaturas
    public static double calcularMediaPonderadaTemperatura(double max, double min){
        // Verifica se os valores estão dentro do limite permitido
        if(max < -50 || max > 60 || min < -50 || min > 60)
        {
            return 0; // Retorna 0 se os valores forem inválidos
        }
        // Calcula a média ponderada: 70% da máxima + 30% da mínima
        return (max * 0.7) + (min * 0.3);
    }

    // Método para classificar o clima com base na temperatura e umidade
    public static String classificarClima(double tempMedia, int umidadeMedia){
        // Verifica se a temperatura média é maior ou igual a 30 e umidade média é maior ou igual a 75
        if(tempMedia >= 30 && umidadeMedia >= 75)
        {
            return "MUITO QUENTE E ÚMIDO"; // Retorna a classificação
        }
        // Verifica se a temperatura média está entre 20 e 25 e a umidade entre 50 e 70
        else if(tempMedia >= 20 && tempMedia <= 25 && umidadeMedia >= 50 && umidadeMedia <= 70)
        {
            return "CONFORTÁVEL"; // Retorna a classificação
        }
        // Verifica se a temperatura média é menor ou igual a 15 ou umidade média é menor ou igual a 50
        else if(tempMedia <= 15 || umidadeMedia <= 50)
        {
            return "FRIO E SECO"; // Retorna a classificação
        }
        // Se não se encaixar em nenhuma das categorias anteriores
        else
        {
            return "NORMAL"; // Retorna a classificação
        }
    }

    // Método para identificar a cidade com maior amplitude térmica
    public static int identificarCidadeComMaiorAmplitudeTermica(){
        int indice = 0; // Indice da cidade com maior amplitude
        double maiorAmplitude = 0; // Armazena a maior amplitude encontrada

        // Loop para percorrer todas as cidades
        for(int i = 0; i < temperatura.length; i++){
            // Calcula a amplitude térmica da cidade atual
            double amplitude = temperatura[i][0] - temperatura[i][1];
            // Verifica se essa amplitude é maior que a maior encontrada
            if(amplitude > maiorAmplitude)
            {
                maiorAmplitude = amplitude; // Atualiza a maior amplitude
                indice = i; // Atualiza o índice da cidade
            }
        }
        return indice; // Retorna o índice da cidade com a maior amplitude térmica
    }

    // Método para calcular o índice de calor
    public static double calcularIndiceCalor(double temp, int umidade){
        // Calcula o índice de calor com base na temperatura e umidade
        double indice = temp + 0.5 * (umidade / 100.0) * (temp - 20);
        // Arredonda o valor para uma casa decimal
        return Math.round(indice * 10.0) / 10.0;
    }

    // Método para gerar alertas com base nas condições climáticas
    public static int gerarAlertas(int cidadeIndex){
        double max = temperatura[cidadeIndex][0]; // Temperatura máxima da cidade
        double min = temperatura[cidadeIndex][1]; // Temperatura mínima da cidade
        int umidadeMedia = calcularMediaUmidade(cidadeIndex); // Calcula a umidade média
        double variacao = max - min; // Calcula a variação de temperatura

        // Verifica se a temperatura máxima é maior que 35 ou umidade média maior que 90
        if(max > 35 || umidadeMedia > 90)
        {
            return 2; // Retorna 2 para alerta vermelho
        }
        // Verifica se a temperatura está entre 30 e 35 e umidade média maior que 80 ou se a variação é maior que 15
        else if((max >= 30 && max <= 35 && umidadeMedia > 80 ) || variacao > 15)
        {
            return 1; // Retorna 1 para alerta amarelo
        }
        else
        {
            return 0; // Retorna 0 para alerta verde
        }
    }

    // Método para calcular estatísticas avançadas de temperatura
    public static double[] calcularEstatisticasAvancadas(){
        double soma = 0; // Armazena a soma das temperaturas
        double maior = -100; // Inicializa a maior temperatura
        double menor = 100; // Inicializa a menor temperatura
        int total = 0; // Contador de temperaturas

        // Loop para percorrer todas as temperaturas
        for(int i = 0; i < temperatura.length; i++){
            for(int j = 0; j < 2; j++){
                double temp = temperatura[i][j]; // Temperatura atual
                soma += temp; // Adiciona à soma
                total++; // Incrementa o contador

                // Atualiza a maior temperatura se necessário
                if(temp > maior) maior = temp;
                // Atualiza a menor temperatura se necessário
                if(temp < menor) menor = temp;
            }
        }

        double media = soma / total; // Calcula a média das temperaturas
        double somaQuadros = 0; // Inicializa a soma dos quadrados das diferenças
        // Loop para calcular a soma dos quadrados das diferenças
        for(int i = 0; i < temperatura.length; i++){
            for(int j = 0; j < 2; j++){
                somaQuadros += Math.pow(temperatura[i][j] - media, 2); // Adiciona a diferença ao quadrado
            }
        }

        double desvio = Math.sqrt(somaQuadros / total); // Calcula o desvio padrão

        // Retorna um array com média, maior, menor e desvio
        return new double[]{media, maior, menor, desvio};
    }

    // Método para comparar temperaturas entre duas cidades
    public static String compararCidades(int cidade1, int cidade2){

        double media1 = calcularMediaPonderadaTemperatura(temperatura[cidade1][0], temperatura[cidade1][1]); //Pegam a temperatura máxima e mínima de duas cidades, Chamam um método que calcula a média e Guardam o resultado nas variáveis
        double media2 = calcularMediaPonderadaTemperatura(temperatura[cidade2][0], temperatura[cidade2][1]); 

        int umidade1 = calcularMediaUmidade(cidade1); // Umidade média da cidade 1
        int umidade2 = calcularMediaUmidade(cidade2); // Umidade média da cidade 2

        // Verifica qual cidade é mais quente
        if(media1 > media2)
        {
            return cidades[cidade1] + " é mais quente"; // Retorna a cidade1 mais quente
        }
        else if(media2 > media1)
        {
            return cidades[cidade2] + " é mais quente"; // Retorna a cidade2 mais quente
        }
        else
        {
            return "É mais confortável"; // Se as temperaturas forem iguais
        }
    }

    // Método para gerar um relatório detalhado de todas as cidades
    public static void gerarRelatorioDetalhado(){
        // Imprime cabeçalho do relatório
        System.out.println("============================================================\n");
        System.out.println("\tSISTEMA DE ANÁLISE METEOROLÓGICA INTELIGENTE\t\n");
        System.out.println("============================================================\n");
        System.out.println("\n\t\t ANÁLISE DETALHADA POR CIDADE: \n");
        System.out.println("------------------------------------------------------------------\n");
        System.out.println("CIDADE | T.MAX | T.MED | T.MIN | UMID% | CLASSIFICAÇÃO    | ALERTA\n");
        System.out.println("-------------------------------------------------------------------\n");

        double maiorTemp = -100; // Armazena a maior temperatura encontrada
        double menorTemp = 100; // Armazena a menor temperatura encontrada
        int cidadeMaisQuente = 0; // Index da cidade mais quente
        int cidadeMaisFria = 0; // Index da cidade mais fria

        double maiorIndiceCalor = 0; // Armazena o maior índice de calor
        int cidadeIndiceMaior = 0; // Index da cidade com maior índice de calor

        // Loop para percorrer todas as cidades
        for(int i = 0; i < cidades.length; i++){
            double max = temperatura[i][0]; // Temperatura máxima da cidade
            double min = temperatura[i][1]; // Temperatura mínima da cidade
            double media = calcularMediaPonderadaTemperatura(max, min); // Calcula média ponderada
            int umidadeMedia = calcularMediaUmidade(i); // Calcula umidade média
            double indiceCalor = calcularIndiceCalor(media, umidadeMedia); // Calcula índice de calor

            String classificacao = classificarClima(media, umidadeMedia); // Classifica o clima

            int alertaCodigo = gerarAlertas(i); // Gera alerta
            String alerta; // Cria uma String chamada "alerta"

            // Define a cor do alerta baseado no código
            if(alertaCodigo == 2) alerta = "VERMELHO";
            else if(alertaCodigo == 1) alerta = "AMARELO";
            else alerta = "VERDE";

            // Atualiza a cidade mais quente se necessário
            if(max > maiorTemp)
            {
                maiorTemp = max; // Atualiza a maior temperatura
                cidadeMaisQuente = i; // Atualiza o índice da cidade mais quente
            }

            // Atualiza a cidade mais fria se necessário
            if(min < menorTemp)
            {
                menorTemp = min; // Atualiza a menor temperatura
                cidadeMaisFria = i; // Atualiza o índice da cidade mais fria
            }

            // Atualiza a cidade com maior índice de calor se necessário
            if(indiceCalor > maiorIndiceCalor)
            {
                maiorIndiceCalor = indiceCalor; // Atualiza o maior índice de calor
                cidadeIndiceMaior = i; // Atualiza o índice da cidade
            }
            
            // Imprime os dados da cidade formatados
            System.out.printf("    %d  | %.1f°C| %.1f°C| %.1f°C|  %d   | %-17s| %s\n", (i + 1), max, min, media, umidadeMedia, classificacao, alerta);
        }

        // Calcula estatísticas gerais
        double estatisticas[] = calcularEstatisticasAvancadas();
        int maiorAmplitude = identificarCidadeComMaiorAmplitudeTermica(); // Identifica a cidade com maior amplitude térmica
        System.out.println("-------------------------------------------------------------------");
        System.out.println("\nESTATÍSTICAS GERAIS:");
        System.out.printf("• Temperatura média geral: %.1f°C\n", estatisticas[0]); // Imprime a temperatura média geral
        System.out.printf("• Cidade mais quente: #%d (%.1f°C)\n", cidadeMaisQuente + 1, maiorTemp); // Imprime a cidade mais quente

        System.out.printf("• Cidade mais fria: #%d (%.1f°C)\n", cidadeMaisFria + 1, menorTemp); // Imprime a cidade mais fria

        System.out.printf("• Maior amplitude térmica: #%d (%.1f°C)\n", maiorAmplitude + 1, temperatura[maiorAmplitude][0] - temperatura[maiorAmplitude][1]); // Imprime a maior amplitude térmica

        System.out.printf("• Índice de calor mais alto: #%d (%.1f°C)\n\n", cidadeIndiceMaior + 1, maiorIndiceCalor); // Imprime o maior índice de calor

        System.out.println("ANÁLISE COMPARATIVA:");

        // Compara a temperatura entre duas cidades
        double diferencaTemp = temperatura[2][0] - temperatura[4][0]; // Diferença de temperatura entre Belo Horizonte e Salvador
        System.out.printf("• Cidade Belo Horizonte é significativamente mais quente que Salvador (+%.1f°C)\n", diferencaTemp);

        // Compara a umidade entre São Paulo e Salvador
        int um1 = calcularMediaUmidade(0); // Umidade média de São Paulo
        int um5 = calcularMediaUmidade(4); // Umidade média de Salvador
        System.out.printf("• Cidade São Paulo tem maior umidade que Salvador (+%.1f%%)\n", (double) (um1 - um5));

        // Sugestão de cidade para conforto térmico
        System.out.println("Para conforto térmico, recomenda-se visitar cidade Rio de Janeiro\n");
        System.out.println("=================================================================");
    }

    // Método para retornar a média da umidade de uma cidade
    public static int calcularMediaUmidade(int cidadeIndex){
        int soma = 0; // Inicializa a soma da umidade
        // Loop para somar a umidade da manhã, tarde e noite
        for (int i = 0; i < 3; i++) {
            soma += umidade[cidadeIndex][i]; // Adiciona a umidade atual à soma
        }
        return soma / 3; // Retorna a média da umidade
    }
}

    

