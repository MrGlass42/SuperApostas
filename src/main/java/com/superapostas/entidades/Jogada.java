/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.superapostas.entidades;
import java.util.Random;

/**
 *
 * @author Drada
 */
public class Jogada {
    public Cavalo cavalo;
    public Jogador jogador;
    public Jogo jogo;
    public int fatorSorte;
    
    public Jogada(Cavalo cavalo, Jogador jogador, Jogo jogo) {
        this.jogador = jogador;
        this.cavalo = cavalo;
        this.jogo = jogo;
        
        this.fatorSorte = new Random().nextInt(5);
    }
    
    public double GerarResultadoAposta(){
        return this.cavalo.forca * this.fatorSorte;
    }
    
}
