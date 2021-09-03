/* 2 - Faça um Programa que leia um número e exiba o dia correspondente da semana. (1-Domingo, 2- Segunda, etc.), se digitar outro valor deve aparecer valor inválido. */

package br.com.zup.Lista7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        List<Integer> numDaSemana = new ArrayList<>();

        int diaDaSemana;
        int contador =0;


        System.out.println("Digite o numero que corresponde ao dia da semana:");
        System.out.println("1-Domingo, 2-Segunda, 3-terça, 4-Quarta, 5-Quinta, 6-Sexta , 7-Sábado ");
        diaDaSemana = leitor.nextInt();

        if ( diaDaSemana == 1){
            System.out.println("O dia da semana é Domingo");
            numDaSemana.add(diaDaSemana);
            contador ++;
        }
        else if (diaDaSemana ==2){
            System.out.println("O dia da semana é Segunda");
            numDaSemana.add(diaDaSemana);
            contador ++;
        }
        else if (diaDaSemana ==3){
            System.out.println("O dia da semana é Terça");
            numDaSemana.add(diaDaSemana);
            contador ++;
        }
        else if (diaDaSemana ==4){
            System.out.println("O dia da semana é Quarta");
            numDaSemana.add(diaDaSemana);
            contador ++;
        }
        else if (diaDaSemana ==5){
            System.out.println("O dia da semana é Quinta");
            numDaSemana.add(diaDaSemana);
            contador ++;
        }
        else if (diaDaSemana ==6){
            System.out.println("O dia da semana é Sexta");
            numDaSemana.add(diaDaSemana);
            contador ++;
        }
        else if (diaDaSemana ==7){
            System.out.println("O dia da semana é Sábado");
            numDaSemana.add(diaDaSemana);
            contador ++;
        }

    }
}
