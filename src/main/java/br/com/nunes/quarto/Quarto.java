/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.nunes.quarto;

import java.util.Scanner;

/**
 *
 * @author Hélder
 */
public class Quarto {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        int numeroDeLinhas = scanner.nextInt(); 

        // Consumir a quebra de linha após o próximoInt()
        scanner.nextLine();

        for (int i = 0; i < numeroDeLinhas; i++) {
            String linha = scanner.nextLine();
            String linhaCorrigida = desembaralharLinha(linha);
            System.out.println(linhaCorrigida);
        }
    }

    public static String desembaralharLinha(String linha) {
        int meio = linha.length() / 2;
        String metadeEsquerda = linha.substring(0, meio);
        String metadeDireita = linha.substring(meio);

        StringBuilder sbEsquerda = new StringBuilder(metadeEsquerda);
        StringBuilder sbDireita = new StringBuilder(metadeDireita);

        sbEsquerda.reverse();
        sbDireita.reverse();

        return sbEsquerda.toString() + sbDireita.toString();
    }
}
