/* 3 - Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10. O usuário deve informar de qual número ele deseja ver a tabuada.  */

package br.com.zup.Lista7;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int valor;

        System.out.println("Por favor digite o valor da tabuada que deseja a multipliacação");
        valor = leitor.nextInt();

        for (int multi = 0; multi <= 10; multi++){

            System.out.println(valor + " X " + multi + " = " + (valor * multi));

        }
    }
}