/* 4. Faça um programa que leia n números inteiros positivos e calcule a soma desses números.*/

package br.com.zup.Lista6;

import java.util.Scanner;

public class exericio4 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int numerosUsuario;
        int soma = 0;
        int contador = 1;
        int numDigitado;


        System.out.println("Por favor digite quantos numeros deseja inserir , porém numeros positivos e inteiros");
        numerosUsuario = leitor.nextInt();

        while (contador <= numerosUsuario){
            System.out.println("Digite o " + contador + "º número");
            numDigitado = leitor.nextInt();
            soma = soma + numDigitado;

            contador ++;

            if (numDigitado < 0){
                System.out.println("Por favor, digite 'somente' numeros positivos e inteiros");
            }
            else {
                System.out.println("A soma dos números inseridos é de: "+soma);
            }


        }
    }
}
