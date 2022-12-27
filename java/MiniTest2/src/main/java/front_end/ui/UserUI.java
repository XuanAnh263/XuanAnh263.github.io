package front_end.ui;

import back_end.controller.UserController;
import back_end.database.UserDB;
import back_end.exception.NotFoundException;
import back_end.model.User;
import back_end.request.Request;
import back_end.utils.FileUtils;

import java.util.Scanner;

public class UserUI {
    private final Scanner scanner = new Scanner(System.in);
    private final UserController userController = new UserController();

    public void runMenu() {

        boolean isQuit = false;
        int option;

        while (!isQuit) {
            showMenu();

            try {
                System.out.print("Hãy nhập lựa chọn của bạn: ");
                option = Integer.parseInt(scanner.nextLine());

            } catch (Exception e) {
                System.out.println("Lựa chọn không hợp lệ. Hãy chọn lại! ");
                continue;
            }

            switch (option) {
                case 1 -> {
                    System.out.println("\n------------ LOG IN ------------");
                    String email = getEmailForLogin();

                    System.out.print("Nhập mật khẩu : ");
                    String password = scanner.nextLine();

                    Request checkLogin = new Request(email, password);

                    try {
                        userController.checkLogin(checkLogin);

                        if (email.equals("admin@gmail.com")) {

                            int optionAdMenu;
                            boolean isQuitAdMenu = false;

                            while (!isQuitAdMenu) {

                                adMenu();

                                try {
                                    System.out.print("Lựa chọn của bạn: ");
                                    optionAdMenu = Integer.parseInt(scanner.nextLine());

                                } catch (Exception e) {
                                    System.out.println("Lựa chọn không hợp lệ. Hãy chọn lại! ");
                                    continue;
                                }

                                switch (optionAdMenu) {
                                    case 1 -> {
                                        System.out.print("\n------------------ USER LIST ------------------");
                                        formattingDisplay();
                                        for (Object user : userController.findAll()) {
                                            System.out.println(user);
                                        }
                                    }
                                    case 2 -> {
                                        System.out.println("\n------------ FIND ACCOUNT ------------");
                                        System.out.println(findUserByEmail());
                                    }
                                    case 3 -> {
                                        System.out.println("\n------------ DELETE ACCOUNT ------------");
                                        deleteUser();
                                    }
                                    case 4 -> {
                                        System.out.println("\n------------- SEE YOU! -------------");
                                        isQuitAdMenu = true;
                                    }

                                    case 5 -> {
                                        System.out.println("\n------------- SEE YOU! -------------");
                                        isQuitAdMenu = true;
                                        isQuit = true;
                                    }
                                    default -> System.out.println("Lựa chọn không tồn tại!");
                                }
                            }
                        } else {

                            System.out.println("\n-------------- SUCCESFULLY SIGNED --------------");
                            System.out.printf("Chào mừng %s, bạn có thể thực hiện các công việc sau: \n",
                                    userController.findUserByEmail(email).getUsername());

                            int optionSubMenu;
                            boolean isQuitSubMenu = false;

                            while (!isQuitSubMenu) {

                                subMenu();

                                try {
                                    System.out.print("Lựa chọn của bạn: ");
                                    optionSubMenu = Integer.parseInt(scanner.nextLine());

                                } catch (Exception e) {
                                    System.out.println("Lựa chọn không hợp lệ. Hãy chọn lại! ");
                                    continue;
                                }

                                switch (optionSubMenu) {
                                    case 1 -> {
                                        System.out.println("\n------------ CHANGE USERNAME ------------");
                                        System.out.print("Nhập username mới của bạn: ");
                                        String newUsername = scanner.nextLine();

                                        userController.updateUsername(email, newUsername);
                                        System.out.println("Thay đổi username thành công!");
                                    }
                                    case 2 -> {
                                        System.out.println("\n------------ CHANGE EMAIL ------------");
                                        String newEmail = getEmail();

                                        userController.updateEmail(email, newEmail);
                                        System.out.println("Thay đổi email thành công!");
                                    }
                                    case 3 -> {
                                        System.out.println("\n------------ CHANGE PASSWORD ------------");
                                        changePassword(email);
                                    }
                                    case 4 -> {
                                        System.out.println("\n------------- GOOD BYE! -------------");
                                        isQuitSubMenu = true;
                                    }
                                    case 5 -> {
                                        System.out.println("\n------------- GOOD BYE! -------------");
                                        isQuitSubMenu = true;
                                        isQuit = true;
                                    }
                                    default -> System.out.println("Lựa chọn không hợp lệ!");
                                }
                            }
                        }
                    } catch (NotFoundException e) {
                        System.out.println(e.getMessage());
                    }
                }
                case 2 -> {
                    System.out.println("\n------------ SIGN UP ACCOUNT ------------");
                    System.out.print("Nhập UserName: ");
                    String userName = scanner.nextLine();

                    String email = getEmail();
                    String password = getPassword();

                    User newUser = new User(userName, email, password);
                    userController.createUser(newUser);

                    System.out.println("\nĐăng ký tài khoản thành công!");
                    formattingDisplay();
                    System.out.println(userController.findUserByEmail(email));
                }
                case 3 -> {
                    System.out.println("\n------------ FORGOT PASSWORD ------------");
                    System.out.print("Nhập vào email của bạn: ");
                    String email = scanner.nextLine();

                    if (userController.checkEmail(email)) {
                        changePassword(email);

                    } else {
                        System.out.println("Tài khoản không tồn tại!");
                    }
                }
                default -> System.out.println("Lựa chọn không hợp lệ. Hãy chọn lại! ");
            }
        }
    }

    private void showMenu() {

        System.out.println("---------------------------------");
        System.out.println("------------ WELCOME ------------");
        System.out.println("""
                1. LOG IN
                2. REGISTRATION
                3. FORGOT PASSWORD
                """);
    }

    private void subMenu() {
        System.out.println("""
                \n1. Thay đổi username
                2. Thay đổi email (Không được trùng với email của user khác trong List)
                3. Thay đổi mật khẩu
                4. Đăng xuất (Sau khi đăng xuất quay về mục yêu cầu đăng nhập hoặc đăng ký)
                5. Thoát chương trình
                """);

    }

    private void adMenu() {
        System.out.println("------------ ADMIN ------------");
        System.out.println("""
                1. Hiển thị tất cả các tài khoản
                2. Tìm tài khoản 
                3. Xóa tài khoản
                4. Đăng xuất
                5. Thoát chương trình
                """);
    }

    private User findUserByEmail() {
        boolean checkEmail = false;
        User user = new User();
        while (!checkEmail) {
            System.out.print("Nhập email: ");
            String email = scanner.nextLine();
            if (userController.checkEmailValid(email)) {
                if (userController.checkEmailExists(email)) {
                    user = userController.findUserByEmail(email);
                    formattingDisplay();
                    checkEmail = true;
                } else {
                    System.out.println("Email không tồn tại!");
                }
            } else {
                System.out.println("Email không hợp lệ!");
            }
        }
        return user;
    }

    private void deleteUser() {
        User user = findUserByEmail();
        System.out.println(user);

        boolean isDelete = false;
        while (!isDelete) {
            System.out.printf("\nBạn có thực sự muốn xóa tài khoản %s không?\n", user.getEmail());
            System.out.println("1. Có \t\t 2. không");
            int option = 0;
            try {
                option = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Lựa chọn không hợp lệ. Hãy chọn lại!");
            }
            if (option == 1) {
                userController.deleteUser(user);
                System.out.println("Đã xóa tài khoản thành công!");
                isDelete = true;
            } else if (option == 2) {
                isDelete = true;
            } else {
                System.out.println("Lựa chọn không có. Hãy chọn lại!");
            }
        }
    }

    private String getEmailForLogin() {
        boolean checkEmail = false;
        String email = "";
        while (!checkEmail) {
            System.out.print("\nNhập email của bạn: ");
            email = scanner.nextLine();
            if (userController.checkEmailValid(email)) {
                checkEmail = true;
            } else {
                System.out.println("Email không hợp lệ!");
            }
        }
        return email;
    }

    private String getEmail() {

        boolean checkEmail = false;
        String newEmail = "";
        while (!checkEmail) {
            System.out.print("Nhập email: ");
            newEmail = scanner.nextLine();
            if (userController.checkEmailValid(newEmail)) {
                if (!userController.checkEmailExists(newEmail)) {
                    checkEmail = true;
                } else {
                    System.out.println("Email đã tồn tại!");
                }
            } else {
                System.out.println("Email không hợp lệ!");
            }
        }
        return newEmail;
    }

    private void changePassword(String email) {
        boolean checkPassword = false;
        while (!checkPassword) {
            System.out.print("\nNhập mật khẩu mới cho tài khoản của bạn: ");
            String newPassword = scanner.nextLine();

            if (userController.checkPassword(newPassword)) {
                Request updatePassword = new Request(email, newPassword);
                userController.updatePassword(updatePassword);
                System.out.println("Đổi mật khẩu thành công!");
                checkPassword = true;
            } else {
                System.out.println("Mật khẩu phải có ít nhất từ 7 đến 15 ký tự");
            }
        }
    }

    private String getPassword() {
        String password = "";
        boolean checkPassword = false;
        while (!checkPassword) {
            System.out.print("Nhập mật khẩu: ");
            password = scanner.nextLine();

            if (userController.checkPassword(password)) {
                checkPassword = true;
            } else {
                System.out.println("Mật khẩu phải có ít nhất từ 7 đến 15 ký tự");
            }
        }
        return password;
    }

    private void formattingDisplay() {
        System.out.printf("\n%-15s %-25s %-15s\n", "UserName", "   Email", "Password");
        System.out.println("----------------------------------------------------");
    }
}
