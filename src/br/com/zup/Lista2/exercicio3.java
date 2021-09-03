/* 3 - Faça um programa que receba duas notas parciais de um aluno. O programa
deve calcular a média alcançada por aluno e apresentar:
○ A mensagem "Aprovado", se a média alcançada for maior ou igual a
sete;
○ A mensagem "Reprovado", se a média for menor do que sete;
○ A mensagem "Aprovado com Distinção", se a média for igual a dez. */


package br.com.zup.Lista2;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner leitor =  new Scanner (System.in);


        System.out.println("Por favor, digite sua primeira nota");
        double nota1 = leitor.nextDouble();

        System.out.println("Por favor, digite sua segunda nota");
        double nota2 = leitor.nextDouble();

        double média = (nota1 + nota2)/ 2 ;

        if(média >=7){
            System.out.println("Parabéns, você está aprovado" +média);
        }

        else if (média <= 7){
            System.out.println("Poxa, infelizmente você está reprovado" +média);
        }

        else if (média ==10){
            System.out.println("Aprovado por distinção" +média);
        }

        else {
            System.out.println("Por favor coloque sua nota corretamente");
        }

    }
}
