package user;

import Opera.IOPeration;
import book.BookList;

import javax.jws.soap.SOAPBinding;
import java.awt.*;

public abstract class User {
    protected String name;

    protected IOPeration[] ioPerations;
    public User(String name){
        this.name = name;
    }

    public abstract int menu();

    public  void doWork(int choice, BookList bookList){
        this.ioPerations[choice].work(bookList);
    }
}
