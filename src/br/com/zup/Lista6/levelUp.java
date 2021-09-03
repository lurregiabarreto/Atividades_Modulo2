 /* LEVEL UP. Faça um programa que some os números ímpares contidos em um
intervalo definido pelo usuário. O usuário define o valor inicial do intervalo e o valor
final deste intervalo e o programa deve somar todos os números ímpares contidos
neste intervalo. Caso o usuário digite um intervalo inválido (começando por um valor
maior que o valor final) deve ser escrito uma mensagem de erro na tela, “Intervalo
de valores inválido” e o programa termina*/

package br.com.zup.Lista6;

 import java.util.Scanner;

 public class levelUp {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int soma = 0;
        int valorInicial;
        int valorFinal;



        System.out.println("Você deve inserir numeros dentro de um interevalo e nós vamos somar os números impares");
        System.out.println("Agora, digite o valor inicial do intervalo");
        valorInicial = leitor.nextInt();
        System.out.println("Agora digite o valor final deste intervalo");
        valorFinal = leitor.nextInt();


        if (valorInicial < valorFinal) {


            while (valorInicial <= valorFinal) {
                if (valorInicial % 2 == 0) {
                    valorInicial = valorInicial + 1;
                }
                soma = soma + valorInicial;
                valorInicial = valorInicial + 2;

            }
            System.out.println("A soma desses números é : "+soma);
        }

        else {
            System.out.println("Intervalo de valores inválido" );
        }

    }
}
