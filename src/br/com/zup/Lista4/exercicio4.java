 /* 4 - Escreva, usando while, um programa para calcular a média de N números. O
valor de N é dado pelo usuário */

package br.com.zup.Lista4;

 import java.util.Scanner;

 public class exercicio4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double qntDeNumeros;
        double soma = 0;
        double media = 0;
        int contador = 0;

        System.out.println("Digite a quantidade de números: ");
        qntDeNumeros = leitor.nextDouble();

        while (contador < qntDeNumeros){
                System.out.println("Digite um número: ");


        double usuario = leitor.nextDouble();
        soma = soma + usuario;
        contador ++;
        }

        media = soma / qntDeNumeros;

        System.out.println("A média aritmética dos números é: " +media);

    }
}
