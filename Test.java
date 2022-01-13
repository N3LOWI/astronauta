package com.mycompany.pexamen;
import java.util.Scanner;
/**
 *
 * @author marce
 */
public class Test {
    
    public void intro1(){
        System.out.println("HOLA ASTRONAUTA, BIENVENIDO !\n");
    }
    
    public void fin1(){
        System.out.println("\nFIN");
    }
    
    
    
    static char S;
    static int E;
    static double masaD;
    static double pesofinal;
    static boolean seguir = true;
    
    
    public static double compu1(){
        
        Scanner t = new Scanner(System.in);
        
        while(seguir==true){
            
            System.out.println("Pulse 's' para continuar, o 'n' para terminar:");
            S = t.next().charAt(0);
            
            
            switch(S){
                case 'n':
                    
                    seguir=false;
                    break;
                    
                case 's':
                    
                    seguir=true;
                    
                    System.out.println("Ahora entre una masa en kg:");
                    masaD = t.nextDouble();
                    
                    System.out.println("Muy bien, acaba de entrar una masa de "+masaD+"kg !");
                    System.out.println("Elija un planeta para obtener el peso de tal masa:");
                    System.out.println("1 - Mercurio\n2 - Venus\n3 - La Tierra\n4 - Marte\n5 - Júpiter\n6 - Saturno\n7 - Urano\n8 - Neptuno");
                    E = t.nextInt();
                    
                    switch(E){
                        case 1: pesofinal = (masaD*(3.7)); System.out.println(masaD+"kg pesan "+pesofinal+"N en Mercurio"); break;
                        case 2: pesofinal = (masaD*(8.87)); System.out.println(masaD+"kg pesan "+pesofinal+"N en Venus"); break;
                        case 3: pesofinal = (masaD*(9.81)); System.out.println(masaD+"kg pesan "+pesofinal+"N en la Tierra"); break;
                        case 4: pesofinal = (masaD*(3.71)); System.out.println(masaD+"kg pesan "+pesofinal+"N en Marte"); break;
                        case 5: pesofinal = (masaD*(24.79)); System.out.println(masaD+"kg pesan "+pesofinal+"N en Júpiter"); break;
                        case 6: pesofinal = (masaD*(10.44)); System.out.println(masaD+"kg pesan "+pesofinal+"N en Saturnoo"); break;
                        case 7: pesofinal = (masaD*(8.87)); System.out.println(masaD+"kg pesan "+pesofinal+"N en Urano"); break;
                        case 8: pesofinal = (masaD*(11.15)); System.out.println(masaD+"kg pesan "+pesofinal+"N en Neptuno"); break;
                        default: System.out.println("Error 1");
                    } 
                    
                    
                    break;
                
                default: System.out.println("Error 2");
            }
                    
        }
    return pesofinal;
    }
}
