/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jktv21oopproba;



import myclasses.Book;
import tool.Tools;

/**
 *
 * @author pupil
 */
public class App {
    
    public void run() {
        
//        Book b  = new Book();
//        b.setTitle("Java");
//        b.addAuthor(createAuthor("Antonio", "Banderos"));
//        System.out.println(b.toString());
        Tools tools = new Tools();
        Book book  = tools.createBook("Book Ivanna");
        book.addAuthor(tools.createAuthor("dsafdsa","fsafas"));
        System.out.println(book.toString());
    }
 
}
