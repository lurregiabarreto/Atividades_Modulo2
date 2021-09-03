/* 1 - Faça um programa que pergunte o preço de três produtos e informe qual produto você deve comprar, sabendo que a decisão é sempre pelo mais barato.
 */

package br.com.zup.Lista7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        List<Double> numeros = new ArrayList<>();

        double produto1;
        double produto2;
        double produto3;
        double contador = 0;


        System.out.println("Por favor, digite o valor do primeiro produto");
        produto1 = leitor.nextDouble();

        System.out.println("Por favor , digite o valor do segundo produto");
        produto2 = leitor.nextDouble();

        System.out.println("Por favor digite o valor do tereceiro produto");
        produto3 = leitor.nextDouble();

        if (produto1 < produto2 & produto1 < produto3) {
            System.out.println("O produto 1 é o mais barato");
            numeros.add(produto1);
            contador ++;

        } else if (produto2 < produto1 & produto2 < produto3) {
            System.out.println("O produto 2 é o mais barato");
            numeros.add(produto1);
            contador ++;
        } else {
            System.out.println("O produto 3 é o mais barato");
        }


    }
}
