/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jktv21oopproba;


import java.util.Scanner;
import java.util.Arrays;
import myclasses.Book;
import tool.Tools;

/**
 *
 * @author pupil
 */
public class App {
    
    public void run() {
        Scanner scanner = new Scanner(System.in);
//        Book b  = new Book();
//        b.setTitle("Java");
//        b.addAuthor(createAuthor("Antonio", "Banderos"));
//        System.out.println(b.toString());
        Tools tools = new Tools();
        Book book  = tools.createBook("Book Ivanna");
        book.addAuthor(tools.createAuthor("dsafdsa","fsafas"));
        System.out.println(book.toString());
        Book[] books  = new Book[2];
        for (int i = 0; i < 2; i++) {
            System.out.println("Название книги: ");
            String title = scanner.nextLine();
            book = new Book();
            book.setTitle(title);
            System.out.println("Сколько авторов в этой книге:? ");
            int countAuthorsInBook = scanner.nextInt();
            scanner.nextLine();
            String firstname = "";
            String lastname = "";
            for (int j = 0; j < countAuthorsInBook; j++) {
                System.out.println("Имя автора "  + (j+1) + ": ");
                firstname = scanner.nextLine();
                System.out.println("фамилия автора "  + (j+1) + ": ");
                lastname = scanner.nextLine();
                book.addAuthor(tools.createAuthor(firstname, lastname));
            }
            
            
            books[i] = book;
        }
        System.out.println(Arrays.toString(books));
    }
 
}
