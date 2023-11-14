/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package books;
import java.io.File;
/**
 *
 * @author kike
 */
public class Books {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File f=new File("book.xml");
        AccesoXMLSAX a =new AccesoXMLSAX();
        a.parsearXMLconLibrosSAXhandler(f);
    }
    
}
