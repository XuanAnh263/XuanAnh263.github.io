package arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo {
    //là mảng động để lưu trữ phần từ
    //không cần khai báo độ dài phần tử
    //có thể chứa các phần tử trùng lặp
    //duy trì thứ tự của phần tử được thêm vào
    //không đồng bộ (làm việc với nhiều luồng)
    //cho phép truy cập ngẫu nhiên vì nó lưu dữ liệu theo chỉ mục
    //thao tác chậm vì cần tính toán lại khi xóa phần tử/chỉ số
    //1. Tạo ArrayList
//    ArrayList<data_type> arrayList= new ArrayList<>();

    //2. Constructor của lớp ArrayList
//    ArrayList(): Được sử dụng để tạo arraylist trống
//    ArrayList(int initialCapacity): Được sử dụng để xây dựng một danh sách mảng mà có dung lượng ban đầu được chỉ định.
//    ArrayList(Collection c): Được sử dụng để xây dựng một danh sách mảng được khởi tạo với các phần tử của collection c

    public static void main(String[] args) {
        //3. Hướng dẫn khởi tạo ArrayList
        //Cách 1:
        ArrayList<Integer> numbers = new ArrayList<>(); //khai báo 1 arraylist rỗng
        //sau đó add giá trị vào
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        //Cách 2: Khai báo và khởi tạo luôn giá trị cho nó
        //Sử dụng List.of
        ArrayList<String> names = new ArrayList<>(List.of("Anh", "Xuan","Tu"));

        //4. Một số phương thức của ArrayList
        //Method

        //void add(int index, Object element)
        //Được sử dụng để chèn phần tử element tại vị trí index vào danh sách
        numbers.add(0, 10);


        //addAll
        ArrayList<Integer> numbers1 = new ArrayList<>(List.of(100,200, 300));
        numbers.addAll(numbers1);
        System.out.println(numbers);

        //.contains(object) kiểm tra giá trị có tồn tại trong arraylist hay ko
        //trả v true, fasle
        System.out.println(numbers.contains(100));

        //.get(index ) lấy phần tử ở vị trí index bất kì
        System.out.println(numbers.get(0));


        //5. Loop in ArrayList
        //duyệt phần tử
        //Cách 1 và 2 thường sử dụng

        // 1. Sử dụng for binh thường
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        // 2. Sử dụng forEach
        for (int number: numbers) {
            System.out.println(number);
        }

        // 3. Sử dụng Iterator
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 4. Sử dụng ListIterator
        ListIterator<Integer> listIterator = numbers.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        //6 Sự khác nhau giữa Array và ArrayList
//        Array	                                                                   ArrayList
//        Kích thước cố định	                                            Kích thước có thể thay đổi được
//        Có thể lưu trữ dữ liệu kiểu nguyên thủy và đối tượng	     Chỉ có thể lưu trữ dữ liệu kiểu đối tượng
//        Tốc độ lưu trữ và thao tác nhanh hơn	                         Tốc độ lưu trữ vào thao tác chậm hơn
//        Chỉ có thuộc tính length	                                  Có nhiều phương thức để thao tác với dữ liệu

    }
}
