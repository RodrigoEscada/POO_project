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
public class cAE {
    
    public static void caeNome(ArrayList<Espetaculo> e, ArrayList<AssaignEspetaculos> a){
        
        boolean flag = true;
        String n;
        System.out.println("Insira o nome do espetáculo atribuido a consultar: ");
        
        while(flag){
            System.out.println(toStringa(a));
            n = Ler.umaString();
            
            for(int i = 0; i < a.size(); i++){
                if(a.get(i).getEspetaculo().getNome().equals(n)){
                    System.out.println(a.get(i));
                    flag = false;
                }
            }
            if(flag == true){
                System.out.println("O nome que introduziu nao corresponde a nenhum espetaculo.");
                System.out.println("Tente novamente!\n");
            }
        }
    }
    
    public static void caeId(ArrayList<Espetaculo> e, ArrayList<AssaignEspetaculos> a){
        
        boolean flag = true;
        int id;
        System.out.println("Insira o id do espetáculo atribuido a consultar: ");
        
        while(flag){
            System.out.println(toStringa(a));
            id = Ler.umInt();
            
            for(int i = 0; i < a.size(); i++){
                if(id == a.get(i).getId()){
                    System.out.println(a.get(i));
                    flag = false;
                }
            }
            if(flag == true){
                System.out.println("O id que introduziu nao corresponde a nenhum espetaculo.");
                System.out.println("Tente novamente!\n");
            }
        }
    }
    
}
