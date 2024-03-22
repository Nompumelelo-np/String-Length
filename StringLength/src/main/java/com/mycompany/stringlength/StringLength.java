/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.stringlength;
import java.util.Scanner;

/**
 *
 * @author Acer-User
 */
public class StringLength {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = input.next();
        int count = 0;
        for(int i = 0; i < word.length(); i++) 
        {  
            if(word.charAt(i) != ' ')  
            {
                count++; 
            }
        }  
           
        System.out.println("Total number of characters in a string: " + count); 
       
       
        
    }
}
