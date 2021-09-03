/*1 - Faça um programa que receba dois números e imprima o maior deles.
*/
package br.com.zup.Lista2;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o primeiro número : ");
        double numero1 = leitor.nextDouble();

        System.out.println("Digite o segundo número: ");
        double numero2 = leitor.nextDouble();

        if( numero1 < numero2){
            System.out.println("O segundo é o maior");

        }
        else {
            System.out.println("O primeiro é o maior");
        }


    }
}
