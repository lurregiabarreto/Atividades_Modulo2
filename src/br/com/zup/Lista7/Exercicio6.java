/* 6 - Faça um programa que imprima na tela apenas os números ímpares entre 1 e 50.
 */

package br.com.zup.Lista7;

public class Exercicio6 {
    public static void main(String[] args) {

        for (int i = 1 ; i <= 50; i++)
        if (i % 2 == 1 )
        System.out.println("O número " + i + " é impar");

    }
}
