package TinhKeThua;

public class DogTest {
    public static void main(String[] args) {
        Dog dog = new Dog("Husky", "white", 4);
        dog.eat();
        dog.display();

        Dog dog1 = new Dog();
        dog1.setName("Pitbull");
        dog1.setColor("Black");
        dog1.setLegs(4);
        dog1.eat();//khi gọi tới phương thức thì sẽ ưu tiên gọi ở class dog (lớp con) trước
        // (hoặc ưu tiên override), rồi mới tìm ở ngoài class cha
        dog1.display();
    }
}
