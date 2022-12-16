package learningWrapper;

import java.util.ArrayList;

public class WrapperClass {
    //sử dụng để chuyển đổi các kiểu dữ liệu nguyên thủy(int, char, float,....) thành các đối tượng tương ứng
    //có defaul value là null

    //1. Convert Primitive Type to Wrapper Objects
    //Sử dụng valueOf() để convert primitive thành  wrapper object tương ứng
    //Example:
    public static void main(String[] args) {

        // Định nghĩa các biến thuộc kiểu dữ liệu nguyên thủy
        int a = 5;
        double b = 5.65;

        // Chuyển đổi thành wrapper objects tương ứng
        //sử dụng .valueOf()
        Integer aObj = Integer.valueOf(a);
        Double bObj = Double.valueOf(b);

        //Sử dụng instanceof để kiểm ra kiểu dữ liệu đã chuyển có đúng kiểu dữ liệu chúng ta đã chuyển hay không
        if(aObj instanceof Integer) {
            System.out.println("Một object thuộc Integer đã được tạo.");
        }

        if(bObj instanceof Double) {
            System.out.println("Một object thuộc Double đã được tạo.");
        }

        //2. Wrapper Objects into Primitive Types

        // Tạo object thuộc wrapper class
        Integer aObj2 = Integer.valueOf(23);
        Double bObj2 = Double.valueOf(5.55);

        // Chuyển đổi thành kiểu dữ liệu nguyên thủy tương ứng
        int a1 = aObj2.intValue();
        double b1 = bObj2.doubleValue();

        System.out.println("Giá trị a = " + a1);
        System.out.println("Giá trị b = " + b1);


        //3. Lợi ích khi sử dụng wrapper class
        //Trong Java, đôi khi chúng ta có thể cần sử dụng các Object thay vì các kiểu dữ liệu nguyên thủy.
        //Ví dụ, khi làm việc với collections.
        // error
//        ArrayList<int> list = new ArrayList<>();

        // Hoạt động bình thường
        ArrayList<Integer> list = new ArrayList<>();

        //Chúng ta có thể lưu trữ giá trị null trong wrapper object (điều này không thể làm được đối với kiểu dữ liệu nguyên thủy)
        // Sinh ra lỗi
//        int a7 = null;

        // Hoạt động bình thường
        Integer a7 = null;




        //4. Java Autoboxing - Primitive Type to Wrapper Object
        //Trong autoboxing, trình biên dịch Java (Java compiler) sẽ tự động chuyển đổi các kiểu nguyên thủy thành các wrapper object tương ứng của chúng
        //Example:
        int a2 = 56;

        // autoboxing
        Integer aObj3 = a;

        //5. Java Unboxing - Wrapper Objects to Primitive Types
        //Trong unboxing, trình biên dịch Java (Java compiler) sẽ tự động chuyển đổi các wrapper object thành các kiểu nguyên thủy tương ứng của chúng.
        //Example:
        // autoboxing
        Integer aObj5 = 56;

        // unboxing
        int a5 = aObj;
    }



}
