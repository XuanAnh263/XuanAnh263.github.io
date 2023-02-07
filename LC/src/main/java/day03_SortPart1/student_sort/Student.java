package day03_SortPart1.student_sort;

public class Student {
    public String fullName;
    public int age;
    public int GPA;

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public int getGPA() {
        return GPA;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGPA(int GPA) {
        this.GPA = GPA;
    }

    public Student(String fullName, int age, int GPA) {
        this.fullName = fullName;
        this.age = age;
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fullName='" + fullName + '\'' + "\t" +
                ", age= " + age +
                ", \t GPA= " + GPA +
                '}';
    }
}
