
package multiplicationtable;

import java.util.Scanner;

public class MultiplicationTable {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the number : ");
        int uInput = scan.nextInt();
        printTable(uInput);
    }
    
    
    public static void printTable(int userInput){
        for(int i=1; i<= userInput; i++){
            for(int j=1; j<= userInput; j++){
                if((i*j) < 10){
                    System.out.print("  " + i*j + " ");
                }
                else if((i*j) < 100){
                    System.out.print(" " + i*j + " ");
                }
                else{
                     System.out.print(i*j + " ");
                }
            }
            System.out.println("");
        }
    }
    
}
