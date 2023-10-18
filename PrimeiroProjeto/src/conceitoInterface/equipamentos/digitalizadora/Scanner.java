/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conceitoInterface.equipamentos.digitalizadora;

/**
 *
 * @author rodol
 */
public class Scanner implements Digitalizadora{

    @Override
    public void digitalizar() {
        System.out.println("DIGITALIZANDO");
    }
    
}
