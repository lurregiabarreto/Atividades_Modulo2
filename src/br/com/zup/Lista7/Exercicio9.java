/* 9 - Faça um Programa que leia uma lista de 10 números e mostre-os na ordem inversa. */

package br.com.zup.Lista7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Exercicio9 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();

        int contador = 1;
        int totalDeNumeros = 10;
        int valorDigitadoPeloUsuario;

        while (contador <= totalDeNumeros){
            System.out.println("Digite o número "+ contador + " :");
            valorDigitadoPeloUsuario = leitor.nextInt();
            numeros.add(valorDigitadoPeloUsuario);
            contador++;
        }

        for (int contadorInverso = 9; contadorInverso >= 0; contadorInverso--) {
            System.out.println(numeros.get(contadorInverso));
        }


    }
}

