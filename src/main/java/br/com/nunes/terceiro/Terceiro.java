/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.nunes.terceiro;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
/**
 *
 * @author Hélder
 */
public class Terceiro {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tamanhoDoArray = scanner.nextInt(); 
        int alvo = scanner.nextInt(); 

        int[] array = new int[tamanhoDoArray];
        for (int i = 0; i < tamanhoDoArray; i++) {
            array[i] = scanner.nextInt(); 
        }

        int count = countPairsWithDifference(array, alvo);
        System.out.println(count);
    }

    public static int countPairsWithDifference(int[] arr, int k) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (Math.abs(arr[i] - arr[j]) == k) {
                    count++;
                }
            }
        }

        return count;
    }
}
