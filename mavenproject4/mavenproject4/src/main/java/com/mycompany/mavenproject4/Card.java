
package com.mycompany.mavenproject4;
import javax.swing.*; 
/**
 *
 * @author User
 */
public class Card {

private String name;
private int health ; 
private int magic  ; 
private String inventory;


 
   public Card ( String name, int health, int magic, String inventory) { 
    
    this.name = name;
    this.health = health ; 
    this.magic = magic; 
    this.inventory = inventory ;
    
  
  
}
   public Card (String name) { 
     
       this.name = name; 
        

       
    health = (int) (Math.random() * 40) + 10 ;
    
    magic  = (int) (Math.random() * 20) + 20; 
    
    
    
    
       
    String [] swords = {"gold" , "silver" , "bronze" , "wood" , "straw" } ; 
    
    String [] healing = {"wand" , "bandage" , "ointment"} ; 
    
    String [] magic = {"potion" , "chant" , "lamp"} ; 
    
    int RandSword = (int) (Math.random() * 6) ; 
    System.out.println(swords[RandSword]);
   
    
    int RandHealing = (int) (Math.random() * 4) ; 
    System.out.println(healing[RandHealing]);
    
   int randMagic = (int) (Math.random() * 4) ; 
    System.out.println(magic[randMagic]);
    
    
    
       
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
  

