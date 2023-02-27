package day11_Bam_Hasing._706_DesignHashMap;

import java.util.Objects;

public class MainTest {
    public static void main(String[] args) {
        String s1 = new String("Hello");
        String s2 = new String("Hello");
        int num = convert(s1);

        System.out.println("String " + s1 + " convert to number " + num );

        //convert Str --> number

        //convert sang 1 số bất kì

    }

    private static int convert(String s) {
        return s.hashCode();
    }
    static class MyObject{
        int val;

        MyObject(int val) {
            this.val = val;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            MyObject myObject = (MyObject) o;
            return val == myObject.val;
        }

        @Override
        public int hashCode() {
            return Objects.hash(val);
        }
    }

}
