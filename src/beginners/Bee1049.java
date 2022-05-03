package beginners;

/*
* ENUCIADO DO PROBLEMA:
* Nesse problema, seu trabalho é ler três palavras em português.
* Essas palavras definem um animal de acordo com a tabela abaixo,
* da esquerda para a direita. Em seguida, imprima o animal escolhido
* definido por essas três palavras.
* */

import java.util.Scanner;

public class Bee1049 {
    public static void main(String[] args) {
        /*
        * Criando a variável para leitura das palavras
        * */
        Scanner input = new Scanner(System.in);
        /*
        * Criando a variável para armazenas as informações
        * das leituras das palavras
        * */
        String animal;
        /*
        * Lendo a primeira informação do animal
        * */
        animal = input.nextLine();
        /*
        * verificando se é vertebrado ou invertebrado
        * */
        if(animal.equals("vertebrado")){
            /*
            * Vamos verificar agora se é ave ou mamifero
            * */
            animal = input.nextLine();
            if(animal.equals("ave")){
                /*
                * Vamos verificar agora se é carnivoro ou onivoro
                * */
                animal = input.nextLine();
                if(animal.equals("carnivoro")){
                    animal = "aguia";
                }else{
                    animal = "pomba";
                }
            }else{
                /*
                * Se não for ave, só pode ser mamifero
                * */
                animal = input.nextLine();
                if(animal.equals("onivoro")){
                    animal = "homem";
                }else{
                    animal = "vaca";
                }
            }
        }else{
            /*
            * Se não for vertebrado, só pode ser invertebrado
            * */
            animal = input.nextLine();
            if(animal.equals("inseto")){
                animal = input.nextLine();
                if(animal.equals("hematofago")){
                    animal = "pulga";
                }else{
                    animal = "lagarta";
                }
            }else{
                /*
                * Se não for inseto, só pode ser um anelideo
                * */
                animal = input.nextLine();
                if(animal.equals("hematofago")){
                    animal = "sanguessuga";
                }else{
                    animal = "minhoca";
                }
            }
        }
        System.out.println(animal);
    }
}