/* 4 - Faça um Programa que recebe o quanto você ganha por hora e o número de
horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês */

package br.com.zup.Lista1;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        float qntDeHorasTrabalhadas ;
        float salarioPorHoras;

        System.out.println("Digite a quantidade de horas trabalahadas: ");
        qntDeHorasTrabalhadas = leitor.nextFloat();

        System.out.println("Digite o salário por horas: ");
        salarioPorHoras = leitor.nextFloat();



        float salarioBruto= qntDeHorasTrabalhadas * salarioPorHoras;

        System.out.println("Você trabalhou "+ qntDeHorasTrabalhadas + "e recebeu " +salarioPorHoras);
        System.out.println("Portanto seu lário este mês é R$ " + salarioBruto);

    }

}
