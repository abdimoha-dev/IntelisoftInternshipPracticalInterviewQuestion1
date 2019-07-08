/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkstringanagrams; 
import java.util.Arrays; 

/**
 *
 * @author Abdi Mohammed
 */
public class CheckStringAnagrams {

    /* function to check whether two strings are anagram of each other */
    static boolean areAnagram(char[] firstStr, char[] secondStr) 
    { 
        // Get lenghts of both strings 
        int x = firstStr.length; 
        int y = secondStr.length; 
  
        // If length of both strings is not same, 
        // then they cannot be anagram 
        if (x != y) 
            return false; 
  
        // Sort both strings 
        Arrays.sort(firstStr); 
        Arrays.sort(secondStr); 
  
        // Compare sorted strings 
        for (int i = 0; i < x; i++) 
            if (firstStr[i] != secondStr[i]) 
                return false; 
  
        return true; 
    } 
  
    /* Driver program to test to print printDups*/
    public static void main(String args[]) 
    { 
        char firstStr[] = { 'g', 'o', 'o', 'd' }; 
        char secondStr[] = { 'd', 'o', 'g', 'o' }; 
        if (areAnagram(firstStr, secondStr)) 
            System.out.println("The two strings are anagram of each other"); 
        else
            System.out.println("The two strings are not anagram of each other"); 
    } 
    
}
