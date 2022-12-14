package employee_manager;

public class Tester extends EmPloyee {
    private int error;

    public Tester() {

    }

    public Tester(int id, String name, int age, String phone, String email, int salaryBasic, int error) {
        super(id, name, age, phone, email, salaryBasic);
        this.error = error;
    }

    public void display() {

    }

    public int getError() {
        return error;
    }

    public void setError(int error) {
        this.error = error;
    }
}
