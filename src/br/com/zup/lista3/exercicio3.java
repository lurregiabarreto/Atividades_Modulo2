/* 3 - Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As
perguntas são:
- "Telefonou para a vítima?"
- "Esteve no local do crime?"
- "Mora perto da vítima?"
- "Devia para a vítima?"
- "Já trabalhou com a vítima?"
O programa deve no final emitir uma classificação sobre a participação da pessoa
no crime. Se a pessoa responder positivamente a 2 questões ela deve ser
classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5 como
"Assassino". Caso contrário, ele será classificado como "Inocente" */


package br.com.zup.lista3;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int contadorDeRespostas = 0;
        // Exibir as perguntas e armazenar as repostas.
        System.out.println("Olá, sou agente do FBI");
        System.out.println("Vamos te fazer algumas perguntas. ");
        System.out.println("Responda S para sim ou N para não");

        // Fazendo a primeira pergunta
        System.out.println("Telefonou para a vítima?");
        String resposta = leitor.nextLine();
        if (resposta.equals("S")) {
            contadorDeRespostas = contadorDeRespostas + 1;
        }

        System.out.println("Esteve no local do crime?");

        resposta = leitor.nextLine();
        if (resposta.equals("S")) {
            contadorDeRespostas = contadorDeRespostas + 1;
        }

        System.out.println("Mora perto da vítima?");

        resposta = leitor.nextLine();
        if (resposta.equals("S")) {
            contadorDeRespostas = contadorDeRespostas + 1;
        }

        System.out.println("Devia para a vítima?");

        resposta = leitor.nextLine();
        if (resposta.equals("S")) {
            contadorDeRespostas = contadorDeRespostas + 1;
        }

        System.out.println("Já trabalhou com a vítima?");

        resposta = leitor.nextLine();
        if (resposta.equals("S")) {
            contadorDeRespostas = contadorDeRespostas + 1;
        }

        switch (contadorDeRespostas) {

            case 2:
                System.out.println("Você é um Suspeito do crime.");
                break;

            case 3:
                System.out.println("Você é cúmplice do crime");
                break;

            case 4:
                System.out.println("Você é cúmplice do crime");
                break;

            case 5:
                System.out.println("Você é o assassino! Você está preso.");
                break;

            default:
                System.out.println("Você é inocente. Me perdoe o incômodo");
                break;
        }

    }
}
