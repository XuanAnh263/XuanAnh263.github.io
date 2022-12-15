package home_work_day08.controler;

import home_work_day08.service.FilmService;

import java.util.Scanner;

public class FilmControler {
    FilmService filmService = new FilmService();
    public void runMenu() {
        Scanner scanner = new Scanner(System.in);
        int option = 0;
        boolean isQuit = false;

        while (!isQuit) {
            showMenu();

            System.out.println("Nhập lựa chọn : ");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1: {
                    filmService.showFilm();
                    break;
                }
                case 2: {
                    System.out.println("\nNhập tiêu đề phim muốn tìm : ");
                    String title = scanner.nextLine();
                    filmService.findFilmByTitle(title);
                    break;
                }
                case 3: {
                    isQuit = true;
                    break;
                }
                default: {
                    System.out.println("\nKhông tìm thấy. Vui lòng chọn lại! ");
                    break;
                }
            }
        }
    }

    public void showMenu() {
        System.out.println("\n----------Menu----------");
        System.out.println("1. In thông tin phim ra màn hình");
        System.out.println("2. Tìm phim theo tiêu đề");
        System.out.println("3. Thoát");
    }
}
