package beginners;

import java.util.Scanner;

public class Uri1094 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Aray para ler a linha com o numero de cobaias e seu tipo animal
        String[] line;
        /*Array 'temporário' para receber os valores individualizados
        acima e serem repassados para um array específico de cobaias (nAnimalsUsed)
        e outro de tipos de animais (tOfAnimal)*/
        String[] temp = new String[2];
        String[] nAnimalsUsed;
        String[] tOfAnimal;
        //Variavel para receber a quantidade de casos
        String nTestCases;
        //Variaveis numericas para valores de totais e porcentagens
        int totalAnimals = 0;
        int totalC = 0;
        int totalR = 0;
        int totalS = 0;
        double percentageC = 0.0;
        double percentageR = 0.0;
        double percentageS = 0.0;    
        
        //lendo do usuário qual será a quantidade de casos
        nTestCases = input.nextLine();
        //setando o tamanho dos arrays de acordo com a quantidade de casos
        line = new String[Integer.parseInt(nTestCases)];
        nAnimalsUsed = new String[Integer.parseInt(nTestCases)];
        tOfAnimal = new String[Integer.parseInt(nTestCases)];

        /*lendo cada caso individualmente usando o array temporário
        para separar as entradas e coloca-las em seus respectivos arrays
        (o de numeros (quantidades de cobaias) e o de strings (tipos de animais))*/
        for(int i = 0; i < line.length; i++){
            line[i] = input.nextLine();
            temp = line[i].split(" ");

            nAnimalsUsed[i] = temp[0];
            tOfAnimal[i] = temp[1];
        }

        //Calcular o total de cobaias utilizadas
        for(int i = 0; i < nAnimalsUsed.length; i++){
            totalAnimals += Integer.parseInt(nAnimalsUsed[i]);
        }

        //Calculando a quantidade de cobaias de acordo com seu tipo
        for(int i = 0; i < tOfAnimal.length; i++){
            if(tOfAnimal[i].equals("C")){
                totalC += Integer.parseInt(nAnimalsUsed[i]);
            }else if(tOfAnimal[i].equals("R")){
                totalR += Integer.parseInt(nAnimalsUsed[i]);
            }else{
                totalS += Integer.parseInt(nAnimalsUsed[i]);
            }
        }

        //Calculando as porcentagens
        percentageC = (double)(totalC * 100) / totalAnimals;
        percentageR = (double)(totalR * 100) / totalAnimals;
        percentageS = (double)(totalS * 100) / totalAnimals;

        //Imprimindo os resultados
        System.out.println("Total: " + totalAnimals + " cobaias\n" +
        "Total de coelhos: " + totalC + "\n" +
        "Total de ratos: " + totalR + "\n" +
        "Total de sapos: " + totalS);
        System.out.printf("Percentual de coelhos: %.2f %%\nPercentual de ratos: %.2f %%\nPercentual de sapos: %.2f %%\n",percentageC,percentageR,percentageS);
    }
}