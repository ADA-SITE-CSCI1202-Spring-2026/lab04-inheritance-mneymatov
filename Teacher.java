package week06;

public class Teacher extends Person {

    private String department;
    private String[] courses;

    public Teacher(String firstName, String lastName, String gender,
                   String department, String[] courses) {
        super(firstName, lastName, gender);
        this.department = department;
        this.courses = courses;
    }

    public Teacher() {
        super();
    }

    public String getDepartment() {
        return department;
    }

    public String[] getCourses() {
        return courses;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        String courseList = "";
        if (courses != null) {
            for (String course : courses) {
                courseList += course + " ";
            }
        }

        return super.toString() +
               ", Teacher[department=" + department +
               ", courses=" + courseList.trim() + "]";
    }

    public boolean equals(Teacher t) {
        if (t == null) {
            return false;
        }

        if (!super.equals(t)) {
            return false;
        }

        if (!this.department.equals(t.department)) {
            return false;
        }

        if (this.courses == null && t.courses == null) {
            return true;
        }

        if (this.courses == null || t.courses == null) {
            return false;
        }

        if (this.courses.length != t.courses.length) {
            return false;
        }

        for (int i = 0; i < courses.length; i++) {
            if (!this.courses[i].equals(t.courses[i])) {
                return false;
            }
        }

        return true;
    }
}