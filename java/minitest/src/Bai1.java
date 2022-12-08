public class Bai1 {
    public static void main(String[] args) {
        printRectangle(4,4);
        System.out.println();
        triangle(4);
    }

    //1.
    public static void printRectangle(int row, int col){
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //2.
    public static void triangle(int h) {
        int height = 4;
        for (int i = 1; i <= height; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
