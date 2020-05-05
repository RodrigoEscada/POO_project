/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package companhiaespetaculos_musica;
import static companhiaespetaculos_musica.Espetaculo.*;
import java.io.Serializable;

/**
 *
 * @author Rodrigo
 */
public class AssaignEspetaculos implements Serializable {
    
    private static int ultimo = 1;
    private int id;
    private String local;
    private int ano;
    private int mes;
    private int dia;
    private int assistencia;
    private Espetaculo esp;

    public AssaignEspetaculos(String l, Espetaculo e) {
        id = ultimo;
        ultimo++;
        local = l;
        ano = 0;
        mes = 0;
        dia = 0;
        assistencia = 0;
        esp = e;   
    }
    
    public AssaignEspetaculos(String l, Espetaculo e, int i) {
        id = i;
        local = l;
        ano = 0;
        mes = 0;
        dia = 0;
        assistencia = 0;
        esp = e;   
    }
    
    public AssaignEspetaculos(String l, int a, int m, int d, int as, Espetaculo e){
        
        id = ultimo;
        ultimo++;
        local = l;
        ano = a;
        mes = m;
        dia = d;
        assistencia = as;
        esp =  e;
    }
    
    public int getId(){
        return id;
    }
    
    public String getLocal(){
        return local;
    }
    
    public int getAno(){
        return ano;
    }
    
    public int getMes(){
        return mes;
    }
    
    public int getDia(){
        return dia;
    }
    
    public int getAssistencia(){
        return assistencia;
    }
    
    public Espetaculo getEspetaculo(){
        return esp;
    }
    
    public void setId(int i){
        id = i;
    }
    
    public void setLocal(String l){
        local = l;
    }
    
    public void setAno(int a){
        ano = a;
    }
    
    public void setMes(int m){
        mes = m;
    }
    
    public void setDia(int d){
        dia = d;
    }
    
    public void setAssistencia(int as){
        assistencia = as;
    }
    
   
    public String toString(){
        return("Espetaculo: " + esp.getNome() + "\nLocal: " + getLocal() + "\nAno: " + getAno() + "\nMes: " + getMes() + "\nDia: " + getDia() + "\nAssistencia: " + getAssistencia());
    }
    
    
}
