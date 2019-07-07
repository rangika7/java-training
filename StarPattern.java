package starpattern;

import java.util.Scanner;

public class StarPattern {
    
    public static void diamondPattern(int value){
        
        int space = value - 1; 
      
        for (int i = 0; i < value; i++) 
        { 
            for (int j = 0; j < space; j++) 
                System.out.print(" "); 
     
            for (int j = 0; j <= i; j++) 
                System.out.print("* "); 
      
            System.out.println(""); 
            space--; 
        }
        
       space = 0; 
      
        for (int i = value-1; i > 0; i--) 
        { 
            for (int j = 0; j <= space; j++) 
                System.out.print(" "); 
      
            for (int j = 0; j < i; j++) 
                System.out.print("* "); 
      
            System.out.println(""); 
            space++; 
        } 
    }   
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number to print diamond pattern : ");
        int userInput = s.nextInt();
        diamondPattern(userInput);
    }
}