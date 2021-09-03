/* 3 - Faça um programa para ler 5 números e mostrar o resultado da soma desses
números. */

package br.com.zup.Lista4;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int contador = 1;
        int repeticao = 5;
        double usuario;
        double soma = 0;

        while (contador <= repeticao){

            System.out.println("Digite o número " +contador);
            usuario = leitor.nextDouble();

            soma = soma + usuario;
            contador ++;

        }

        System.out.println("SOMA TOTAL: " +soma);



    }
}
