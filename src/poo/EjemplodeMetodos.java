package poo;

import java.util.Scanner;

/**
 *
 * @author Grupo 6
 */

public class EjemplodeMetodos {
    
    public static void main(String [] args){
        
     String mensajeDeError="Valor erroneo";
        int v=0;
        do{
            v  = ImprimeyLee();
        }while(!compruebaValor(v,mensajeDeError));
        
        if(v==1){//SUMA
            int [] d = new int[2];
            leeEnteros(d); //Llamo a leeEnteros
            
            System.out.println("La suma de"+d[0]+"+"+d[1]+"="+(d[0]+d[1]));
        }
          
    }
    
    public static int ImprimeyLee(){
        imprimeMenu();
        return leeEntero();
        
    }
    
    public static void imprimeMenu(){
        System.out.println("1-Sumar");
        System.out.println("2-Raiz");
    }
    
    public static int leeEntero(){
        System.out.println("Escribe un valor");
        Scanner sc = new Scanner(System.in);
        int valor = sc. nextInt();
        
        return valor;
    }
    
    public static boolean compruebaValor(int a, String msg){
       
        if(a==1||a==2) return true;
        else{
            System.out.println(msg);
            return false;
        }
    }
    
    public static void leeEnteros(int  [] datos){
        
        Scanner sc = new Scanner(System.in);
        
        for(int i=0;i<datos.length;i++){// Se repite tantas veces como tamaño tenga el array
            
            System.out.println("Introduzca valor "+i);
            datos[i]= sc.nextInt();
            
        }
    }
}