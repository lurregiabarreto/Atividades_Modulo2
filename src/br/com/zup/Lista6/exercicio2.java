
package br.com.zup.Lista6;
/* 2. Faça um programa que leia números inteiros e imprima sua média*/

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int contador = 0;
        double media = 0;
        double soma = 0;


        System.out.println("Digite a quantidade de números que você deseja digitar: ");
        int qntDeNumeros = leitor.nextInt();


        while (contador < qntDeNumeros) {
            System.out.println("Digite um número: ");


            double usuario = leitor.nextDouble();
            soma = soma + usuario;
            contador++;
        }

        media = soma / qntDeNumeros;

        System.out.println("A média aritmética dos números é: " + media);


    }
}
