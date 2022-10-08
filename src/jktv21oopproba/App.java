/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jktv21oopproba;


import java.util.Scanner;
import tool.Tools;

/**
 *
 * @author pupil
 */
public class App {
    Scanner scanner = new Scanner(System.in);
    public void run() {
        Tools tools = new Tools();
        int num;
        while(true) {
            System.out.println("Enter 1 to Add\nEnter 2 to Search\nEnter 3 to Delete\nEnter 4 to Exit");
            num = scanner.nextInt();
            switch(num) {
                case 1:
                    tools.create();
                    break;
                case 2:
                    tools.searchBook("");
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }
}

//        Book b  = new Book();
//        b.setTitle("Java");
//        b.addAuthor(createAuthor("Antonio", "Banderos"));
//        System.out.println(b.toString());
//        Tools tools = new Tools();
//        Book book  = tools.createBook("Book Ivanna");
//        book.addAuthor(tools.createAuthor("dsafdsa","fsafas"));
//        System.out.println(book.toString());
//-----------------------------------------------------------------

