/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caso2;

/**
 *
 * @author rvale
 */
public class habitacion {
    //caracteristicas de habitacion 
     int numero;
    String tipo;
    String precio;
    String status;


    public habitacion(int numero, String tipo, String precio, String status) {
        this.numero = numero;
        this.tipo = asignandoTipo(numero);
        this.precio = AsignandoPrecio(numero);
        this.status = status;
    }
    
   
    
    public String asignandoTipo (int numero) {
        if (numero < 11 ) {
            String tipo = "Simple";
        }
        if (numero < 21 ) {
            String tipo = "Double";
        }
        if (numero < 26) {
            String tipo = "Suite";
        }
        return tipo;
    }
    
        public String AsignandoPrecio (int numero) {
        if (numero < 11 ) {
            String precio = "$20";
        }
        if (numero < 21 ) {
            String precio = "$25";
        }
        if (numero < 26) {
            String precio = "$30";
        }
        return precio;
    }
    
    
}
