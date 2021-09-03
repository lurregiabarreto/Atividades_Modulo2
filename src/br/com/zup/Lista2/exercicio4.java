/* 4 - Os gestores da Zup resolveram dar um aumento de salário aos seus
colaboradores e lhe contrataram para desenvolver o programa que calcula os
reajustes. Portanto, faça um programa que recebe o salário de um colaborador e o
reajuste segundo o seguinte critério, baseado no salário atual:
● Salários até R$ 280,00 (incluindo), receberão aumento de 20%
● Salários entre R$ 280,00 e R$ 700,00 (incluindo), receberão aumento de
15%
● Salários entre R$ 700,00 e R$ 1500,00 (incluindo), receberão aumento de
10%
● Salários de R$ 1500,00 em diante, receberão aumento de 5%
Após o aumento ser realizado, informe na tela:
● O salário antes do reajuste;
● O percentual de aumento aplicado;
● O valor do aumento;
● O novo salário, após o aumento; */


package br.com.zup.Lista2;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Por favor, digite o valor do seu salário");
        double salarioZup = leitor.nextDouble();

        double aumento20 = 0.2;
        double aument015 = 0.15;
        double aumento10 = 0.10;
        double aumento5 = 0.05;
        double salario1 = salarioZup * aumento20;
        double salario2 = salarioZup * aument015;
        double salario3 = salarioZup * aumento10;
        double salario4 = salarioZup * aumento5;






        if (salarioZup <= 280 )  {
            System.out.println("O valor do salário antes do ajuste é :" + salarioZup);
            System.out.println("O percentual aplicado nesse salário é: "+aumento20);
            System.out.println("O valor aumentado foi: "+salario1);
            System.out.println("O valor do novo salário é : ");

        }
        else if (salarioZup <= 750) {
            System.out.println("O valor do salário antes do ajuste é :" + salarioZup);
            System.out.println("O percentual aplicado nesse salário é: "+aument015);
            System.out.println("O valor aumentado foi: "+salario2);
            System.out.println("O valor do novo salário é : ");

        }
        else if (salarioZup <= 1500) {
            System.out.println("O valor do salário antes do ajuste é :" + salarioZup);
            System.out.println("O percentual aplicado nesse salário é: "+aumento10);
            System.out.println("O valor aumentado foi: " +salario3);
            System.out.println("O valor do novo salário é : ");

        }
        else if (salarioZup > 1500) {
            System.out.println("O valor do salário antes do ajuste é :" + salarioZup);
            System.out.println("O percentual aplicado nesse salário é: " + aumento5);
            System.out.println("O valor aumentado foi: " + salario4);
            System.out.println("O valor do novo salário é : ");
        }


    }
}
