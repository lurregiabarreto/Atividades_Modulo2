/* 4 - Os números primos possuem várias aplicações dentro da Computação, por exemplo na Criptografia. Um número primo é aquele que é divisível apenas por um e por ele mesmo. Faça um programa que peça um número inteiro e determine se ele é ou não um número primo.
 */

package br.com.zup.Lista7;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int numPrimo;
        int numDivisor = 0;
        int x;

        System.out.println("Por favor digite um numero");
        numPrimo = leitor.nextInt();


        for (x = 1; x <= numPrimo; x++)
        {

            if (numPrimo % x == 0) {
                numDivisor++;

            }
        }

        if (numDivisor == 2) {
            System.out.println("O numero informado  é primo ");
        } else {
            System.out.println("O numero informado não é primo");
        }
    }
}
