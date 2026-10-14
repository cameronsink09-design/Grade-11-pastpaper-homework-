
package com.mycompany.question2;
import javax.swing.*;
/**
 *
 * @author User
 */
public class Runner {
    
 private String time ; 
 private String name ; 
 private String club ; 
    
    
 public Runner (String time, String name, String club) { 
     
     this.time = time ; 
     this.name = name; 
     this.club = club ; 
     
     
     
 }
    public String getClub () { 
        
        return club ; 
    }
    
    public int getTimeInMins () { 
        
        int pos = time.indexOf(":") ; 
        String hours = time.substring(0,pos - 1);
        time = time.substring(pos +1) ; 
        
        pos = time.indexOf(":") ; 
        String mins = time.substring(0,pos - 1);
        time = time.substring(pos +1) ; 
        
        String secs = time ; 
        
        
        
        int inthours = Integer.parseInt(hours) ; 
        int intmins = Integer.parseInt(mins) ; 
        int intsecs = Integer.parseInt(secs) ; 
         
        
        if () { 
            
        }
    }
    
    
    
    
    
    
    
    
    
}
