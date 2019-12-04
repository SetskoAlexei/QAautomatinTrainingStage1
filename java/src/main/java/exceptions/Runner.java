package exceptions;



import exceptions.list.AcademicSubject;
import exceptions.list.Student;

import java.util.Arrays;
import java.util.List;
//  В университете есть несколько факультетов, в которых учатся студенты, объединенные в группы.
//   У каждого студента есть несколько учебных предметов по которым он получает оценки.
//   Необходимо реализовать иерархию студентов, групп и факультетов.
public class Runner  {
    static List<Student> students = Arrays.asList (
            new Student (1,"Иванов", "Пётр","EF", 306041 , AcademicSubject.MATH, 8),
            new Student (1, "Иванов", "Пётр","EF", 306041, AcademicSubject.PHYSICS, 5),
            new Student (2, "Сидоров", "Сергей", "MF", 304041, AcademicSubject.MATH, 7),
            new Student (2, "Сидоров", "Сергей", "MF", 304041, AcademicSubject.ENGLISH, 8),
            new Student (3, "Соколова", "Елена", "EF", 303043, AcademicSubject.ENGLISH, 9),
            new Student (3, "Соколова", "Елена","PTF", 303043, AcademicSubject.PHYSICS, 4),
            new Student (4, "Васичкин", "Фёдор", "EF", 306041,  AcademicSubject.MATH, 7),
            new Student (5, "Пупкин", "Василий","PTF", 303043,  AcademicSubject.PHYSICS, 5)
    );
    public static void main(String[] args){

//        Посчитать средний балл по всем предметам студента
//        Посчитать средний балл по конкретному предмету в конкретной группе и на конкретном факультете
//        Посчитать средний балл по предмету для всего университета
        Marks marks = new Marks (students);
        float averageMark = 0;
        float averageMarkUniver = 0;
        float averageMarkPhysicEF306041 = 0;
        try {
            averageMark = marks.getAverageMarkStudent ();
            averageMarkUniver = marks.getAverageMarkMathUniversity ();
            averageMarkPhysicEF306041 = marks.getAverageMarkPhysicEF306041 ();
        } catch (StudentException e) {
            e.printStackTrace ();
        }
        System.out.println ("Средний балл по всем предметам студента: " + averageMark);
        System.out.println ("Средний балл по математике для всего университета: " + averageMarkUniver);
        System.out.println ("средний балл по физике в группе 306041, факультете ЭФ: " + averageMarkPhysicEF306041);
    }
}
