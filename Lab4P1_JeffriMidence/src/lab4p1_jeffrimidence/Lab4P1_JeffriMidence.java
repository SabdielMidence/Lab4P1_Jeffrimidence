/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4p1_jeffrimidence;

import java.util.Scanner;

/**
 *
 * @author sabdi
 */
public class Lab4P1_JeffriMidence {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Scanner lea = new Scanner(System.in);
        boolean respuesta = true;
             while (respuesta){//inicio del while
                 System.out.println(" ");
                 System.out.println("BIENVENIDOS AL PROGRAMA");
                 System.out.println(" ");
                 System.out.println("1- CONJUTOS ");
                 System.out.println("2- CONTRASE;A MEJORADA ");
                 System.out.println("3- SALIR DEL PROGRAMA ");
                 int opcion = sc.nextInt();
                 
                 switch (opcion){//inicio del switch
                     case 1:
                         
                         break;
                     case 2:
                         int acumulador2 = 0;
                         String palabra1;
                         String acumulador = "";
                         System.out.println("Ingrese la contrase;a: ");
                         palabra1 = sc.next().toLowerCase();
                         System.out.println("Ingrese un numero: ");
                         int numero = lea.nextInt();
                         System.out.println("Su contrase;a es: "+palabra1);
                         System.out.println("Su nuemero es: "+numero);
                            for (int i = 0;i<palabra1.length();i++){
                                int q = palabra1.charAt(i);
                                if (palabra1.charAt(0) >= 97 &&palabra1.charAt(0) <= 122){//inicio del if de las palabras
                                acumulador +=1;
                                }//fin del if de las palabtas
                                if (numero >= 48 && numero <= 57){//inicio del if de los nuemros
                                acumulador2++;
                                }//fin del if de los numeros
                                    }//fin del for
                              if (palabra1.length() < 8){
                                  System.out.println("  Su contrase;a es tiene que tener mas de 8 caracteres ");
                              }
                                if( numero == 0){
                                    System.out.println("Su contrase;a no es segura, porque no tiene numeros");
                                }
                                String nueva_contra = "";
                         
                             for (int o = 0;o < palabra1.length(); o++)
                             if (palabra1.charAt(1) != 2 ){
                                 nueva_contra += palabra1.charAt(1);
                                 nueva_contra += numero;
                                 numero++;
                             }else{
                                 nueva_contra += palabra1.charAt(1);
                             }
                       
                         break;
                     case 3:
                         System.out.println("\033[36mGRACIAS POR UTILIZAR EL PROGRAMA");
                         respuesta = false;
                         break;
                 }//fin del switch
             }//fin del while   
    }//fin del main
    
}//fin del class
