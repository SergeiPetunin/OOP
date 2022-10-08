/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tool;

import java.util.Arrays;
import java.util.Scanner;
import myclasses.Author;
import myclasses.Book;

/**
 *
 * @author pupil
 */
public class Tools {
    Scanner scanner = new Scanner(System.in);
    Book[] newBooks;
    public Author createAuthor (String firstname, String lastname) {
        Author author = new Author();
        author.setFirstname(firstname);
        author.setLastname(lastname);
        return author;
    }
    
//    public Book createBook(String title) {
//        Book book = new Book();
//        book.setTitle(title);
//        return book;
//    }
    
    public Book create() {
        Book book = new Book();
        createBooks();
        return book;
    }

    public void createBooks() {
            System.out.println("Сколько книг:? ");
            int num = scanner.nextInt();
            scanner.nextLine();
            Book[] books = new Book[num];
            for (int i = 0; i < num; i++) {
                Book book = new Book();
                System.out.println("Название книги: ");
                String title = scanner.nextLine();
                book.setTitle(title);
                System.out.println("Сколько авторов в этой книге:? ");
                int countAuthorsInBook = scanner.nextInt();
                scanner.nextLine();
                String firstname;
                String lastname;
                for (int j = 0; j < countAuthorsInBook; j++) {
                    System.out.println("Имя автора "  + (j+1) + ": ");
                    firstname = scanner.nextLine();
                    System.out.println("фамилия автора "  + (j+1) + ": ");
                    lastname = scanner.nextLine();
                    book.addAuthor(createAuthor(firstname, lastname));
                }
                books[i] = book;
            }
            newBooks = Arrays.copyOf(books, books.length);
            //System.out.println(Arrays.toString(books)); 
        for (int i = 0; i < books.length;i++) {
            System.out.println("Book: " + (i+1) + "--> Title: " + books[i]);
        }
    }
    
    public void searchBook(String title) {
        System.out.println("Введите название книги: ");
        title = scanner.nextLine();
        for (Book newBook : newBooks) {
            //System.out.println(newBooks[i]);
            if (title.equals(newBook.getTitle())) {
                System.out.println(newBook);
            }
        }
    }    
}
