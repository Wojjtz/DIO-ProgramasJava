/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dio.programas.desafios;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author rodol
 */
public class Contador {

    public static void main(String[] args) throws ParametrosInvalidosException {
        Scanner terminal = new Scanner(System.in);
        int parametroUm = 0, parametroDois = 0;
        try {
            System.out.println("Digite o primeiro parâmetro");
            parametroUm = terminal.nextInt();

            System.out.println("Digite o segundo parâmetro");
            parametroDois = terminal.nextInt();

        } catch (InputMismatchException e) {
            System.out.println("Parâmetros inválidos. Aceita-se somente números inteiros.");
        }

        contar(parametroUm, parametroDois);
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }

        int contagem = parametroDois - parametroUm;
        for (int i = 0; i < contagem; i++) {
            System.out.println((i + 1));
        }
    }

    static class ParametrosInvalidosException extends Exception {
    }
}
