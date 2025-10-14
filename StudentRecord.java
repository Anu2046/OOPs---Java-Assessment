class Student {
    private String name;
    private int marks;

    void setDetails(String n, int m) {
        name = n;
        if (m >= 0 && m <= 100)
            marks = m;
        else {
            System.out.println("Invalid marks entered! Setting to 0.");
            marks = 0;
        }
    }

    void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Marks Scored: " + marks);
    }
}

public class StudentRecord {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setDetails("Anu", 95);
        s1.display();

        System.out.println();
        Student s2 = new Student();
        s2.setDetails("Ravi", 150); // invalid marks
        s2.display();
    }
}
