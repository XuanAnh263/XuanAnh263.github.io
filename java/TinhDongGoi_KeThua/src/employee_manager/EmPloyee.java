package employee_manager;

public class EmPloyee {
    private int id;
    private String name;
    private int age;
    private String phone;
    private String email;
    private int salaryBasic;

    public EmPloyee() {
    }

    public EmPloyee(int id, String name, int age, String phone, String email, int salaryBasic) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.email = email;
        this.salaryBasic = salaryBasic;
    }

    @Override
    public String toString() {
        return "EmPloyee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", salaryBasic=" + salaryBasic +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getSalaryBasic() {
        return salaryBasic;
    }

    public void setSalaryBasic(int salaryBasic) {
        this.salaryBasic = salaryBasic;
    }
}
