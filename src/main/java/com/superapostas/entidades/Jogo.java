/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.superapostas.entidades;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Drada
 */
public class Jogo {
    public String nome;
    public LocalDate data;
    public ArrayList<Jogador> jogadores;
    
    public Jogo(String nome) {
        this.nome = nome;
        this.data = LocalDate.now();
        this.jogadores = new ArrayList();
    }
    
    public void AdicionarJogador(Jogador jogador){
        this.jogadores.add(jogador);
    }
    
    public int ConsultarQtdeJogadores(){
        return this.jogadores.size();
    }
}
