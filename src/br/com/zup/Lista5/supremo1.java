/* Faça um programa que receba um conjunto de N números (Digitado pelo usuário) e
mostre:
a. O menor valor
b. O maior valor
c. A soma dos valores */


package br.com.zup.Lista5;

import java.util.Scanner;

public class supremo1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double maiorNumero = 0;
        double menorNumero = 0;
        double somaDosNumeros = 0;
        double valorLidoPeloUsuario;
        int contador = 1;

        System.out.println("Digite a quantidade de valores a ser informada: ");
        double quantidadeDeValores = leitor.nextDouble();

        while (contador <= quantidadeDeValores) {
            System.out.println("Digite o número " + contador + " :");
            valorLidoPeloUsuario = leitor.nextDouble();


            if (contador == 1) {
                menorNumero = valorLidoPeloUsuario;
                maiorNumero = valorLidoPeloUsuario;
            } else {
                if (valorLidoPeloUsuario <= menorNumero) {
                    menorNumero = valorLidoPeloUsuario;
                }
                if (valorLidoPeloUsuario >= maiorNumero) {
                    maiorNumero = valorLidoPeloUsuario;
                }
            }

            somaDosNumeros = somaDosNumeros + valorLidoPeloUsuario;

            contador ++;

        }
        System.out.println("O menor número é: " +menorNumero);
        System.out.println("O maior número é: " +maiorNumero);
        System.out.println("A soma de todos os números é: "+somaDosNumeros);


    }
}
