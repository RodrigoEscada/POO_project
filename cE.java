/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package companhiaespetaculos_musica;

import static companhiaespetaculos_musica.Main.*;
import java.util.ArrayList;
import myinputs.Ler;

/**
 *
 * @author Rodrigo
 */
public class cE {
    
    public static String Atores(ArrayList<Espetaculo> e, int i){
        String s = "";
        for(int j = 0; j < e.get(i).getAtores().size(); j++){
                s += "\nNome: " + e.get(i).getAtores().get(j);
        }
        return s;
    }
    
    public static String Realizadores(ArrayList<Espetaculo> e, int i){
        String s = "";
        for(int j = 0; j < e.get(i).getRealizadores().size(); j++){
                s += "\nNome: " + e.get(i).getRealizadores().get(j);
        }
        return s;
    }
    
    public static String Compositores(ArrayList<Espetaculo> e, int i){
        String s = "";
        for(int j = 0; j < e.get(i).getCompositores().size(); j++){
                s += "\nNome: " + e.get(i).getCompositores().get(j);
        }
        return s;
    }
    
    public static String TecnicosLuzSom(ArrayList<Espetaculo> e, int i){
        String s = "";
        for(int j = 0; j < e.get(i).getTecnicosLuzSom().size(); j++){
                s += "\nNome: " + e.get(i).getTecnicosLuzSom().get(j);
        }
        return s;
    }
    
    public static void ceNome(ArrayList<Espetaculo> e){
        
        boolean flag = true;
        String n;
        System.out.println("Insira o nome da espetáculo a consultar: ");
        
        while(flag){
            System.out.println(toStringe(e));
            n = Ler.umaString();
            
            for(int i = 0; i < e.size(); i++){
                if(e.get(i).getNome().equals(n)){
                    System.out.println("Atores: \n" + Atores(e,i));
                    System.out.println("Realizadores: \n" + Realizadores(e,i));
                    System.out.println("Compositores: \n" + Compositores(e,i));
                    System.out.println("Tecnicos de luz/som: \n" + TecnicosLuzSom(e,i));
                    System.out.println("\n");
                    flag = false;
                }
            }
            if(flag == true){
                System.out.println("O nome que introduziu nao corresponde a nenhum espetáculo!\n");
                System.out.println("Tente novamente!");
            }
        }
    }
    
    public static void ceId(ArrayList<Espetaculo> e){
        
        boolean flag = true;
        int id;
        System.out.println("Insira o Id do espetaculo a consultar: ");
        
        while(flag) {
            System.out.println(toStringe(e));
            id = Ler.umInt();
        
            for(int i = 0; i < e.size(); i++)   {
            
                if(id == e.get(i).getId())    {
                    System.out.println("Atores: \n" + Atores(e,i));
                    System.out.println("Realizadores: \n" + Realizadores(e,i));
                    System.out.println("Compositores: \n" + Compositores(e,i));
                    System.out.println("Tecnicos de luz/som: \n" + TecnicosLuzSom(e,i));
                    System.out.println("\n");
                    flag = false;
                }    
            }
            if(flag == true){
                System.out.println("O id que introduziu nao corresponde a nenhum espetáculo!\n");
                System.out.println("Tente novamente!"); 
            }
        }
        
    }
}
