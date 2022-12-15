package employee_manager;

public class Developer extends Employee {
    private int overtimeHours;

    public Developer() {
    }

    public Developer(int id, String name, int age, String phone, String email, int salaryBasic, int overtimeHours) {
        super(id, name, age, phone, email, salaryBasic);
        this.overtimeHours = overtimeHours;
    }

    public int salaryHours() {
        return getSalaryBasic() + getOvertimeHours() *  200000;
    }

    public void display() {
        System.out.println("ID : " + this.getId());
        System.out.println("NAME : " + this.getName());
        System.out.println("AGE : " + this.getAge());
        System.out.println("PHONE : " + this.getPhone());
        System.out.println("Email : " + this.getEmail());
        System.out.println("SALARY BASIC : " + this.getSalaryBasic());
        System.out.println("SALARY : " + salaryHours());
    }

    public int getOvertimeHours() {
        return overtimeHours;
    }

    public void setOvertimeHours(int overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "id=" + super.getId()+
                ", name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                ", phone='" + super.getPhone() + '\'' +
                ", email='" + super.getEmail() + '\'' +
                ", salaryBasic=" + super.getSalaryBasic() +
                "overtimeHours=" + overtimeHours +
                '}';
    }
}
