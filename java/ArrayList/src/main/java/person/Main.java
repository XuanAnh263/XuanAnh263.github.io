package person;

import com.github.javafaker.Faker;

public class Main {
    public static void main(String[] args) {
        //Cách 1: sử dụng constructor
        Person person = new Person(1, "anh", "anh@gmail.com");
        System.out.println(person);

        //Cách 2: sử dụng builder
        //cách tạo ra đối tượng, nhưng không quan trọng thứ tự truyền dữ liệu
        Person person1 = Person.builder() //tạo đối tượng
                .email("anh@hduhd")
                .id(2)
                .build();
        System.out.println(person1);


        //sử dụng java faker: để fake dữ liệu
        //tạo ra nhiều đối tượng person
        Faker faker = new Faker();

        Person[] people = new Person[20];
        for (int i = 0; i < people.length; i++) {
            people[i] = new Person(i + 1, faker.name().fullName(), faker.internet().emailAddress());
        }

        for (Person p : people) {
            System.out.println(p);
        }



    }
}
