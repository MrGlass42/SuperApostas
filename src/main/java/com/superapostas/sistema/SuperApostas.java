
package com.superapostas.sistema;

import com.superapostas.entidades.Jogador;
import com.superapostas.entidades.Jogo;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Drada
 */
public class SuperApostas {
    
    public static ArrayList<Jogo> jogos = new ArrayList();
    public static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        System.out.println("Boa noite !!!\n\nComece a cadastrar os jogos...");
        
        while(true) {
            System.out.println("Digite o nome do jogo:");
            String nome = scanner.nextLine();
            
            jogos.add(new Jogo(nome));
            
            System.out.println("Deseja cadastrar mais um jogo ?\n\n1 -- Sim\n2 -- Nao");
            if(Integer.valueOf(scanner.nextLine()) == 2)
                break;
        }
        
        //for (int i = 0; i < jogos.size(); i++) {
        //    System.out.println("Jogo: " + jogos.get(i).nome);
        
        for (Jogo jogo : jogos) {
            System.out.println("Jogo: " + jogo.nome);
            
            while(true) {
                System.out.println("\n\nDigite o nome do jogador:");
                String nomeJogador = scanner.nextLine();
                
                System.out.println("\n\nDigite o saldo do jogador:");
                float saldoJogador = Float.valueOf(scanner.nextLine());
                
                jogo.AdicionarJogador(new Jogador(nomeJogador, saldoJogador));
                
                System.out.println("znDeseja adicionar mais um jogador ?\n\n1 -- Sim\n2 -- Nao");
                if(Integer.valueOf(scanner.nextLine()) == 2)
                    break;
            }
            
            System.out.println("\n\nJogadores para o jogo: " + jogo.nome + " adicionados");
        }
        
//        for (Jogo jogo : jogos) {
//            System.out.println("\n\nNome do jogo: " + jogo.nome);
//            for (int i = 0; i < jogo.ConsultarQtdeJogadores(); i++) 
//                System.out.println("\nNome do jogador: " + jogo.jogadores.get(i).nome +  ", saldo --> " + jogo.jogadores.get(i).saldo);
//        }

           // (DataJogo) - NomeJogo - Jogador --> Pontuacao
        
    }
}
