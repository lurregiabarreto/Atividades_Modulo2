/* 8 - Faça um Programa que leia uma lista de 5 números inteiros e mostre-os.
 */

package br.com.zup.Lista7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();

        int numerosInt;
        int totalDeNumeros = 5;
        int contador = 1;


        while (contador <= totalDeNumeros) {
            System.out.println("Digite o número " + contador + " :");
            numerosInt = leitor.nextInt();
            numeros.add(numerosInt);
            contador++;

            System.out.println("A lista de números é: "+numeros);


        }
    }
}