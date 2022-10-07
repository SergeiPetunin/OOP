/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jktv21oopproba;


import myclasses.Author;
import myclasses.Book;

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

        Book book  = createBook("Book Ivanna");
        book.addAuthor(createAuthor("dsafdsa","fsafas"));
        System.out.println(book.toString());
    }
    
    private Author createAuthor (String firstname, String lastname) {
        Author author = new Author();
        author.setFirstname(firstname);
        author.setLastname(lastname);
        return author;
    }
    
    private Book createBook(String title) {
        Book book = new Book();
        book.setTitle(title);
        return book;
    }
}
