 /* 1 - Faça um programa para ler uma quantidade de números (N) digitada pelo
usuário e mostrar a quantidade de números pares desses números. */

package br.com.zup.Lista5;

 import java.util.Scanner;

 public class exercicio1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int qtdDeNumerosPares = 0;
        int contador = 1;

        System.out.println("Digite a quantidade de números que você deseja digitar: ");
        double qtdDeNumeros = leitor.nextDouble();

        while (contador <= qtdDeNumeros){


            System.out.println("Digite o numero " +contador+ " :");
            double valorDigitadoPeloUsuario = leitor.nextDouble();


            if (valorDigitadoPeloUsuario % 2 == 0){
                qtdDeNumerosPares = qtdDeNumerosPares + 1;

            }

            contador ++;
        }

        System.out.println("A quantidade de números pares é: " +qtdDeNumerosPares);


    }
}
