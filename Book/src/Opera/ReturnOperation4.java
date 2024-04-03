package Opera;

import book.Book;
import book.BookList;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.util.Scanner;

public class ReturnOperation4 implements IOPeration {
    @Override
    public void work(BookList bookList) {
        System.out.println("归还图书！");
        System.out.println("输入你要归还的图书:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int currentSize = bookList.getUsedSize();
        for (int i = 0; i < currentSize; i++) {
            Book book = bookList.getBook(i);
            if (bookList.getBook(i).getName().equals(name)&&
                    book.isBorrowed()) {
                book.setBorrowed(false);
                System.out.println("归还成功");
                return;

            }

        }
    }
}
