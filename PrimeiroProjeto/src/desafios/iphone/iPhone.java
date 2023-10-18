/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafios.iphone;

import desafios.iphone.interfaces.AparelhoTelefonico;
import desafios.iphone.interfaces.Navegador;
import desafios.iphone.interfaces.ReprodutorMusical;

/**
 *
 * @author rodol
 */
public class iPhone implements ReprodutorMusical, AparelhoTelefonico, Navegador{
    private boolean tocando = false;
    private boolean pausado = false;
    private String musicaAtual;
    
    @Override
    public void tocar() {
        if(!tocando){
            System.out.println("Tocando");
            tocando = true;
        }else{
            System.out.println("Parando de tocar");
            tocando = false;
        }
    }

    @Override
    public void pausar() {
        if(tocando && !pausado){
            System.out.println("Pausado");
            pausado = true;
        }else{
            System.out.println("Não pausado");
        }
        
    }

    @Override
    public void selecionarMusica(String musica) {
        if(musica != musicaAtual){
            musicaAtual = musica;
            System.out.println("Música selecionada");
        }
    }

    @Override
    public void ligar() {
        System.out.println("Ligando...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo nova página");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova Aba adicionada");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada");
    }
    
}
