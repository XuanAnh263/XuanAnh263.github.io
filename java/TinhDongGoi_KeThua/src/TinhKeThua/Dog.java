package TinhKeThua;

public class Dog extends Animal {
    //những thuộc tính và phương thức của super class Animal thì không cần khởi tạo trong class Dog
    // vì nó có extend(tính kế thừa)
    private String color;
    private int legs; //legs: chân

    public Dog() {

    }

    public Dog(String name, String color, int legs) {
        super(name);
        this.color = color;
        this.legs = legs;
    }

    // Định nghĩa phương thức của lớp con
    public void display() {
        System.out.println("My name is " + this.getName());
    }

    //ghi đè, viết lại logic
    @Override
    public void eat() {
        System.out.println("Chó ăn thịt");
    }


    //get & set
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }
}
