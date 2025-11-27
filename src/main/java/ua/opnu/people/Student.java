package ua.opnu.people;

public class Student extends Person {
    private String group;
    private String studentId;

    public Student(String surname, String name, int age, String group, String studentId) {
        super(surname, name, age);
        this.group = group == null ? "" : group.trim();
        this.studentId = studentId == null ? "" : studentId.trim();
    }

    public String getGroup() { return group; }
    public String getStudentId() { return studentId; }

    public void setGroup(String group) { this.group = group == null ? "" : group.trim(); }
    public void setStudentId(String studentId) { this.studentId = studentId == null ? "" : studentId.trim(); }

    @Override
    public String toString() {
        return "Студент групи " + group + ", " + getSurname() + " " + getName()
               + ", вік: " + getAge() + ". Номер студентського квитка: " + studentId;
    }
}
