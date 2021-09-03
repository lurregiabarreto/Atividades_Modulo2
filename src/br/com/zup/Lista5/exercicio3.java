/* 3 - Faça um programa para ler uma quantidade de números (N) digitada pelo
usuário e mostrar a quantidade de números pares e a quantidade de números
ímpares desses números.
 */

package br.com.zup.Lista5;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int qntDeNumeros= 0;
        int numPares = 0;
        int numImpares = 0;
        int contador = 1;


        System.out.println("Por favor, digite a quantidade de numeros que deseja digitar");
        double quantidadeDeNumeros = leitor.nextDouble();

        while (contador <= quantidadeDeNumeros){


            System.out.println("Digite o numero " +contador+ " :");
            double valorDigitadoPeloUsuario = leitor.nextDouble();

            //Numeros pares

            if (valorDigitadoPeloUsuario % 2 == 0)
                numPares ++;


            // numeros impares

            else  if (valorDigitadoPeloUsuario % 2 == 1){
                numImpares ++;
            }

            contador ++;
        }

        System.out.println("A quantidade de números Impares é: " +numImpares);
        System.out.println("A quantidade de números pares é: " +numPares);



    }
}
