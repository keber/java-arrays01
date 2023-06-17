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
        // playground
        for(int i=0;i< myArray.length ; i++){
            System.out.println("posicion: " + i);
            System.out.println("Valor: " + myArray[i]);
        }
        */
        
        /*
        // playground
        System.out.println("Hola, bienvenido! " );
        for (int i = 0; i< myArray.length; i++ ){
            System.out.println("Dame el valor del número: " + (i+1) );
            myArray[i] = myScanner.nextInt();

            System.out.println("El número en la posición " + i + " con el valor " + myArray[i] + " es " + parImpar(myArray[i]));
        }
        */
        
        /* Assignment: 
            Ask user for a number (size), then create an array of given size and ask user for each element.
            Validate if numbers are mutiple of 5, in such case show value's position and if it is multiple of 5.
        */
        System.out.println("Please enter the amount of numbers to evaluate: ");
        Integer n = myScanner.nextInt();
        Integer [] myArray3 = new Integer[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter number " + (i+1) + ":");
            myArray3[i] = myScanner.nextInt();
        }
        for(int i=0;i<n;i++){
            if(myArray3[i]%5==0){
                System.out.println("Value " + myArray3[i] + " in array position " + i + "(element number " + (i+1) + ")" + " is multiple of 5.");
            }
        }
        
    }
}
