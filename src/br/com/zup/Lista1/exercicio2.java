/* 2 - Faça um
programa que receba 4 notas bimestrais e mostre a média aritmética. */

package br.com.zup.Lista1;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {

            //Instanciar o Scanner
            Scanner leitor = new Scanner(System.in);

            //Declarar o valor de todas as variáveis
            float nota1;
            float nota2;
            float nota3;
            float nota4;
            float soma;
            float média;

            //receber o valor das variáveis
            System.out.println("Por favor, digita sua primeira nota: ");
            nota1 = leitor.nextFloat();

            System.out.println("Por favor, digita sua segunda nota: ");
            nota2 = leitor.nextFloat();

            System.out.println("Por favor, digita sua terceira nota: ");
            nota3 = leitor.nextFloat();

            System.out.println("Por favor, digita sua quarta nota: ");
            nota4 = leitor.nextFloat();

            //Processar os dados

            soma = nota1 + nota2 + nota3 + nota4;
            média = soma / 4;

            //Exibir os dados
            System.out.println("Sua média bimestral é:" + média);


        }
    }
