package org.example.book_management.front_end.ui;

import org.example.book_management.back_end.controller.BookController;
import org.example.book_management.back_end.model.Book;
import org.example.book_management.back_end.service.BookService;

import java.util.List;
import java.util.Scanner;

public class BookUI {
    private final BookController bookController = new BookController();

    public void run() {
        Scanner sc = new Scanner(System.in);

        int option = 0;
        boolean isQuit = false;

        while (!isQuit) {
            showMenu();

            System.out.print("Nhập lựa chọn : ");
            option = Integer.parseInt(sc.nextLine());

            switch (option) {
                case 1: {
                    List<Book> books = BookController.getBooks();
                    if (books.isEmpty()) {
                        System.out.println("không có quyển sách nào trong danh sách");
                    } else {
                        System.out.println("Danh sách book : ");
                        for (Book b : books) {
                            System.out.println(b);
                        }
                    }
                    break;
                }
                case 2: {
                    System.out.println("Nhập tên sách : ");
                    String name = sc.nextLine();

                    List<Book> books = BookController.getBooksByName(name);
                    if (books.isEmpty()) {
                        System.out.println("không có quyển sách nào có tên là : " + name);
                    } else {
                        System.out.println("Danh sách book có tên : " + name + " là : " );
                        for (Book b : books) {
                            System.out.println(b);
                        }
                    }
                    break;
                }
                default: {

                    break;
                }
            }
        }
    }

    public static void showMenu() {
        System.out.println("\n********* MENU *********");
        System.out.println("1 - Xem danh sách books");
        System.out.println("2 - Tìm sách theo tên");
        System.out.println("0 - Thoát\n");
    }


}
