/* 2 - Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho
em metros quadrados da área a ser pintada. Considere que a cobertura da tinta é
de 1 litro para cada 6 metros quadrados e que a tinta é vendida em latas de 18
litros, que custam R $80,00 ou em galões de 3,6 litros, que custam R $25,00.
Informe ao usuário as quantidades de tinta a serem compradas e os respectivos
preços em 3 situações:
● comprar apenas latas de 18 litros;
● comprar apenas galões de 3,6 litros;
DESAFIO: De forma que o desperdício de tinta seja menor. Acrescente 10% de
folga e sempre arredonde os valores para cima, isto é, considere latas cheias */


package br.com.zup.Lista2;

public class sequencial2 {
    public static void main(String[] args) {

                double areaTotal = 200;
                double galaoLitros = 3.6;
                int lataLitros = 18;
                int coberturaPorLitro = 6;
                int lataPreco = 80;
                int galaoPreco = 25;


                double coberturaLata = lataLitros * coberturaPorLitro;
                double coberturaGalao = galaoLitros * coberturaPorLitro;


                double latasNecessarias = areaTotal / coberturaLata;
                double areaRestanteLata = areaTotal % coberturaLata;
                double quantidadeDeLatas = (areaTotal - areaRestanteLata) / coberturaLata;
                double restanteUltimaLata = coberturaLata - areaRestanteLata;
                double ultimaLata = (areaRestanteLata + restanteUltimaLata) / coberturaLata;
                double totalDeLatas = quantidadeDeLatas + ultimaLata;
                double precoTotalLata = totalDeLatas * lataPreco;


                double galoesNecessarios = areaTotal / coberturaGalao;
                double areaRestanteGalao = areaTotal % coberturaGalao;
                double quantidadeDeGaloes = (areaTotal - areaRestanteGalao) / coberturaGalao;
                double restanteUltimoGalao = coberturaGalao - areaRestanteGalao;
                double ultimoGalao = (areaRestanteGalao + restanteUltimoGalao) / coberturaGalao;
                double totalDeGaloes = quantidadeDeGaloes + ultimoGalao;
                double precoTotalGalao = totalDeGaloes * galaoPreco;


                double areaRestanteGalao_preenchimento = areaRestanteLata % coberturaGalao;
                double quantidadeDeGaloes_preenchimento = (areaRestanteLata - areaRestanteGalao_preenchimento) / coberturaGalao;
                double restanteUltimoGalao_preenchimento = coberturaGalao - areaRestanteGalao_preenchimento;
                double ultimoGalao_preenchimento = (areaRestanteGalao_preenchimento + restanteUltimoGalao_preenchimento) / coberturaGalao;
                double totalDeGaloes_preenchimento = quantidadeDeGaloes_preenchimento + ultimoGalao_preenchimento;
                double precoTotalLata_preenchimento = quantidadeDeLatas * lataPreco;
                double precoTotalGalao_preenchimento = totalDeGaloes_preenchimento * galaoPreco;
                double totalDaCompra_preenchimento = precoTotalGalao_preenchimento + precoTotalLata_preenchimento;


                System.out.println("Tendo em vista que você quer pintar " + areaTotal + "m², utilizando uma lata de " + lataLitros + " litros, será necessário utilizar " + latasNecessarias + " Latas de tinta. Logo, voce precisará comprar " + totalDeLatas + " latas de tinta. Como a unidade hoje está a R$" + lataPreco + " o total dará R$" + precoTotalLata);
                System.out.println("Agora se quiser utilizar nossos galões de " + galaoLitros + " litros, serão necessários " + galoesNecessarios + " destes galões. Tendo visto, você precisará comprar " + totalDeGaloes + " galões pra cobrir toda esta área. A unidade deles hoje está R$" + galaoPreco + ", totalizando pra você R$" + precoTotalGalao);
                System.out.println("Para te darmos o melhor custo benefício e com o objetivo de evitarmos desperdício, calculamos pra você a melhor combinação de compra. Ela é:");
                System.out.println(quantidadeDeLatas + " latas, custando R$" + precoTotalLata_preenchimento + " e para completar sua pintura serão necessários " + totalDeGaloes_preenchimento + " galões, custando R$" + precoTotalGalao_preenchimento + ". Optando por este pacote o total da sua compra será R$" + totalDaCompra_preenchimento);

            }
        }


