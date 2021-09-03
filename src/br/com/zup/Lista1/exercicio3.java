/* 3 - Faça um
programa que converta metros para centímetros. */

package br.com.zup.Lista1;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);


        float qntEmMetros;
        float qntEmCentimetros;

        System.out.println("Digite a quantidade em metros: ");
        qntEmMetros = leitor.nextFloat();

        System.out.println("Digite a quantidade em centimetros: ");
        qntEmCentimetros = leitor.nextFloat();


        float metrosPCentimetros = qntEmMetros / 100;
        float centimetrosPmetros =  qntEmCentimetros * 100;

        System.out.println("A quantidade em metros é: " +metrosPCentimetros);
        System.out.println("A quantidade em centimetros é: " +centimetrosPmetros);
    }
}
