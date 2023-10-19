/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafios.bancoDigital;

/**
 *
 * @author rodol
 */
public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNome("Rodolfo");
        
        Conta cc = new ContaCorrente(cliente);
        Conta cp = new ContaPoupanca(cliente);
        
        cc.depositar(100);
        cc.transferir(cp,20);
        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
