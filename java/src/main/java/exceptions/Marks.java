package exceptions;

import exceptions.list.AcademicSubject;
import exceptions.list.Student;

import java.util.List;


class Marks {
    private List<Student> students;
    private float averageMark;


    Marks(List<Student> students) {
        this.students = students;
    }

    float getAverageMarkStudent() throws StudentException {
        float multyMarks = 0;
        int count = 0;
        for (Student student : students) {
            if (student.getStudentID () == 1) {
                if (student.getGroup () == 0 || student.getFaculty () == null || student.getAcademicSubject () == null){
                    throw new StudentException ();
                }
                    if (student.getMark () > 10 || student.getMark () < 0) {
                        throw new IllegalArgumentException ("illegalMark");
                    }
                multyMarks += student.getMark ();
                count++;
            }
            averageMark = multyMarks / count;

        }
        return averageMark ;
    }

    float getAverageMarkMathUniversity() throws StudentException {
        float multyMarks = 0;
        int count = 0;
        for (Student student : students) {
            if (student.getGroup () == 0 || student.getFaculty () == null || student.getAcademicSubject () == null){
                throw new StudentException ();
            }
            if (student.getMark () > 10 || student.getMark () < 0) {
                throw new IllegalArgumentException ("illegalMark");
            }
            if (student.getAcademicSubject () == AcademicSubject.MATH) {
                multyMarks += student.getMark ();
                count++;
            }
            averageMark = multyMarks / count;
        }
        return averageMark;
    }

    float getAverageMarkPhysicEF306041() throws StudentException {
        float multyMarks = 0;
        int count = 0;
        for (Student student : students) {
            if (student.getGroup () == 0 || student.getFaculty () == null || student.getAcademicSubject () == null){
                throw new StudentException ();
            }
            if (student.getMark () > 10 || student.getMark () < 0) {
                throw new IllegalArgumentException ("illegalMark");
            }
            if (student.getFaculty ().equals ("EF") && student.getGroup () == 306041 && student.getAcademicSubject () == AcademicSubject.PHYSICS) {
                multyMarks += student.getMark ();
                count++;
            }
            averageMark = multyMarks / count;
        }
        return averageMark;
    }
}

