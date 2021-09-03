/* 12 - Faça um Programa que leia uma lista de 5 números inteiros, mostre a soma, a multiplicação e os números.
*/

package br.com.zup.Lista7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();

        int soma = 0 ;
        int multiplicacao = 1;
        int valores = 0;

        for (int i = 1 ; i <= 5; i++) {
            System.out.println("Digite o " + i + " para mostrar");
            valores = leitor.nextInt();
            numeros.add(valores);
            soma = soma  + valores;
            multiplicacao = multiplicacao * valores;
        }

        System.out.println("A soma deles é " +soma);
        System.out.println("A multiplicação é "+multiplicacao);
        System.out.println("A lista de números inseridos é");
        System.out.println(numeros);

    }
}
