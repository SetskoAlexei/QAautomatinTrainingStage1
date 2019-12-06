package exceptions.list;

public class Student extends Group {
    private int studentID;
    private String surname;
    private String name;
    private AcademicSubject academicSubject;
    private int mark;


    public Student( int studentID, String surname, String name,String faculty, int group, AcademicSubject academicSubject, int mark) {
        super (faculty, group);
        this.studentID = studentID;
        this.surname = surname;
        this.name = name;
        this.academicSubject = academicSubject;
        this.mark = mark;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AcademicSubject getAcademicSubject() {
        return academicSubject;
    }

    public void setAcademicSubject(AcademicSubject academicSubject) {
        this.academicSubject = academicSubject;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }
}