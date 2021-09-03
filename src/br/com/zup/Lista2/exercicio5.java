/* 5 - Faça um Programa que receba um número e exiba o dia correspondente da
semana. (1-Domingo, 2- Segunda, etc.), se digitar outro valor deve aparecer a
mensagem “valor inválido” */


package br.com.zup.Lista2;

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o numero que corresponde ao dia da semana:");
        System.out.println("1-Domingo, 2-Segunda, 3-terça, 4-Quarta, 5-Quinta, 6-Sexta , 7-Sábado ");

        double diaDaSemana = leitor.nextDouble();

        if ( diaDaSemana == 1){
            System.out.println("O dia da semana é Domingo");
        }
        else if (diaDaSemana ==2){
            System.out.println("O dia da semana é Segunda");
        }
        else if (diaDaSemana ==3){
            System.out.println("O dia da semana é Terça");
        }
        else if (diaDaSemana ==4){
            System.out.println("O dia da semana é Quarta");
        }
        else if (diaDaSemana ==5){
            System.out.println("O dia da semana é Quinta");
        }
        else if (diaDaSemana ==6){
            System.out.println("O dia da semana é Sexta");
        }
        else if (diaDaSemana ==7){
            System.out.println("O dia da semana é Sábado");
        }

    }
}
