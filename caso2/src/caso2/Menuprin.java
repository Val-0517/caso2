/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caso2;

import java.util.Scanner;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author rvale
 */
public class Menuprin {
     public static void main(String[] args) {

        Vector<Habitaciones> vector = new Vector<>();

        Vector<Integer> busy = new Vector<>();
        Vector<Integer> available = new Vector<>();

        for (int i = 0; i < 25; i++) {
            int numero = i + 1;
            String tipo = null;
            String precio = null;
            String estado = "Disponible";  //Disponible, ocupado y limpio

            Habitaciones habitacion = new Habitaciones(numero, tipo, precio, estado);

            vector.add(habitacion);

            available.add(habitacion.numero);

        }

        OUTER:
        while (true) {

            String option = JOptionPane.showInputDialog("Indica la opcion que deseas realizar: \n\n1. Reservar\n2. Modificar\n3. Resumen\n4. Ganancias\n5.Visualizacion\n");
            
            if (option == null || !option.matches("[1-5]")) {
                break;
            }

            switch (option) {
                case "1" -> {
                    int reserva = Integer.parseInt(JOptionPane.showInputDialog("Indica la habitacion que deseas reservar: "));
                    for (int i = 0; i < 25; i++) {
                        if (available.get(i) == reserva) {
                            busy.add(reserva);
                            available.remove(reserva);
                            JOptionPane.showMessageDialog(null, "Espacio reservado " + reserva);
                            break;
                        }
                    }
                }
                case "2" -> {
                    int modificacion = Integer.parseInt(JOptionPane.showInputDialog("Indica la habitacion a la que deseas realizar la modificacion: "));
                    for (int i = 0; i < 25; i++) {
                        if (vector.get(i).numero == modificacion) {
                            String estado = JOptionPane.showInputDialog("Indica el nuevo status de la habitacion: ");
                            vector.get(i).status = estado;
                            JOptionPane.showMessageDialog(null, "Nuevo estado "+vector.get(i).status);
                            break;

                        }
                    }
                }
                case "3" -> {
                    System.out.println("habitaciones ocupadas: " + busy);
                    System.out.println("habitaciones disponibles: " + available);
                    System.out.println("Las demas habitaciones se encuentran en estado de limpieza");
                    break;
                }

                case "4" -> {
                    int simpHab = 0;
                    int doubleHab = 0;
                    int suite = 0;

                    if (busy == null) {
                        break;
                    }

                    for (int i = 0; i < busy.size(); i++) {
                        if (busy.get(i) < 11) {
                            simpHab++;
                        }
                        if (busy.get(i) < 21 && busy.get(i) >10) {
                            doubleHab++;
                        }
                        if (busy.get(i) < 26 && busy.get(i) > 20) {
                            suite++;
                        }
                    }

                    int totalOne = simpHab * 20;
                    int totalTwo = doubleHab * 25;
                    int totalThree = suite * 30;

                    int total = totalOne + totalTwo + totalThree;

                    System.out.println("Simple Hab: " + totalOne);
                    System.out.println("Double Hab: " + totalTwo);
                    System.out.println("Suite Hab: " + totalThree);
                    System.out.println("Total: " + total);
                    break;
                }

                case "5" -> {

                    for (int i = 0; i < 25; i++) {
                            System.out.print(vector.get(i).numero);
                            System.out.print(vector.get(i).precio);
                            System.out.print(vector.get(i).status);
                            System.out.print(vector.get(i).tipo);
                    }

                }

            }
        }
    }
   
                    
}
