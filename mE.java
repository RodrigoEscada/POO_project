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
public class mE extends mEspetaculo {
    
    public static void meNome(ArrayList <Espetaculo> e) {
        
        boolean flag = true;
        int i;
        String n;
        System.out.println("Insira o Id do espetáculo a alterar: ");
        
        while(flag){
            
            System.out.println(toStringe(e));
            i = Ler.umInt();
            for(int j = 0; j < e.size(); j++){
                if(i == e.get(j).getId()){
                    flag = false;
                    System.out.println("Insira o novo nome do espetáculo: ");
                    n = Ler.umaString();
                    e.get(j).setNome(n);
                    System.out.println("Nome do espetáculo alterado com sucesso!");
                    saveFile("Espetaculo", e);
                    
                }
            }
            if(flag == true){
                System.out.println("O id introduzido nao pertence a nenhum espetáculo.");
                System.out.println("Tente novamente.\n");
            }
        }
    }
    
    public static void meAtores(ArrayList <Espetaculo> e){
        
        boolean flag = true;
        int i;
        String atores = null;
        ArrayList<String> aux = new ArrayList<>();
        System.out.println("Insira o Id do espetáculo a alterar: ");
        while(flag){
            System.out.println(toStringe(e));
            i = Ler.umInt();
            for(int j = 0; j < e.size(); j++){
                if(i == e.get(j).getId()){
                    System.out.println("Insira o nome dos novos atores: ");
                    flag = true;
                    while (flag){
                        atores = Ler.umaString();
                        aux.add(atores);
                        System.out.println("Deseja continuar? Prima a tecla 1 para continuar ou 0 para nao inserir mais atores.");
                        int aux1 = Ler.umInt();
                        if(aux1 == 0){
                            flag = false;
                        }
                    }
                    e.get(j).setAtores(aux);
                    saveFile("Espetaculo", e);
                }
                
            }
            if(flag == true){
                System.out.println("O id introduzido nao pertence a nenhum espetáculo");
                System.out.println("Tente novamente!\n");
            }
        }
        
    }
    
    public static void meRealizadores(ArrayList <Espetaculo> e){
        
        boolean flag = true;
        int i;
        String realizadores = null;
        ArrayList<String> aux = new ArrayList<>();
        System.out.println("Insira o Id do espetáculo a alterar: ");
        while(flag){
            System.out.println(toStringe(e));
            i = Ler.umInt();
            for(int j = 0; j < e.size(); j++){
                if(i == e.get(j).getId()){
                    System.out.println("Insira o nome dos novos realizadores: ");
                    flag = true;
                    while (flag){
                        realizadores = Ler.umaString();
                        aux.add(realizadores);
                        System.out.println("Deseja continuar? Prima a tecla 1 para continuar ou 0 para nao inserir mais realizadores.");
                        int aux1 = Ler.umInt();
                        if(aux1 == 0){
                            flag = false;
                        }
                    }
                    e.get(j).setRealizadores(aux);
                    saveFile("Espetaculo", e);
                }
                
            }
            if(flag == true){
                System.out.println("O id introduzido nao pertence a nenhum espetáculo");
                System.out.println("Tente novamente!\n");
            }
        }
    }
    
    public static void meCompositores(ArrayList <Espetaculo> e){
        boolean flag = true;
        int i;
        String compositores = null;
        ArrayList<String> aux = new ArrayList<>();
        System.out.println("Insira o Id do espetáculo a alterar: ");
        while(flag){
            System.out.println(toStringe(e));
            i = Ler.umInt();
            for(int j = 0; j < e.size(); j++){
                if(i == e.get(j).getId()){
                    System.out.println("Insira o nome dos novos compositores: ");
                    flag = true;
                    while (flag){
                        compositores = Ler.umaString();
                        aux.add(compositores);
                        System.out.println("Deseja continuar? Prima a tecla 1 para continuar ou 0 para nao inserir mais compositores.");
                        int aux1 = Ler.umInt();
                        if(aux1 == 0){
                            flag = false;
                        }
                    }
                    e.get(j).setCompositores(aux);
                    saveFile("Espetaculo", e);
                }
                
            }
            if(flag == true){
                System.out.println("O id introduzido nao pertence a nenhum espetáculo");
                System.out.println("Tente novamente!\n");
            }
        }
    }
    
    public static void meTecnicosLuzSom(ArrayList <Espetaculo> e){
        boolean flag = true;
        int i;
        String tecnicosLuzSom = null;
        ArrayList<String> aux = new ArrayList<>();
        System.out.println("Insira o Id do espetáculo a alterar: ");
        while(flag){
            System.out.println(toStringe(e));
            i = Ler.umInt();
            for(int j = 0; j < e.size(); j++){
                if(i == e.get(j).getId()){
                    System.out.println("Insira o nome dos novos tecnicos de luz/som: ");
                    flag = true;
                    while (flag){
                        tecnicosLuzSom = Ler.umaString();
                        aux.add(tecnicosLuzSom);
                        System.out.println("Deseja continuar? Prima a tecla 1 para continuar ou 0 para nao inserir mais tecnicos de luz/som.");
                        int aux1 = Ler.umInt();
                        if(aux1 == 0){
                            flag = false;
                        }
                    }
                    e.get(j).setTecnicosLuzSom(aux);
                    saveFile("Espetaculo", e);
                }
                
            }
            if(flag == true){
                System.out.println("O id introduzido nao pertence a nenhum espetáculo");
                System.out.println("Tente novamente!\n");
            }
        }
    }
}
