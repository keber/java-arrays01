/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.keberlabs.arrays01;

import java.util.*;

/**
 *
 * @author Keber
 */
public class Arrays01 {

    public static String parImpar(Integer num){
        return((num%2==0)?"par":"impar");
    }

    
    public static void main(String[] args) {
        Integer [] myArray = new Integer[5];
        Scanner myScanner = new Scanner(System.in);
        
        
        // for (String myArray1 : myArray) {
        /*
        for(int i=0;i< myArray.length ; i++){
            System.out.println("posicion: " + i);
            System.out.println("Valor: " + myArray[i]);
        }
        */
        
        System.out.println("Hola, bienvenido! " );
        for (int i = 0; i< myArray.length; i++ ){
            System.out.println("Dame el valor del número: " + (i+1) );
            myArray[i] = myScanner.nextInt();

            System.out.println("El número en la posición " + i + " con el valor " + myArray[i] + " es " + parImpar(myArray[i]));
        }
        
        
    }
}
