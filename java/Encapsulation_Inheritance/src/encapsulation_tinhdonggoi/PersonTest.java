package encapsulation_tinhdonggoi;

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person();
        person.setId(2);
        person.setName("Xuân Anh");
        person.setAge(25);
        person.setEmail("Anh@gmail.com");

        System.out.println(person);
    }
}
