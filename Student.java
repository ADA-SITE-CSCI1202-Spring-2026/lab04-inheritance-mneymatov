package week06;

public class Student extends Person {

    private String studentId;

    public Student(String firstName, String lastName, String gender, String studentId) {
        super(firstName, lastName, gender);
        this.studentId = studentId;
    }

    public Student() {
        super();
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return super.toString() +
               ", Student[studentId=" + studentId + "]";
    }

    public boolean equals(Student s) {
        if (s == null) {
            return false;
        }

        return super.equals(s) &&
               this.studentId.equals(s.studentId);
    }
}
