/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escribir;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author erodriguez-lepinamartinez
 */
public class EscribirFichero {
        File fich;
        PrintWriter f = null;
    public void escribirTexto(String nomFich){
        try{
            fich = new File(nomFich);
            f = new PrintWriter(fich);
            f.println("Probando escritura");
            f.println("con varias lineas");
            f.println("de texto");
        } catch (FileNotFoundException ex){
            System.out.println("erro 1"+ ex.getMessage());
        }
        finally{
            f.close();
        }
    }
    
    public void engadirTexto(String nomFich){
        try{
            
        } catch (IOException ex){
            System.out.println("erro 2"+ex.getMessage());
        }
        finally{
            close();
        }
    }
    
}
