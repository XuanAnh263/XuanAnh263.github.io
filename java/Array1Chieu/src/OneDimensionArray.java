public class OneDimensionArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        String[] friends = {"nam" , "Hưng", "la", "hien"};
        float[] marks = {6.5f, 7.5f, 8.5f, 9.25f};


//        System.out.println("độ dài mảng numbers : " + numbers.length);
//        System.out.println("độ dài mảng friends : " + friends.length);
//        System.out.println("độ dài mảng mark : " + marks.length);

//        System.out.println(friends[1]);
//        friends[1] = "Hoàng";
//        System.out.println(friends[1]);
//
//        for (int i = 0; i < friends.length; i++) {
//            System.out.println("friends[" + i + "]  = "+friends[i]);
//        }

        int[] array = new int[100];

        System.out.println(array[0]);
        System.out.println(array[10]);

        String[] str = new String[20];

        System.out.println(str[2]);

        boolean[] bools = new boolean[200];
        bools[10] = true;
        bools[20] = false;
        System.out.println(bools[10]);
    }
}
