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

    public static void main(String[] args) {
        String [] myArray = new String[5];
        myArray[0] = "Omar";
        myArray[1] = "Hanz";
        myArray[2] = "Diego";
        myArray[3] = "Sofia";
        myArray[4] = "Daniela";
        
        // for (String myArray1 : myArray) {
        for(int i=0;i< myArray.length ; i++){
            System.out.println("posicion: " + i);
            System.out.println("Valor: " + myArray[i]);
        }
        
        Integer [] myArray2 = { 5,6,7,8 };
        for (int i = 0; i< myArray2.length; i++ ){
            System.out.println("posicion: " + i);
            System.out.println("Valor: " + myArray2[i]);
        }
    }
}
