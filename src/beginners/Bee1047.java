package beginners;
/*
* ENUCIADO DO PROBLEMA:
* Leia a hora de início e de término de um jogo, em horas e minutos
* (hora inicial, minuto inicial, hora final, minuto final). Em seguida,
* imprima a duração do jogo, sabendo que o jogo pode começar em um dia
* e terminar em outro dia,
Obs .: Com tempo máximo de jogo de 24 horas e mínimo de 1 minuto.
* */
import java.util.Scanner;
import java.io.IOException;

public class Bee1047 {
    public static void main(String[] args) throws IOException{
        /*
        * Criando a variável para leitura dos dados
        * */
        Scanner input = new Scanner(System.in);
        /*
        * Criando uma String para armazenar as horas e minutos inicio e fim
        * */
        String line;
        /*
        * Criando um array de String para dividir os valores que são
        * inseridos junto na variável "line"
        * */
        String[] arrayLine;
        /*
        * Criando variáveis para representar as horas e minutos de Inicio
        * e as horas e minutos fim. E outras para as horas e minutos totais
        * */
        int startHour,startMinute,endHour,endMinute,totalHours,totalMinutes;
        /*
        * Vamos ler os dados do usuário:
        * */
        line = input.nextLine();
        /*
        * Dividindo os valores para o arrayLine
        * */
        arrayLine = line.split(" ");
        /*
        * Seguindo a logica, o primeiro valor é a hora inicial, o segundo
        * o minuto inicial, o terceiro a hora final, e o quarto o minuto
        * final. Vamos atribuir os valores convertidos para suas respecti-
        * vas variáveis:
        * */
        startHour = Integer.parseInt(arrayLine[0]);
        startMinute = Integer.parseInt(arrayLine[1]);
        endHour = Integer.parseInt(arrayLine[2]);
        endMinute = Integer.parseInt(arrayLine[3]);
        /*
        * Aqui é feito as comparações, incluindo todas as possibilidades
        * de horários, levando em consideração o enuciado do problema (que
        * deixou claro que o jogo não pode passar de 24 horas e seja no
        * mínimo 1 minuto)
        * */
        if((startHour == endHour) && (startMinute == endMinute)){
            System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
        }else if((startHour == endHour) && (endMinute > startMinute)){
            totalMinutes = endMinute - startMinute;
            System.out.println("O JOGO DUROU 0 HORA(S) E " + totalMinutes +" MINUTO(S)");
        }else if(startHour == endHour){
            totalMinutes = (endMinute + 60) - startMinute;
            System.out.println("O JOGO DUROU 23 HORA(S) E " + totalMinutes +" MINUTO(S)");
        }else if((endHour > startHour) && (endMinute > startMinute)){
            totalHours = endHour - startHour;
            totalMinutes = endMinute - startMinute;
            System.out.println("O JOGO DUROU " + totalHours + " HORA(S) E " + totalMinutes + " MINUTO(S)");
        }else if((endHour > startHour) && (endMinute < startMinute)){
            totalMinutes = (endMinute + 60) - startMinute;
            totalHours = (endHour - startHour) - 1;
            System.out.println("O JOGO DUROU " + totalHours + " HORA(S) E " + totalMinutes + " MINUTO(S)");
        }else if(endHour > startHour){
            totalHours = endHour - startHour;
            System.out.println("O JOGO DUROU " + totalHours + " HORA(S) E 0 MINUTO(S)");
        }else if(startMinute < endMinute){
            totalMinutes = endMinute - startMinute;
            totalHours = (endHour + 24) - startHour;
            System.out.println("O JOGO DUROU " + totalHours + " HORA(S) E " + totalMinutes + " MINUTO(S)");
        }else if(startMinute > endMinute){
            totalMinutes = (endMinute + 60) - startMinute;
            totalHours = ((endHour + 24) - startHour) - 1;
            System.out.println("O JOGO DUROU " + totalHours + " HORA(S) E " + totalMinutes + " MINUTO(S)");
        }else{
            totalHours = (endHour + 24) - startHour;
            System.out.println("O JOGO DUROU " + totalHours + " HORA(S) E 0 MINUTO(S)");
        }
    }
}
