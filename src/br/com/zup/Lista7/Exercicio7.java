/* 7 - Faça um programa que receba dois números inteiros e gere os números inteiros que estão no intervalo compreendido por eles.
 */

package br.com.zup.Lista7;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int numero1;
        int numero2;

        System.out.println("Por favor, digite um numero inteiro");
        numero1 = leitor.nextInt();

        System.out.println("Por favor, digite o segundo numero inteiro");
        numero2 = leitor.nextInt();


        for (int i = numero1 + 1; i < numero2; i++)
            System.out.println(i);






    }
}
