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
public class mAE extends mAssignEspetaculo{
    
    public static void maLocal(ArrayList <Espetaculo> e ,ArrayList <AssaignEspetaculos> a){
        
        boolean flag = true;
        int i;
        String l;
        System.out.println("Insira o id do espetáculo atribuido que pretende alterar: ");
        
        while(flag){
            
            System.out.println(toStringa(a));
            i = Ler.umInt();
            for(int j = 0; j < a.size(); j++){
                if(i == a.get(j).getId()){
                    flag = false;
                    System.out.println("Insira novo local: \n");
                    l =  Ler.umaString();
                    a.get(j).setLocal(l);
                    System.out.println("Local do espetáculo alterado com sucesso!");
                    saveFile("AssaignEspetaculos", a);
                }
            }
            if(flag == true){
                System.out.println("O id introduzido nao pertence a nenhum espetáculo.");
                System.out.println("Tente novamente.");
            }
        }
    }
    
    public static void maData(ArrayList <Espetaculo> e ,ArrayList <AssaignEspetaculos> a){
        
        boolean flag = true;
        int i;
        int ano;
        int mes;
        int dia;
        System.out.println("Insira o id do espetáculo a alterar: ");
        
        while(flag){
            
            System.out.println(toStringa(a));
            i = Ler.umInt();
            for(int j = 0; j < a.size(); j++){
                if(i == a.get(j).getId()){
                    flag = false;
                    
                    System.out.println("Insira um novo ano: \n");
                    ano = Ler.umInt();
                    a.get(j).setAno(ano);
                    
                    System.out.println("Insira um novo mes: \n");
                    mes = Ler.umInt();
                    a.get(j).setMes(mes);
                    
                    System.out.println("Insira um novo dia: \n");
                    dia = Ler.umInt();
                    a.get(j).setDia(dia);
                    
                    System.out.println("Data do espetaculo alterada com sucesso!");
                    saveFile("AssaignEspetaculos", a);
                }
            }
            if(flag = true){
                System.out.println("O id introduzido nao pertence a nenhum espetáculo.");
                System.out.println("Tente novamente.");
            }
        }
    }
    
    public static void maAssistencia(ArrayList <Espetaculo> e ,ArrayList <AssaignEspetaculos> a){
        
        boolean flag = true;
        int i;
        int assistencia;
        System.out.println("Insira o id do espetáculo a alterar: ");
        
        while(flag){
            
            System.out.println(toStringa(a));
            i = Ler.umInt();
            for(int j = 0; j < a.size(); j++){
                if(i == a.get(j).getId()){
                    flag = false;
                    System.out.println("Insira um novo valor de assistencia: \n");
                    assistencia = Ler.umInt();
                    a.get(j).setAssistencia(assistencia);
                    System.out.println("Assistencia do espetáculo alterada com sucesso!");
                    saveFile("AssaignEspetaculos", a);
                }
            }
            if(flag = true){
                System.out.println("O id introduzido nao pertence a nenhum espetáculo.");
                System.out.println("Tente novamente.");
            }
        }
    }
    
    
    
}
