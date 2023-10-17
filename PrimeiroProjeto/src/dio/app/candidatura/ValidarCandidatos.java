/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dio.app.candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author rodol
 */
public class ValidarCandidatos {

    public static void main(String[] args) {
        String[] candidatos = {"FELIPE", "MARCIA", "JOÃO", "PEDRO", "MARIA"};
        for(String candidato : candidatos){
            entrandoEmContato(candidato);
        }
    }
    
    static void entrandoEmContato(String candidato){
        int tentativas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        
        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando) {
                tentativas++;
            }else{
                System.out.println("CONTATO REALIZADO COM SUCESSO");
            }
        } while (continuarTentando && tentativas < 3);
        
        if(atendeu){
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativas + "ª tentativa");
        }else{
            System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + ", NUMERO MÁXIMA DE TENTATIVAS " + tentativas);
        }
    }

    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }

    static void imprimirSelecionados() {
        String[] candidatos = {"FELIPE", "MARCIA", "JOÃO", "PEDRO", "MARIA"};

        for (int i = 0; i < candidatos.length; i++) {
            System.out.println("O candidato de nº " + (i + 1) + " é " + candidatos[i]);
        }
    }

    static void selecaoCandidato() {
        String[] candidatos = {"FELIPE", "MARCIA", "JOÃO", "PEDRO", "MARIA"};

        int canditadosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000;

        while (canditadosSelecionados < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou este valor de salário: " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para vaga.");
                canditadosSelecionados++;
            }

            candidatosAtual++;
        }
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000;

        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA CANDIDATO");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDADNDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1880, 2200);
    }
}
