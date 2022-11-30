import java.util.Scanner;

public class Switch_case {
    public static void main(String[] args) {

        //1.
        int day = 6;

        switch (day) {
            case 0: {
                System.out.println("Hôm nay là chủ nhật");
                break;
            }

            case 1: {
                System.out.println("Hôm nay là thứ hai");
                break;
            }
            case 2: {
                System.out.println("Hôm nay là thứ ba");
                break;
            }
            case 3: {
                System.out.println("Hôm nay là thứ tư");
                break;
            }
            case 4: {
                System.out.println("Hôm nay là thứ năm");
                break;
            }
            case 5: {
                System.out.println("Hôm nay là thứ sáu");
                break;
            }
            case 6: {
                System.out.println("Hôm nay là thứ bảy");
                break;
            }
            default: {
                System.out.println("không có trong tuần");
                break;
            }

        }

        //2.
        int month = 9;
        switch (month) {
            case 1:
            case 2:
            case 3: {
                System.out.println("Mùa Xuân");
                break;
            }
            case 4:
            case 5:
            case 6: {
                System.out.println("Mùa Hạ");
                break;
            }
            case 7:
            case 8:
            case 9: {
                System.out.println("Mùa Thu");
                break;
            }
            case 10:
            case 11:
            case 12: {
                System.out.println("Mùa Đông");
                break;
            }
            default: {
                System.out.println("không có mùa trong năm");
                break;
            }
        }
    }
}
