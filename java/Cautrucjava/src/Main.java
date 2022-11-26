public class Main {

    //phạm vi global: khai báo bên ngoài method
    // phạm vi menthod
    // phạm vi block: khai báo bên trong {}

    public static void main(String[] args) {

        // khai báo biến
        String firstName;
        String lastName;
        String email = "kttcnh97@gmail.com";

        // gán giá trị cho biến
        firstName = "xuan";
        lastName = "anh";
        String fullName = firstName + " " + lastName;
        int age = 25;
        String address = "Thái Bình";

        System.out.println("firstName = " + firstName ) ;
        System.out.println("lastName = " + lastName);
        System.out.println("fullName = " + fullName);
        System.out.println("Xin chào, tôi là " + fullName + " " + "năm này tôi " + age + " " + "quê tôi ở " + address );


        //khai báo các kiểu dữ liệu
        long salary = 1_000_000_000L;
        double height = 1.7;
        float weight = 60.5f;
        System.out.println(salary);

        // kiểu boolean
        boolean isExist = true;
        boolean isMarry = false;

        // kiểu char
        char character = 'A';
        char character2 = 97; //tra bảng mã ASCII

        System.out.println(character);
        System.out.println(character2);


        //Ép kiểu

        //Ép kiểu ngầm định (nhỏ ==> lớn)
        int number = 10 ;
        long numberOne = number;


        //Ép kiểu tường mình (lớn ==> nhỏ)
        short numberTwo = (short) number;


        //phạm vi block
        {
            String blockVar = "block";
            System.out.println(blockVar);
        }
    }

}