public class StringDemo {
    public static void main(String[] args) {
        //Khai báo theo kiểu String literal
        String name = "Xuân Anh";
        String name1 = "Xuân Anh";

        //khai bảo kiểu Object new
        String name2 = new String("Xuân Anh");
        String name3 = new String("Xuân Anh");

        System.out.println("name: " + name);
        System.out.println("name: " + name2);

        // so sánh chuỗi
        // == so sánh về mt địa chỉ ô nhớ (thường được áp dụng với primative type)
        System.out.println(name == name1); //true
        System.out.println(name == name3); //false
        System.out.println(name2 == name3); //false vì new String tạo ra bộ nhớ mới riêng biệt.

        // Phương thức String
        String text = "xin chào các bạn";
        String text2 = "xin chào các bạn";
        String text3 = "xin Chào các bạn";
        System.out.println("In hoa  :" + text.toUpperCase());
        System.out.println("In thường : " + text.toLowerCase());
        System.out.println("độ dài : " + text.length());
        System.out.println("cắt chuỗi : " + text.substring(0, 8));
        System.out.println("vị trí 10 là ký tự : " + text.charAt(9));
        System.out.println("so sánh : " + text.equals(text2));
        System.out.println("so sánh ko phần việt hoa thường : " + text.equalsIgnoreCase(text3));


    }
}
