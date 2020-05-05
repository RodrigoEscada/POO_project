/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package companhiaespetaculos_musica;

import static companhiaespetaculos_musica.Main.*;
import static companhiaespetaculos_musica.cE.*;
import static companhiaespetaculos_musica.mE.*;
import java.util.ArrayList;
import myinputs.Ler;

/**
 *
 * @author Rodrigo
 */
public class mEspetaculo extends menuLayout{
    
    public static void inserirEspetaculo(ArrayList <Espetaculo> e, ArrayList <AssaignEspetaculos> a){
        
        boolean flag = true;
        boolean flag1 = true;
        Espetaculo e1;
        String nome = null;
        while(flag1){
            System.out.println("Insira o nome do Espetáculo: \n");
            nome = Ler.umaString();
            
            flag1 = false;
            for (int i = 0; i < e.size(); i++){
            
                if(e.get(i).getNome().equals(nome)){
                    System.out.println("Já existe um espetáculo com esse nome.\n");
                    System.out.println("Tente novamente");
                    flag1 = true;
                    break;
                } 
            }
        }
        if(e.isEmpty())
            e1 = new Espetaculo(nome);
        else    {
            int k = e.get(e.size() - 1).getId() + 1;
            e1 = new Espetaculo(nome, k);
        }
            
        String atores;
        System.out.println("Insira o nome dos atores: \n");
        while (flag){
            atores = Ler.umaString();
            e1.getAtores().add(atores);
            System.out.println("Deseja continuar? Prima a tecla 1 para continuar ou 0 para não inserir mais atores.\n");
            int aux = Ler.umInt();
            if(aux == 0){
                flag = false;
            }
        }
        
        String realizadores;
        System.out.println("Insira o nome dos realizadores: \n");
        flag = true;
        while (flag){
            realizadores = Ler.umaString();
            e1.getRealizadores().add(realizadores);
            System.out.println("Deseja continuar? Prima a tecla 1 para continuar ou 0 para não inserir mais realizadores.\n");
            int aux = Ler.umInt();
            if(aux == 0){
                flag = false;
            }
        }
        
        String compositores;
        System.out.println("Insira o nome dos compositores: \n");
        flag = true;
        while (flag){
            compositores = Ler.umaString();
            e1.getCompositores().add(compositores);
            System.out.println("Deseja continuar? Prima a tecla 1 para continuar ou 0 para não inserir mais compositores.\n");
            int aux = Ler.umInt();
            if(aux == 0){
                flag = false;
            }
        }
        
        String tecnicosLuzSom;
        System.out.println("Insira o nome dos tecnicos de Luz/Som: \n");
        flag = true;
        while (flag){
            tecnicosLuzSom = Ler.umaString();
            e1.getTecnicosLuzSom().add(tecnicosLuzSom);
            System.out.println("Deseja continuar? Prima a tecla 1 para continuar ou 0 para não inserir mais tecnicos de Luz/Som.\n");
            int aux = Ler.umInt();
            if(aux == 0){
                flag = false;
            }
        }
        
        e.add(e1);
        saveFile("Espetaculo", e);
        System.out.println("Espetáculo adicionado com sucesso.");
        
    }
    
    public static void modificarEspetaculo(ArrayList <Espetaculo> e){
        
        boolean flagcheck = true;
        boolean flag = true;
        if(e.isEmpty()){
            System.out.println("Nao existem espetáculos programados.\n");
            flagcheck = false;
        }
        
        if(flagcheck == true){
            while(flag){
                int l;
                System.out.println("1. Modificar nome.");
                System.out.println("\n2. Modificar atores.");
                System.out.println("\n3. Modificar realizadores.");
                System.out.println("\n4. Modificar compositores.");
                System.out.println("\n5. Modificar tecnicos de luz/som.");
                System.out.println("\n6. Voltar.");
                l = Ler.umInt();

                switch(l){

                    case 1: {   meNome(e);
                                break;
                    }
                    case 2: {   meAtores(e);
                                break;
                    }
                    case 3: {   meRealizadores(e);
                                break;
                    }
                    case 4: {   meCompositores(e);
                                break;
                    }
                    case 5: {   meTecnicosLuzSom(e);
                                break;
                    }
                    case 6: {   flag = false;
                                break;
                    }
                    default: {
                        System.out.println("Opção Inválida!\n");
                        modificarEspetaculo(e);
                    }
                }
            }
        }
    }
    
    public static void apagarEspetaculo(ArrayList <Espetaculo> e, ArrayList <AssaignEspetaculos> a){
        
        boolean flagcheck = true;
        if(e.isEmpty()){
            System.out.println("Nao existem espetáculos programados.\n");
            flagcheck = false;
        }
        if(flagcheck == true){
            boolean flag = true;
            int i;
            System.out.println("Insira o Id do Espetaculo a apagar: ");

            while(flag){

                System.out.println(toStringe(e));
                i = Ler.umInt();

                for(int j = 0; j < e.size(); j++){

                    if(i == e.get(j).getId()){
                        e.remove(j);
                        System.out.println("Espetáculo removido com sucesso!\n");
                        saveFile("Espetaculo", e);
                        flag = false;
                    }
                }
                if(flag == true){
                    System.out.println("O Id introduzido não pertence a nenhum espetáculo!");
                    System.out.println("Tente novamente!\n");
                }

            }
        }
        
    }
    
    public static void consultarEspetaculo(ArrayList <Espetaculo> e, ArrayList <AssaignEspetaculos> a){
        boolean flag = true;
        boolean flagcheck = true;
        if(e.isEmpty()){
            System.out.println("Nao existem espetáculos programados.\n");
            flagcheck = false;
        }
        if(flagcheck  == true){
            while(flag){
                int l;
                System.out.println("1. Consultar por nome.");
                System.out.println("\n2. Consultar por Id.");
                System.out.println("\n3. Voltar.");
                l = Ler.umInt();

                switch(l)   {

                    case 1: {   ceNome(e);
                                break;
                    }
                    case 2: {   ceId(e);
                                break;
                    }            
                    case 3: {   flag = false;
                                break;
                    }
                    default: {  
                        System.out.println("Opção Inválida!\n"); 
                        consultarEspetaculo(e,a);
                    }
                }
            }
        }   
    }
    
    public static void listarEspetaculo(ArrayList <Espetaculo> e, ArrayList <AssaignEspetaculos> a){
        
        boolean flagcheck = true;
        if(e.isEmpty()){
            System.out.println("Nao existem espetáculos programados.\n");
            flagcheck = false;
        }
        if(flagcheck == true){
            String s = "";

            for(int i = 0; i < e.size(); i++){
                s += "\nId: " + e.get(i).getId() + "\tNome: " + e.get(i).getNome(); 
            }

            System.out.println(s);
        }
    }
    
}
