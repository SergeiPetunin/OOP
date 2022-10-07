/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tool;

import myclasses.Author;
import myclasses.Book;

/**
 *
 * @author pupil
 */
public class Tools {
    
    public Author createAuthor (String firstname, String lastname) {
        Author author = new Author();
        author.setFirstname(firstname);
        author.setLastname(lastname);
        return author;
    }
    
    public Book createBook(String title) {
        Book book = new Book();
        book.setTitle(title);
        return book;
    }
}
