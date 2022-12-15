package employee_manager;

public class Tester extends Employee {
    private int error;

    public Tester() {
    }

    public Tester(int id, String name, int age, String phone, String email, int salaryBasic, int error) {
        super(id, name, age, phone, email, salaryBasic);
        this.error = error;
    }

    public int salaryError() {
        return getSalaryBasic() + getError() * 50000;
    }

    public void display() {
        System.out.println("ID : " + this.getId());
        System.out.println("NAME : " + this.getName());
        System.out.println("AGE : " + this.getAge());
        System.out.println("PHONE : " + this.getPhone());
        System.out.println("Email : " + this.getEmail());
        System.out.println("SALARY BASIC : " + this.getSalaryBasic());
        System.out.println("SALARY : " + salaryError());
    }



    public int getError() {
        return error;
    }

    public void setError(int error) {
        this.error = error;
    }

    @Override
    public String toString() {
        return "Tester{" +
                "id=" + super.getId()+
                ", name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                ", phone='" + super.getPhone() + '\'' +
                ", email='" + super.getEmail() + '\'' +
                ", salaryBasic=" + super.getSalaryBasic() +
                "error=" + error +
                "} " + super.toString();
    }
}
