/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package companhiaespetaculos_musica;

import static companhiaespetaculos_musica.mAssignEspetaculo.*;
import static companhiaespetaculos_musica.mEspetaculo.*;
import java.util.ArrayList;
import myinputs.*;

/**
 *
 * @author Rodrigo
 */
public class menuLayout {
    
    public static void menuEspetaculo(ArrayList <Espetaculo> e, ArrayList <AssaignEspetaculos> a){
        boolean flag= true;
        while(flag){
            System.out.println("1. Inserir Espetáculo.");
            System.out.println("2. Modificar Espetáculo.");
            System.out.println("3. Consultar Espetáculo.");
            System.out.println("4. Listar Espetáculos.");
            System.out.println("5. Apagar Espetáculo.");
            System.out.println("6. Voltar.\n");

            int opcao;
            opcao = Ler.umInt();

            switch(opcao){

                case 1: {   inserirEspetaculo(e,a);
                            break;
                }
                case 2: {   modificarEspetaculo(e);
                            break;
                }
                case 3: {   consultarEspetaculo(e,a);
                            break;
                }
                case 4: {   listarEspetaculo(e,a);
                            break;
                }
                case 5: {   apagarEspetaculo(e,a);
                            break;
                }
                case 6: { 
                    flag = false;
                    break;
                }
                default:{
                    System.out.println("Opção inválida!\n");
                    menuEspetaculo(e,a);
                }

            }
        }
    }
    
    public static void menuAtribuirEspetaculo(ArrayList <Espetaculo> e, ArrayList <AssaignEspetaculos> a ){
        boolean flag = true;
        while(flag){
            System.out.println("1. Atribuir local e data.");
            System.out.println("2. Modificar local e data.");
            System.out.println("3. Consultar local e data.");
            System.out.println("4. Apagar atribuicao de espetáculo.");
            System.out.println("5. Listar espetáculos atribuidos.");
            System.out.println("6. Numero de atribuicoes de um dado espetáculo.");
            System.out.println("7. Total de assistencia de um dado espetáculo.");
            System.out.println("8. Média de assistencia de um dado espetáculo.");
            System.out.println("9. Voltar.\n");

            int opcao;
            opcao = Ler.umInt();

            switch(opcao){

                case 1: {   aldEspetaculo(e,a);
                            break;
                }
                case 2: {   mldEspetaculo(e,a);
                            break;
                }
                case 3: {   cldEspetaculo(e,a);
                            break;
                }
                case 4: {   rldEspetaculo(e,a);
                            break;
                }
                case 5: {   lldEspetaculo(e,a);
                            break;
                }
                case 6: {   naEspetaculo(e,a);
                            break;
                }
                case 7: {   totaEspetaculo(e,a);
                            break;
                }
                case 8: {   medaEspetaculo(e,a);
                            break;
                }
                case 9: {   flag = false;
                            break;
                }
                default:{
                    System.out.println("Opção inválida!\n");
                    menuAtribuirEspetaculo(e,a);
                }
            }
        }
    }
    
    public static void mainMenu(ArrayList <Espetaculo> e, ArrayList <AssaignEspetaculos> a){
        while(true)    {
            System.out.println("1. Gestao de Espetáculos.");
            System.out.println("2. Atribuir Espetáculos.");
            System.out.println("3. Sair.\n");

            int opcao;
            opcao = Ler.umInt();

            switch(opcao){

                case 1: {   menuEspetaculo(e,a);
                            break;
                }
                case 2: {   menuAtribuirEspetaculo(e,a);
                            break;
                }
                case 3: System.exit(0);
                default: {
                    System.out.println("Opção Inválida!\n");
                    break;
                }
            }
        }
        
        
    }
    
    
    
}
