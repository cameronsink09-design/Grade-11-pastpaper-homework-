
package com.mycompany.mavenproject4;
import javax.swing.*; 
/**
 *
 * @author User
 */
public class Card {

private static String name;
private static int health ; 
private static int magic  ; 
private static String inventory;


 
   public Card ( String name, int health, int magic, String inventory) { 
    
    this.name = name;
    this.health = health ; 
    this.magic = magic; 
    this.inventory = inventory ;
    
  
  
}
   public Card (String name) { 
     
       this.name = name; 
   

       
    health = (int) (Math.random() * 50) + 1 ;
    
    magic  = (int) (Math.random() * 40) + 1; 
    
    
    
    
       
    String [] swords = {"gold" , "silver" , "bronze" , "wood" , "straw" } ; 
    
    String [] healing = {"wand" , "bandage" , "ointment"} ; 
    
    String [] magic = {"potion" , "chant" , "lamp"} ; 
    
       
    swords = (int) (Math.random() * 5) + 1 ;
    
    healing = (int) (Math.random() * 3) + 1 ;
    
    magic = (int) (Math.random() * 3) + 1 ;
    
    
    
       
   }
    
    String name () { 
        
        return (name) ; 
        
    }
    int health () { 
        
        return (health) ; 
        
    }
    int magic () { 
        
        return (magic) ; 
        
    }
    
    public void changeSword (String newSword) { 
        
       changeSword ("gold") ; 
       changeSword ("silver") ;
       changeSword ("bronze") ;
       changeSword ("wood") ;
       changeSword ("straw") ;
       
    }
    
    public void updateCard (int newStats) { 
        
    updateCard (health) ; 
    updateCard (magic) ;  
     
   
    }
  
    public String toString () { 
        
        return name + "\t" + health + "\t" + magic + "\n" + "Inventory" + inventory; 
    }
    
    
    
    
    
  }
  

