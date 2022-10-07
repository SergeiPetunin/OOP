/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myclasses;

import java.util.Arrays;

/**
 *
 * @author pupil
 */
public class Book {
    
    private Author[] authors;
    private String title;

    public Book() {
        authors = new Author[0];
    }

    public Author[] getAuthors() {
        return authors;
    }

    public void setAuthors(Author[] authors) {
        this.authors = authors;
    }
    
    public void addAuthor(Author author) {
        // создаём копию authors с доплнительной ячейкой
        // в доп ячейку помещаем author
        // в authors кладём ссылку на новый массив.
        Author[] newAuthors = Arrays.copyOf(authors, authors.length + 1);
        newAuthors[newAuthors.length-1] = author;
        authors = newAuthors;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book: " + getTitle() + " | Authors " + Arrays.toString(getAuthors());
    }

 

}
