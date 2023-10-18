/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilaresPoo;

/**
 *
 * @author rodol
 */
public class Moto extends Veiculo {

    @Override
    public void ligar() {
        if(verificarCombustivel()){
            System.out.println("MOTO LIGADA");
        }
    }
    
    private boolean verificarCombustivel() {
        return true;
    }
}
