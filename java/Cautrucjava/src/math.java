public class math {
    public static void main(String[] args) {
        System.out.println(Math.PI);

        System.out.println(Math.ceil(3.3));
        System.out.println(Math.floor(3.7));
        System.out.println(Math.max(10, 20));
        System.out.println(Math.min(10, 20));
        System.out.println((int) Math.pow(5, 2));
        System.out.println(Math.sqrt(25));
        System.out.println(Math.random());

        // công thức tính random 1 số nguyên (0 ==> n)
        int randomNumber = (int) Math.floor(Math.random() * 100);
        System.out.println(randomNumber);


        // công thức tính random 1 số nguyên (n ==> m)
        // 100 ==> 999 (max - min + 1) + min
        int randomNumber1 = (int) Math.floor(Math.random() * (999 - 100 + 1) + 100);
        System.out.println(randomNumber1);

    }
}
