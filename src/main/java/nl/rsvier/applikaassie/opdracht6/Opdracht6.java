/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opdracht6;

import java.util.Scanner;

/**
 *
 * @author Frank
 */
public class Opdracht6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        System.out.println("hallo");
        System.out.println("Hoofdmenu - 0: Inloggen als medewerker");
        System.out.println("Hoofdmenu - 1: Inloggen als klant");
        System.out.println("enter your choice : ");
        
        Scanner input = new Scanner(System.in);
        
        int IN = input.nextInt();
        
        if (IN == 0)  System.out.println("medewerkermodus login");
        else if(IN==1)       System.out.println("klant login");
        else System.out.println("invalid input");
        
        
        
    }
    
}
