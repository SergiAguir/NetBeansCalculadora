/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejemplo;
import java.util.Scanner;
/**
 *
 * @author alumne
 */
public class Ejemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        String nombre;
        System.out.println("Introduce tu nombre");
        nombre = teclado.next();
        System.out.println("Tu nombre es "+nombre);
    }
    
}
