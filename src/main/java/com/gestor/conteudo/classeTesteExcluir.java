package com.gestor.conteudo;

import java.security.SecureRandom;
import java.util.Random;

public class classeTesteExcluir {
    public static void main(String[] args) {
        int linhas = 3;
        int colunas= 5;
        int[][] matriz = new int[linhas][colunas];

        for (int l = 0; l <linhas; l++) {
        for(int c = 0; c< colunas; c++){
            matriz[l][c] = new SecureRandom().nextInt(100);
        }
        }

        for (int l = 0; l <linhas; l++) {
            for (int c = 0; c < colunas; c++) {
                System.out.printf("%2d |", matriz[l][c]);
            }
            System.out.printf("%n");
        }


    }
}
