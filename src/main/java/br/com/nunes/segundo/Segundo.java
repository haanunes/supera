/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.nunes.segundo;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Hélder
 */
public class Segundo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); // Define a localidade para usar ponto como separador decimal

        double valor = scanner.nextDouble();
        int notas100Reais, notas50Reais, notas20Reais, notas10Reais, notas5Reais, notas2Reais;
        int moedas1Real, moedas50Centavos, moedas25Centavos, moedas10Centavos, moedas5Centavos, moedas1Centavo;

        notas100Reais = (int) (valor / 100);
        valor %= 100;

        notas50Reais = (int) (valor / 50);
        valor %= 50;

        notas20Reais = (int) (valor / 20);
        valor %= 20;

        notas10Reais = (int) (valor / 10);
        valor %= 10;

        notas5Reais = (int) (valor / 5);
        valor %= 5;

        notas2Reais = (int) (valor / 2);
        valor %= 2;

        // Cálculo das moedas
        moedas1Real = (int) (valor / 1);
        valor %= 1;

        moedas50Centavos = (int) (valor / 0.5);
        valor %= 0.5;

        moedas25Centavos = (int) (valor / 0.25);
        valor %= 0.25;

        moedas10Centavos = (int) (valor / 0.10);
        valor %= 0.10;

        moedas5Centavos = (int) (valor / 0.05);
        valor %= 0.05;

        moedas1Centavo = (int) (valor / 0.01);

        System.out.println("NOTAS:");
        System.out.println(notas100Reais + " nota(s) de R$ 100.00");
        System.out.println(notas50Reais + " nota(s) de R$ 50.00");
        System.out.println(notas20Reais + " nota(s) de R$ 20.00");
        System.out.println(notas10Reais + " nota(s) de R$ 10.00");
        System.out.println(notas5Reais + " nota(s) de R$ 5.00");
        System.out.println(notas2Reais + " nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println(moedas1Real + " moeda(s) de R$ 1.00");
        System.out.println(moedas50Centavos + " moeda(s) de R$ 0.50");
        System.out.println(moedas25Centavos + " moeda(s) de R$ 0.25");
        System.out.println(moedas10Centavos + " moeda(s) de R$ 0.10");
        System.out.println(moedas5Centavos + " moeda(s) de R$ 0.05");
        System.out.println(moedas1Centavo + " moeda(s) de R$ 0.01");
    }
}
