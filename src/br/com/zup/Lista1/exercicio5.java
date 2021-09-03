/* 5 - Faça um programa que peça a temperatura em graus Fahrenheit, transforme e
mostre a temperatura em graus Celsius. */

package br.com.zup.Lista1;

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        float grausF;


        System.out.println("Diga-me sua temperatura em graus Fahrenheit");
        grausF = leitor.nextFloat();

        System.out.println("Sua temperatura em graus Fahrenheit é: " +grausF);

        float grausC = (grausF - 32) / 1.8f;

        System.out.println("Sua temperatura em graus celsius é: " +grausC);

    }
}
