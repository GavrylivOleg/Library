package com.demo;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


    Library library = new com.demo.entity.Library();
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int number = sc.nextInt();
            switch (number) {
                case 1: {
                    library.addBook();
                    break;
                }
                case 2: {
                    library.removebookByName();
                    break;
                }
                case 3: {
                    library.editBook();
                    break;
                }
                case 4: {
                    library.allBooks();
                    break;
                }
                default: {
                    System.out.println("check what did you write!!!");

                }
            }
        } else {
            System.out.println("Error!!!");
        }
    }
}
