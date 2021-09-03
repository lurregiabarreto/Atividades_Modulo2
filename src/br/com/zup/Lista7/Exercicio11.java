/* 11 - Faça um Programa que leia 20 números e armazene-os numa lista. Armazene os números pares na lista PAR e os números ÍMPARES na lista ímpar. Imprima as três listas.
*/

package br.com.zup.Lista7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        List< Integer> numeros = new ArrayList<>();
        List <Integer> numerosPares = new ArrayList<>();
        List <Integer> numerosImpares = new ArrayList<>();


        int valorReceber;

        for (int i=1; i <= 20; i++) {
            System.out.println("Insira o " + i + "° número");
            valorReceber = leitor.nextInt();
            numeros.add(valorReceber);


            if (valorReceber % 2 == 0) {
                numerosPares.add(valorReceber);
            } else {
                numerosImpares.add(valorReceber);
            }
        }
        System.out.println("Todos os números:");
        System.out.println(numeros);
        System.out.println("Ímpares:");
        System.out.println(numerosImpares);
        System.out.println("Pares:");
        System.out.println(numerosPares);
    }
}
