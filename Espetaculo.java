/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package companhiaespetaculos_musica;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Rodrigo
 */
public class Espetaculo implements Serializable {
    
    private static int ultimo = 1;
    private int id;
    private String nome;
    private ArrayList<String> atores;
    private ArrayList<String> realizadores;
    private ArrayList<String> compositores;
    private ArrayList<String> tecnicosLuzSom;

    
    public Espetaculo(String n){
        id = ultimo;
        ultimo++;
        nome = n;
        atores = new ArrayList<>();
        realizadores = new ArrayList<>();
        compositores = new ArrayList<>();
        tecnicosLuzSom = new ArrayList<>();
        
    }

    public Espetaculo(String n, ArrayList<String> a, ArrayList<String> r, ArrayList<String> c, ArrayList<String> t) {
        id = ultimo;
        ultimo++;
        nome = n;
        atores = a;
        realizadores = r;
        compositores = c;
        tecnicosLuzSom = t;
    }

    public Espetaculo(String n, int i){
        id = i;
        nome = n;
        atores = new ArrayList<>();
        realizadores = new ArrayList<>();
        compositores = new ArrayList<>();
        tecnicosLuzSom = new ArrayList<>();
        
    }
    
    

    public static int getUltimo() {
        return ultimo;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<String> getAtores() {
        return atores;
    }

    public ArrayList<String> getRealizadores() {
        return realizadores;
    }

    public ArrayList<String> getCompositores() {
        return compositores;
    }

    public ArrayList<String> getTecnicosLuzSom() {
        return tecnicosLuzSom;
    }
    
    public void setNome(String n){
        nome = n;
    }

    public void setAtores(ArrayList<String> a) {
        atores.clear();
        for(int i = 0; i < a.size(); i++)
            atores.add(a.get(i));
    }
    
    public void setRealizadores(ArrayList<String> r) {
        realizadores.clear();
        for(int i = 0; i < r.size(); i++)
            realizadores.add(r.get(i));
    }
    
    public void setCompositores(ArrayList<String> c) {
        compositores.clear();
        for(int i = 0; i < c.size(); i++)
            compositores.add(c.get(i));
    }
    
    public void setTecnicosLuzSom(ArrayList<String> t) {
        tecnicosLuzSom.clear();
        for(int i = 0; i < t.size(); i++)
            tecnicosLuzSom.add(t.get(i));
    }

    public String toString(){
        return ("ID: " + getId() + "\nNome: " + getNome() + "\nAtores: " + getAtores() + "\nCompositores: " + getCompositores() + "\nTecnicos de luz e Som: " + getTecnicosLuzSom());
    }
    
    public boolean equals (Espetaculo e){
        
        if(e != null && e.getClass() == this.getClass()){
            return(
                    this.nome.equals(e.nome));
        }
        return false;
    }
    
}
