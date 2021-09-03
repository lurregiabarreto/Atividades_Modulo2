/* 1 - João Papo-de-Pescador, homem de bem, comprou um microcomputador para
controlar o rendimento diário de seu trabalho. Toda vez que ele traz um peso de
peixes maior que o estabelecido pelo regulamento de pesca do estado de São
Paulo (50 quilos) deve pagar uma multa de R $4,00 por quilo excedente. João
precisa que você faça um programa que leia a variável peso (peso de peixes) e
calcule o excesso. Gravar na variável excesso a quantidade de quilos além do limite
e na variável multa o valor da multa que João deverá pagar. Imprima os dados do
programa com as mensagens adequadas.*/


package br.com.zup.Lista2;

public class sequencial1 {
    public static void main(String[] args) {
        double pesoTotal = 78;
        double pesoSemMulta = 50;
        double excesso = pesoTotal - pesoSemMulta;
        double valorDaMulta = 4;
        double multa = excesso * valorDaMulta;

        // Informando ao usuário
        System.out.println("Hoje você pescou " + pesoTotal + " quilos de peixe");
        System.out.println("O peso excedido foi de " + excesso + ", sendo cobrado R$" + valorDaMulta + " por quilo excedido");
        System.out.println("O valor da multa a pagar é de R$" + multa);


    }
}
