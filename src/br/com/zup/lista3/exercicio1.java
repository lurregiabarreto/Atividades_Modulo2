/* 1 - Faça um programa para o cálculo de uma folha de pagamento, sabendo que os
descontos são do Imposto de Renda, que depende do salário bruto (conforme
tabela abaixo) e 10% para o INSS e que o FGTS corresponde a 11% do Salário
Bruto, mas não é descontado (é a empresa que deposita). O Salário Líquido
corresponde ao Salário Bruto menos os descontos. O programa deverá pedir ao
usuário o valor da sua hora e a quantidade de horas trabalhadas no mês.
Desconto do IR:
Salário Bruto até 900 (inclusive) - isento
Salário Bruto até 1500 (inclusive) - desconto de 5%
Salário Bruto até 2500 (inclusive) - desconto de 10%
Salário Bruto acima de 2500 - desconto de 20%
*/

package br.com.zup.lista3;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.println("Por favor digite a quantidade de horas trabalhadas:");
        double horasTrabalhadas = leitor.nextDouble();
        System.out.println("Por favor digite o valor recebido por hora trabalhada:");
        double valorDaHora = leitor.nextDouble();

        double salarioBruto =(horasTrabalhadas * valorDaHora);

        double impostoDeRenda = 0;
        double inss = (0.1 * salarioBruto);
        double fgts = (0.11 * salarioBruto);

        if(salarioBruto > 0 & salarioBruto <= 900){
            impostoDeRenda = 0;
        }
        else if(salarioBruto > 900 & salarioBruto <= 1500){
            impostoDeRenda= (0.05 * salarioBruto);
        }
        else if(salarioBruto > 1500 & salarioBruto <= 2500){
            impostoDeRenda= (0.1 * salarioBruto);
        }
        else if(salarioBruto > 2500){
            impostoDeRenda= (0.2 * salarioBruto);
        } else{
            System.out.println("Por favor digite uma opção válida");
        }

        double salarioLiquido = salarioBruto - impostoDeRenda - inss;

        System.out.println("Agradecemos as informações. O cálculo do seu salário se encontra descrito abaixo:");
        System.out.println();
        System.out.printf("\tSalário Bruto: (%.0f * %.0f)\t\t: R$ %.2f \n", valorDaHora, horasTrabalhadas, salarioBruto);
        System.out.printf("\t(-) IR (%.0f%%)\t\t\t\t\t\t: R$ %.2f\n", ((impostoDeRenda / salarioBruto) * 100), impostoDeRenda);
        System.out.printf("\t(-) INSS (%.0f%%)\t\t\t\t\t: R$ %.2f\n",((inss/salarioBruto)*100), inss);
        System.out.printf("\tFGTS (%.0f%%)\t\t\t\t\t\t: R$ %.2f\n",((fgts/salarioBruto)*100), fgts);
        System.out.printf("\tTotal de descontos\t\t\t\t: R$ %.2f\n",(salarioBruto - salarioLiquido));
        System.out.printf("\tSalário Liquido\t\t\t\t\t: R$ %.2f\n",(salarioLiquido));

    }
}

