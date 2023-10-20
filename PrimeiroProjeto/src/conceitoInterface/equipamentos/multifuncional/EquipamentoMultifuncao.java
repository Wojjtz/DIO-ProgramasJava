/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conceitoInterface.equipamentos.multifuncional;

import conceitoInterface.equipamentos.copiadora.Copiadora;
import conceitoInterface.equipamentos.digitalizadora.Digitalizadora;
import conceitoInterface.equipamentos.impressora.Impressora;

/**
 *
 * @author rodol
 */
public class EquipamentoMultifuncao implements Copiadora, Digitalizadora, Impressora{
     
    @Override
    public void copiar() {
        System.out.println("COPIANDO MULTIFUNÇÂO");
    }

    @Override
    public void digitalizar() {
        System.out.println("DIGITALIZANDO MULTIFUNÇÂO");
    }

    @Override
    public void imprimir() {
        System.out.println("IMPRIMINDO MULTIFUNÇÂO");
    }
}
