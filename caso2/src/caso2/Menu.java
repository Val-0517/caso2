/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caso2;

import java.util.Scanner;

/**
 *
 * @author rvale
 */
public class Menu {
    
    public void mostrarmenu() {
        Scanner scanner = new Scanner (System.in);
        int option; 
        
        do {
            System.out.println("\nMenú:");
            System.out.println("1 para mostrar habitaciones");
            System.out.println("2 para realizar reserva");
            System.out.println("3 para cancelar reserva");
            System.out.println("4 para buscar habitacion");
            System.out.println("0 Salir");
            System.out.print("Ingrese una opcion: ");
            option = scanner.nextInt();
            
            
        }
        
    }
     
    
    
}
