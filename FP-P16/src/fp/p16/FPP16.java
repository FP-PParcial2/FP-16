/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fp.p16;
import java.util.*;

/**
 *
 * @author Esteban
 */
public class FPP16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //DECLARACION DE VARIABLES PARA INTRODUCIR DATOS EN STRING
        int a,b,c;
        a=SolicitarDato(" a ");
        b=SolicitarDato(" b ");
        c=SolicitarDato(" c ");
        mostrarMayor(a,b,c);
    }
    public static int SolicitarDato(String Dato){//METODO DE PEDIR DATOS EN STRING
        int num;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Ingrese numero"+ Dato);
        num=teclado.nextInt();
        return num;
        
    }
    public static void mostrarMayor(int a,int b,int c){//CONDICIONES Y CHECAR QUE NUMERO ES EL MAS GRANDE
        int m;
        m=a;//TOMAS EL PRIMER VALOR INGRESADO
        if(m<b)m=b;//COMPARAS EL PRIMER VALOR CON EL SEGUNDO SI ES MENOR ATOMAS EL SEGUNDO
        if(m<c)m=c;// COMPARAS CON EL TERCERO Y VES CUAL ES MAYOR
        
        System.out.println("El numero mayor es"+" " + m);//IMPRIMES
        
    }
    
}
