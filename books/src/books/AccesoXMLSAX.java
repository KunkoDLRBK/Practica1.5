/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package books;
import java.io.File;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
/**
 *
 * @author kike
 */
public class AccesoXMLSAX {
    
    public int parsearXMLconLibrosSAXhandler(File f){
   SAXParser parser;
        try{
        SAXParserFactory factory=SAXParserFactory.newInstance();
        parser=factory.newSAXParser();
        LibroSaxhandler sh=new LibroSaxhandler();
        parser.parse(f, sh);
        return 0;
        }catch(Exception e){
        e.printStackTrace();
        return -1;
        }
    }
}
