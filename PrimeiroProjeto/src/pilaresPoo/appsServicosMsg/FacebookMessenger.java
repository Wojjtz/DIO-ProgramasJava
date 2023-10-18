/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilaresPoo.appsServicosMsg;

/**
 *
 * @author rodol
 */
public class FacebookMessenger extends ServicoMensagemInstantanea {
    @Override
    public void enviarMsg() {
        if(validarConectadoInternet()){
            salvarHistorico();
            System.out.println("Mensagem enviado pelo FACEBOOK.");
        }
    }

    @Override
    public void receberMsg() {
        if(validarConectadoInternet()){
            salvarHistorico();
            System.out.println("Mensagem recebida pelo FACEBOOK.");
        }
    }
}
