/* 10 - Faça um Programa que leia 4 notas, mostre as notas e a média na tela. */


package br.com.zup.Lista7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        List< Double> numeros = new ArrayList<>();

        double soma = 0;
        double valorNota;


        for (int i=1 ; i <= 4; i++){
            System.out.println("Insira a  "+i+"º nota");
           valorNota = leitor.nextDouble();
            numeros.add(valorNota);
            soma = soma + valorNota;
        }
        double media = soma / 4;

        System.out.println("Suas notas são : ");
        System.out.println(numeros);
        System.out.println("Média das suas notas é : ");
        System.out.println(media);

    }
}
