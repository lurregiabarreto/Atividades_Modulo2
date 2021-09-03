/*5. Escreva um programa que declare um inteiro, inicialize-o com 0, e incremente-o de 1000 em 1000, imprimindo seu valor na tela, até que seu valor seja 100000 (cem mil).*/

package br.com.zup.Lista6;

public class exericio5 {
    public static void main(String[] args) {

        int contador = 0;
        int visualizar = 0;
        int valor = 100000 / 1000;


        while (contador <= valor) {
            System.out.println(visualizar);
            visualizar += 1000;
            contador++;

        }
    }
}
