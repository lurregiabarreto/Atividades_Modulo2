/* 6 - Faça um Programa que receba o quanto você ganha por hora e o número de
horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês,
sabendo-se que são descontados 11% para o Imposto de Renda, 8% para o INSS e
5% para o sindicato, faça um programa que nos dê respectivamente:
a. Salário bruto.
b. Quanto pagou ao INSS.
c. Quanto pagou ao sindicato.
d. Qual o salário líquido do funcionário */

package br.com.zup.Lista1;

public class exercicio6 {
    public static void main(String[] args) {
        float salarioPorHora= 45.8f;
        float salarioPorHoraMes=25.2f;

        float salario = salarioPorHora * salarioPorHoraMes ;

        System.out.println("Se salário  é : R$ " + salario);

        float salarioBruto = (salario - 0.11f * salario);
        System.out.println("O valor pago ao imposto de renda  é : " +salarioBruto);

        float inss =(salario - 0.08f * salario);
        System.out.println("O valor pago ao inss é: " +inss);

        float sindicato = (salario - 0.05f * salario);
        System.out.println("O valor pago ao sindicato foi : "+ sindicato);

    }
}
