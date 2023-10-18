/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilaresPoo;

/**
 *
 * @author rodol
 */
public class Main {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.setChassi("123456");
        
        Moto z400 = new Moto();
        z400.setChassi("321654");
        
        jeep.ligar();
        z400.ligar();
        
        Veiculo qualquerVeiculo = jeep;
        qualquerVeiculo.ligar();
    }
}
