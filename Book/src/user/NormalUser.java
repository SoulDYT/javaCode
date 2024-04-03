package user;

import Opera.*;

import java.util.Scanner;

public class NormalUser extends User{
    public NormalUser(String name) {
        super(name);
        this.ioPerations  = new IOPeration[] {
                new ExitOperation(),
                new Findoperation(),
                new BorrowOperation(),
                new ReturnOperation4(),
        };
    }
    public int menu(){
        System.out.println("*******************************");
        System.out.println("hello"+name+"欢迎来到图书管理系统");
        System.out.println("1.查找图书");
        System.out.println("2.借阅图书");
        System.out.println("3.归还图书");
        System.out.println("0.退出系统");
        System.out.println("********************************");
        System.out.println("请输入你的操作：");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;
    }
}
