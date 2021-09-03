/* 2 - Faça um programa para ler uma quantidade de números (N) digitada pelo
usuário e mostrar a quantidade de números ímpares desses números */

package br.com.zup.Lista5;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int qtdDeNumerosImpares = 0;
        int contador = 1;

        System.out.println("Digite a quantidade de números que você deseja digitar: ");
        double qtdDeNumeros = leitor.nextDouble();

        while (contador <= qtdDeNumeros){


            System.out.println("Digite o numero " +contador+ " :");
            double valorDigitadoPeloUsuario = leitor.nextDouble();


            if (valorDigitadoPeloUsuario % 2 == 1){
                qtdDeNumerosImpares= qtdDeNumerosImpares + 1;

            }

            contador ++;
        }

        System.out.println("A quantidade de números Impares é: " +qtdDeNumerosImpares);


    }
}
