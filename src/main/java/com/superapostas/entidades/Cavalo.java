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
public class Cavalo {
    public String nome;
    public double forca;
    
    public Cavalo(String nome) {
        this.nome = nome;
        this.forca = new Random().nextDouble(100.0);
    }
}
