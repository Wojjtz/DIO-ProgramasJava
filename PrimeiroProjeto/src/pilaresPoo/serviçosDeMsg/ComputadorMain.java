/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilaresPoo.serviçosDeMsg;

import pilaresPoo.appsServicosMsg.ServicoMensagemInstantanea;
import pilaresPoo.appsServicosMsg.Telegram;
import pilaresPoo.appsServicosMsg.MSNMessenger;
import pilaresPoo.appsServicosMsg.FacebookMessenger;
import java.util.Scanner;

/**
 *
 * @author rodol
 */
public class ComputadorMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*
        System.out.println("MSN");
        MSNMessenger msn = new MSNMessenger();
        msn.enviarMsg();
        msn.receberMsg();
        
        System.out.println("\nFacebook");
        FacebookMessenger fcb = new FacebookMessenger();
        fcb.enviarMsg();
        fcb.receberMsg();
        
        System.out.println("\nTelegram");
        Telegram tl = new Telegram();
        tl.enviarMsg();
        tl.receberMsg();
        */
        
        ServicoMensagemInstantanea smi;
        
        System.out.println("Qual serviço de mensagem você prefere? msn/facebook/telegram");
        
        switch (in.next()) {
            case "msn":
                smi = new MSNMessenger();
                break;
            case "facebook":
                smi = new FacebookMessenger();
                break;
            case "telegram":
                smi = new Telegram();
                break;
            default:
                throw new AssertionError();
        }
        
        smi.enviarMsg();
        smi.receberMsg();
    }
}
