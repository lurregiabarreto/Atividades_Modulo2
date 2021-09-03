/* 13 - João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho. Toda vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento de pesca do estado de São Paulo (50 quilos) deve pagar uma multa de R$4,00 por quilo excedente. João precisa que você faça um programa que leia a variável peso (peso de peixes) e calcule o excesso. Gravar na variável excesso a quantidade de quilos além do limite e na variável multa o valor da multa que João deverá pagar. Imprima os dados do programa com as mensagens adequadas.
*/

package br.com.zup.Lista7;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);


        int valorLimite = 50;
        int valorMulta = 4;
        double peso;
        double excesso;
        double multa;


        System.out.println("Por favor, digite o valor pescado");
        peso = leitor.nextDouble();

        if (peso >= (valorLimite + 1)) {
            excesso = peso - valorLimite;
            multa = excesso * valorMulta;
            System.out.println("Você pescou " + excesso + " quilos a mais que o limite");
            System.out.println("Isso equivale a R$" + multa + " em multa");
        } else if (peso < (valorLimite + 1) & peso > 0) {
            System.out.println("Com essa quantidade de pescada, você não pagará multa");
        } else {
            System.out.println("Você provavelmente inseriu números inválidos, por favor confira e tente novamente");


        }
    }
}
