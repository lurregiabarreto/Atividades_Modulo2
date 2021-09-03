/* 5 - Faça um programa que leia 5 números e informe o maior número. */

package br.com.zup.Lista7;

public class Exercicio5 {
    public static void main(String[] args) {

        int num1 = 8;
        int num2 = 3;
        int num3 = 29;
        int num4 = 28;
        int num5 = 11;

        if (num1 > num2 & num1 > num3 & num1 > num4 & num1 > num5)
            System.out.println("O numero " +num1 + " é o maior numero");

        else if (num2 > num1 & num2 > num3 & num2 > num4 & num2 > num5)
            System.out.println("O numero " +num2 + " é o maior numero");

        else if (num3 > num1 & num3 > num2 & num3 > num4 & num3 > num5)
            System.out.println("O numero " +num3 + " é o maior numero");

        else if (num4 > num1 & num4 > num3 & num4 > num2 & num4 > num5)
            System.out.println("O numero " +num4 + " é o maior numero");

        else{
            System.out.println("O numero" +num5 + " é o maior numero");
        }






    }
}
