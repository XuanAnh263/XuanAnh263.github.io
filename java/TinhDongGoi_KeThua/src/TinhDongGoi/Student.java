package TinhDongGoi;

public class Student {
    private String id;
    private double avgPoint;
    private int age;
    private String classMate;

    public Student() {
    }

    public Student(String id, double avgPoint, int age, String classMate) {
        setId(id);
        setAvgPoint(avgPoint);
        setAge(age);
        setClassMate(classMate);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (id.length() != 8) {
            System.out.println("Mã sinh viên phải bằng 8 ký tự");
            return;
        }
        this.id = id;
    }

    public double getAvgPoint() {
        return avgPoint;
    }

    public void setAvgPoint(double avgPoint) {
        if (avgPoint <= 0.0 && avgPoint >= 10.0) {
            System.out.println("Điểm trung bình phải từ 0 đến 10");
            return;
        }
        this.avgPoint = avgPoint;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <18) {
            System.out.println("Tuổi không được < 18");
            return;
        }
        this.age = age;
    }

    public String getClassMate() {
        return classMate;
    }

    public void setClassMate(String classMate) {
        if (!classMate.startsWith("A") && !classMate.startsWith("C") ) {
            System.out.println("Lớp phải bắt đầu bằng \"A\" và \"C\" ");
            return;
        }
        this.classMate = classMate;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", avgPoint=" + avgPoint +
                ", age=" + age +
                ", classMate='" + classMate + '\'' +
                '}';
    }

    public void showInfo() {
        System.out.println(this);
        //this sẽ tham chiếu đến đối tượng hiện tại. trong trường hợp này chính là Student
    }

//    public boolean calculateScholarship() {
//
//        return avgPoint >= 8;
//    }
    public void calculateScholarship() {
        if (avgPoint >= 8) {
            System.out.println("Nhận được học bổng");
        } else {
            System.out.println("không nhân được học bổng");
        }
    }


}
