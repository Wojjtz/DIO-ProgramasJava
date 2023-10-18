/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilaresPoo;

/**
 *
 * @author rodol
 */
public class Carro extends Veiculo{

    @Override
    public void ligar() {
        if (verificarCombustivel() && verificarCambio()) {
            System.out.println("CARRO LIGADO");
        }
    }

    private boolean verificarCombustivel() {
        return true;
    }
    
    private boolean verificarCambio(){
        return true;
    }
    
}
