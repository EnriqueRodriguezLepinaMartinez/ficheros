/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escribir;

/**
 *
 * @author erodriguez-lepinamartinez
 */
public class Escribir {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EscribirFichero ficher = new EscribirFichero();
        ficher.escribirTexto("escritura.txt");
    }
    
}
