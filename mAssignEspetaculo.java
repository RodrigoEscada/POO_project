/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package companhiaespetaculos_musica;

import static companhiaespetaculos_musica.Main.*;
import static companhiaespetaculos_musica.cAE.*;
import static companhiaespetaculos_musica.mAE.*;
import java.util.ArrayList;
import myinputs.Ler;

/**
 *
 * @author Rodrigo
 */
public class mAssignEspetaculo extends menuLayout {
    
    public static void aldEspetaculo(ArrayList <Espetaculo> e, ArrayList <AssaignEspetaculos> a){
        boolean flag = true;
        boolean flag1 = true;
        boolean flag2 = true;
        boolean flag3 = true;
        boolean flag4 = true;
        int i = 0;
        int v = 0;
        String local = null;
        AssaignEspetaculos a1;
        System.out.println("Insira o id do espetáculo a atribuir: ");
        
        while(flag){
            
            System.out.println(toStringe(e));
            i = Ler.umInt();
            for(int j = 0; j < e.size(); j++){
                if(i == e.get(j).getId()){
                    flag = false;
                    v = j;
                    System.out.println("Atribuir Local: \n");
                    local = Ler.umaString();
                }
            }
        }
        if(a.isEmpty())
            a1 = new AssaignEspetaculos(local, e.get(v));
        else    {
            int k = a.get(a.size() - 1).getId() + 1;
            a1 = new AssaignEspetaculos(local, e.get(v), k);
        }
        
        int ano;
        System.out.println("Insira o ano em que quer atribuir o espetáculo: \n");
        while(flag1){
            ano = Ler.umInt();
            a1.setAno(ano);
            flag1 = false;
        }
        
        int mes;
        System.out.println("Insira o mes em que quer atribuir o espetáculo: \n");
        while(flag2){
            mes = Ler.umInt();
            a1.setMes(mes);
            flag2 = false;
        }
        
        int dia;
        System.out.println("Insira o dia em que quer atribuir o espetáculo: \n");
        while(flag3){
            dia = Ler.umInt();
            a1.setDia(dia);
            flag3 = false;
        }
        
        int assistencia;
        System.out.println("Insira a assistencia do espetaculo: \n");
        while(flag4){
            assistencia = Ler.umInt();
            a1.setAssistencia(assistencia);
            flag4 = false;
        }
        
        a.add(a1);
        saveFile("AssaignEspetaculos", a);
        System.out.println("Espetáculo atribuido com sucesso.");
        
    }
    
    public static void mldEspetaculo(ArrayList <Espetaculo> e, ArrayList <AssaignEspetaculos> a){
        
        boolean flagcheck = true;
        boolean flag = true;
        if(a.isEmpty()){
            System.out.println("Nao existem espetaculos atribuidos.\n");
            flagcheck = false;
        }
        
        if(flagcheck == true){
            while(flag){
                int l;
                System.out.println("1. Modificar local.");
                System.out.println("\n2. Modificar data.");
                System.out.println("\n3. Modificar assistencia.");
                System.out.println("\n4. Voltar.");
                l = Ler.umInt();

                switch(l){

                    case 1: {   maLocal(e,a);
                                break;
                    }
                    case 2: {   maData(e,a);
                                break;
                    }
                    case 3: {   maAssistencia(e,a);
                                break;
                    }
                    case 4: {   flag = false;
                                break;
                    }
                }
            }       
        }
    }
    
    public static void rldEspetaculo(ArrayList <Espetaculo> e, ArrayList <AssaignEspetaculos> a){
        boolean flagcheck = true;
        if(a.isEmpty()){
            System.out.println("Nao existem espetaculos atribuidos.\n");
            flagcheck = false;
        }
        if(flagcheck == true){
            boolean flag = true;
            int i;
            System.out.println("Insira o id do Espetaculo atribuido que deseja apagar: ");
            
            while(flag){
                
                System.out.println(toStringa(a));
                i = Ler.umInt();
                
                for(int j = 0; j < a.size(); j++){
                    if(i == a.get(j).getId()){
                        a.remove(j);
                        System.out.println("Atribuicao do espetáculo removida com sucesso!\n");
                        saveFile("AssaignEspetaculos", a);
                        flag = false;
                    }
                }
                if(flag == true){
                    System.out.println("O Id introduzido não pertence a nenhum espetáculo!\n");
                    System.out.println("Tente novamente!\n");
                }
            }
        }
    }
    
    public static void cldEspetaculo(ArrayList <Espetaculo> e, ArrayList <AssaignEspetaculos> a){
        boolean flag = true;
        boolean flagcheck = true;
        if(a.isEmpty()){
            System.out.println("Nao existem espetáculos programados.\n");
            flagcheck = false;
        }
        if(flagcheck == true){
            while(flag){
                int l;
                System.out.println("1. Consultar por nome.");
                System.out.println("\n2. Consultar por Id.");
                System.out.println("\n3. Voltar.");
                l = Ler.umInt();
                
                switch(l)   {

                    case 1: {   caeNome(e,a);
                                break;
                    }
                    case 2: {   caeId(e,a);
                                break;
                    }            
                    case 3: {   flag = false;
                                break;
                    }
                    default: {  
                        System.out.println("Opção Inválida!\n"); 
                        cldEspetaculo(e,a);
                    }
                }
            }
        }
    }
    
    public static void lldEspetaculo(ArrayList <Espetaculo> e, ArrayList <AssaignEspetaculos> a){
        
        boolean flagcheck = true;
        if(a.isEmpty()){
            System.out.println("Nao existem espetáculos programados.\n");
            flagcheck = false;
        }
        if(flagcheck == true){
            String s = "";
            
            for(int i = 0; i < a.size(); i++){
                s += "\nId: " + a.get(i).getId() + "\tNome: " + a.get(i).getEspetaculo().getNome();
            }
            System.out.println(s);
        }
    }
    
    public static void naEspetaculo(ArrayList <Espetaculo> e, ArrayList <AssaignEspetaculos> a){
        
        boolean flagcheck = true;
        if(a.isEmpty()){
            System.out.println("Nao existem espetáculos programados.\n");
            flagcheck = false;
        }
        
        if(flagcheck == true){
            boolean flag = true;
            int i;
            int count = 0;
            System.out.println("Insira o Id do espetáculo: ");
            
            while(flag){
                System.out.println(toStringe(e));
                i = Ler.umInt();
                
                for(int j = 0; j < a.size(); j++){
                    if(i == a.get(j).getEspetaculo().getId()){
                        count++;
                        flag = false;
                    }
                }
                if(flag == false){
                    System.out.println("Numero de atribuicoes do espetáculo: \n" + count);
                }
                if(flag == true){
                    System.out.println("O id introduzido nao pertence a nenhum espetaculo.");
                    System.out.println("Tente novamente!\n");
                }
            }
        }
    }
    public static void totaEspetaculo(ArrayList <Espetaculo> e, ArrayList <AssaignEspetaculos> a){
        
        boolean flagcheck = true;
        if(a.isEmpty()){
            System.out.println("Nao existem espetáculos programados.\n");
            flagcheck = false;
        }
        
        if(flagcheck == true){
            boolean flag = true;
            int i;
            int count = 0;
            System.out.println("Insira o Id do espetáculo: ");
            
            while(flag){
                System.out.println(toStringe(e));
                i = Ler.umInt();
                
                for(int j = 0; j < a.size(); j++){
                    if(i == a.get(j).getEspetaculo().getId()){
                        count +=  a.get(j).getAssistencia();
                        flag = false;
                    }
                }
                if(flag == false){
                    System.out.println("Numero total de assistencias do espetáculo: \n" + count);
                }
                if(flag == true){
                    System.out.println("O id introduzido nao pertence a nenhum espetaculo.");
                    System.out.println("Tente novamente!\n");
                }
            }
        }
    }
    
    public static void medaEspetaculo(ArrayList <Espetaculo> e, ArrayList <AssaignEspetaculos> a){
        
        boolean flagcheck = true;
        if(a.isEmpty()){
            System.out.println("Nao existem espetáculos programados.\n");
            flagcheck = false;
        }
        
        if(flagcheck == true){
            boolean flag = true;
            int i;
            int count = 0;
            int total = 0;
            System.out.println("Insira o Id do espetáculo: ");
            
            while(flag){
                System.out.println(toStringe(e));
                i = Ler.umInt();
                
                for(int j = 0; j < a.size(); j++){
                    if(i == a.get(j).getEspetaculo().getId()){
                        count +=  a.get(j).getAssistencia();
                        total++;
                        flag = false;
                    }
                }
                if(flag == false){
                    System.out.println("Numero de atribuicoes do espetáculo: \n" + (count/total));
                }
                if(flag == true){
                    System.out.println("O id introduzido nao pertence a nenhum espetaculo.");
                    System.out.println("Tente novamente!\n");
                }
            }
        }
    }
    
    
    
}
