/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package companhiaespetaculos_musica;

import static companhiaespetaculos_musica.menuLayout.mainMenu;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Rodrigo
 */
public class Main {
    
    private static ArrayList <Espetaculo> x = new ArrayList <>();
    private static ArrayList <AssaignEspetaculos> y = new ArrayList <>();
    
    public static String toStringe(ArrayList <Espetaculo> x){
        
        String s = " ";
        for(int i = 0; i < x.size(); i++){
            s += "\nId: " + x.get(i).getId() + "\tNome: " + x.get(i).getNome();
        }
        return s;
    }
    
    public static String toStringa(ArrayList <AssaignEspetaculos> x){
        
        String s = " ";
        for(int i = 0; i < x.size(); i++){
            s += "\nId: " + x.get(i).getId() + "\tNome: " + x.get(i).getEspetaculo().getNome();
        }
        return s;
    }    

    public static void createFile (String f_name, ArrayList a) {            //createFile
        try {
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(f_name + ".txt"));
            System.out.println("Ficheiro Criado com Sucesso!\n");
            os.writeObject(a);
            os.flush();
            
        }catch (IOException e)  {
            System.out.println(e.getMessage());
        }
    }
    
    
    public static void saveFile(String f_name, ArrayList a)    {            //saveFile
        try {
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(f_name + ".txt"));
            System.out.println("Ficheiro Guardado com Sucesso!\n");
            os.writeObject(a);
            os.flush();
            
        }catch (IOException e)  {
            System.out.println(e.getMessage());
        }
        
    }
    
    private static void readFiles() throws IOException, ClassNotFoundException {
        
        try{
            ObjectInputStream fileEspetaculo = new ObjectInputStream(new FileInputStream("Espetaculo.txt"));
            x = (ArrayList<Espetaculo>) fileEspetaculo.readObject();
            fileEspetaculo.close();
            System.out.println("O ficheiro Espetaculo.txt carregou.\n");
        }catch (IOException e){
            createFile("Espetaculo", x);
        }
        
        try{
            ObjectInputStream fileAssaignEspetaculos = new ObjectInputStream(new FileInputStream("AssaignEspetaculos.txt"));
            y = (ArrayList<AssaignEspetaculos>) fileAssaignEspetaculos.readObject();
            fileAssaignEspetaculos.close();
            System.out.println("O ficheiro AssaignEspetaculos.txt carregou.\n");
        }catch (IOException e){
            createFile("AssaignEspetaculos", y);
        }
        
    }
    
    
    
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        
        readFiles();
        mainMenu(x,y);
    }
    
}
