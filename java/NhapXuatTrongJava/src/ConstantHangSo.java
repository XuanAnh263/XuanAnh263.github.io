public class ConstantHangSo {

    public static final String EMAIL = "admin@gmai.com";

    public static void main(String[] args) {
        final String name = "bob";
        final String FIRST_NAME = "Anna";
        final int NUMBER;
        NUMBER = 10;

        System.out.println(name);
        System.out.println(FIRST_NAME);
        System.out.println(NUMBER);
        System.out.println(EMAIL);
    }

    // Method final thì ko thể overide (ghi đè)
    public static final int sumTwoNumber(int a, int b) {
        return a + b;
    }
}
