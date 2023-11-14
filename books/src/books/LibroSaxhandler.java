/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package books;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.*;

/**
 *
 * @author kike
 */
public class LibroSaxhandler extends DefaultHandler{
    public LibroSaxhandler() {}
        @Override
        public void startElement(String uri,String localName,String qName,Attributes atts) throws SAXException{
        if(qName.equals("book")){
        System.out.println("La ID es: "+atts.getValue(atts.getQName(0)));//extrae el primer atributo

        }else if(qName.equals("author")){
        System.out.print("\n El autor es: ");//aún no sabemos cúal es el título, eso lo sabremos en el evento characters
        }else if(qName.equals("title")){
        System.out.print("\n El author es: ");
        }else if(qName.equals("genre")){
        System.out.print("\n El genero es: ");
        }else if(qName.equals("price")){
        System.out.print("\n El precio es: ");
        }else if(qName.equals("publish_date")){
        System.out.print("\n La fecha de publicacion es: ");
        }else if(qName.equals("description")){
        System.out.print("\n La descripcion es: ");
        }
        }
        @Override
        public void endElement(String uri, String localName,String qName) throws SAXException{

        if(qName.equals("book")){
        System.out.println("\n-----------------------");
        }
        }
        @Override
        public void characters(char[] ch, int start, int length) throws SAXException{

        String car=new String(ch,start,length);
        car=car.replaceAll("\t","");//quita todos los tabuladores
        car=car.replaceAll("\n","");
        car=car.replaceAll("\\s"," ");
        System.out.print(car); 
        }
}
