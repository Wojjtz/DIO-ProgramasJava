/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilaresPoo.appsServicosMsg;

/**
 *
 * @author rodol
 */
public abstract class ServicoMensagemInstantanea {
    public abstract void enviarMsg();
    public abstract void receberMsg();

    protected boolean validarConectadoInternet() {
        System.out.println("Conectado a internet");
        return true;
    }
    
    protected void salvarHistorico(){
        System.out.println("Histórico salvo");
    }
}
