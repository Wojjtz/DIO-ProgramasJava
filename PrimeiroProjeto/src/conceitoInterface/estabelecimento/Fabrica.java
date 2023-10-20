/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conceitoInterface.estabelecimento;

import conceitoInterface.equipamentos.copiadora.Copiadora;
import conceitoInterface.equipamentos.digitalizadora.Digitalizadora;
import conceitoInterface.equipamentos.impressora.Impressora;
import conceitoInterface.equipamentos.multifuncional.EquipamentoMultifuncao;

/**
 *
 * @author rodol
 */
public class Fabrica {
    public static void main(String[] args) {
        EquipamentoMultifuncao em = new EquipamentoMultifuncao();
        Impressora impressora = em;
        Digitalizadora digitalizdora = em;
        Copiadora copiadora = em;
        Impressora im = new EquipamentoMultifuncao();
        
        
        
        impressora.imprimir();
        digitalizdora.digitalizar();
        copiadora.copiar();
        
    }
}
