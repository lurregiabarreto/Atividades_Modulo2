/* 1 - Escreva um programa que escreva na tela, de 1 até 100, de 1 em 1, 2 vezes. A primeira vez com "for" e a segunda com "while".
*/

package br.com.zup.Lista6;

public class exercicio1 {
    public static void main(String[] args) {



        for ( int contador = 1; contador <= 100 ; contador ++){
            System.out.println(contador);
        }
        int contador = 1;

        while (contador <= 100 ){
            System.out.println(contador);
            contador ++;
        }

    }
}
