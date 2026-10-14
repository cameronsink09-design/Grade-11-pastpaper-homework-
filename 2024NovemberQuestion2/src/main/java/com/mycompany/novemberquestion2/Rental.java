
package com.mycompany.novemberquestion2;
import javax.swing.*; 
import java.time.LocalDate ; 
/**
 *
 * @author User
 */
public class Rental {

private String cName ; 
private String regNo ; 
private String type ; 
private double cost ; 
private LocalDate taken ; 
private LocalDate returned ; 

public static double BASE_FEE = 1000; 
public static int totalRentals ; 
    

public Rental (String cName, String regNo, String type, double cost, LocalDate taken, LocalDate returned) { 
    
    this.cName = cName ; 
    this.regNo = regNo ; 
    this.type = type; 
    this.cost = cost ; 
    this.taken = taken; 
    this.returned = returned ; 
    
    totalRentals++ ; 
}

public String getType () { 
    return type  ; 
}
public String getRegNo () { 
    return regNo ; 
}
public LocalDate getTaken () { 
    return taken ;  
}
public LocalDate getReturned() { 
    return returned ; 
}


public int numDaysRented () {  
 
int numDaysRented = taken + returned ;    
int diffBetween; 

 diffBetween = taken - returned ; 
   
 return diffBetween;   
}

public double getRentalCost () { 
    
  
  numDaysRented * cost + BASE_FEE ; 
    
  return numDaysRented 
    
    
}

public String .toString() { 
    
    return .toString(cName + "\n" + "********************" 
            + regNo + "\t" + "@" + "R" + "per day" + 
            "\n" + "Date rented:" + taken + 
            "\n" + "Date returned: " + returned + 
            "\n" + "Number of Days; " + numDaysRented + 
            "R" "\s" + getRentaCost) ; 
}







}
