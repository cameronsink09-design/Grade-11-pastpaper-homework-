
package com.mycompany.mavenproject4;
import javax.swing.*; 
import java.io.File;
import java.util.Scanner ;
import java.io.FileNotFoundException ;
import java.util.Arrays;


public class ClassArray {
    
 
private int size ; 
private String [] cardArr = new String [20] ; 
    
    
    
public ClassArray () { 
    
    try { 
    Scanner scFile = new Scanner (new File("Characters.txt")) ; 
    
    while (scFile.hasNextLine()) { 
        
         String Line = scFile.nextLine() ; 
        
         for (int i = 0  ; i < 19 ; i++) { 
             
           cardArr [i] = Line  ;  
         }
             
             
         
    } 

    
    scFile.close();
    
    
    }
    catch (FileNotFoundException e) { 
        System.out.println("File not Foound");
    }
    
    
    
    
    
}    
  public String toString () { 
      
      return "Characters.txt" + "\n" ; 
  }   

    
    public Card sort () { 
        
        
    Arrays.sort(cardArr);
        
    return cardArr ;  
        
        
    }
    
    public Card find (int position) { 
        
    return cardArr [position] ; 
       
        
        
        
        
        
    }
    public Card delete (int position) { 
        
    for (cardArr [i] ; cardArr  = i + 1; i++ )  
        
        return cardArr ; 
    }
    
    
    
    
    public Card playGame () { 
    
    }    
        
     
       
        
        
        
        
        
        
    
    
    
    
    
    
} 

