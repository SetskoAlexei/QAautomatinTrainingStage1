package classes;

//        Создать классы, спецификации которых приведены ниже. Определить конструкторы и методы setТип(), getТип(), toString().
//        Определить дополнительно методы в классе, создающем массив объектов. Задать критерий выбора данных и вывести эти
//        данные на консоль. В каждом классе, обладающем информацией, должно быть объявлено несколько конструкторов.
//        1. Student: id, Фамилия, Имя, Отчество, Дата рождения, Адрес, Телефон,
//        Факультет, Курс, Группа.
//        Создать массив объектов. Вывести:
//        a) список студентов заданного факультета;
//        b) списки студентов для каждого факультета и курса;
//        c) список студентов, родившихся после заданного года;
//        d) список учебной группы.

class Student{
    private int id;
    private String surName;
    private String name;
    private String patronymic;
    private int birthdayDateYear;
    private int birthdayMonth;
    private int birthdayDay;
    private String adress;
    private String phoneNumber;
    private String faculty;
    private int courseNumber;
    private int groupNumber;

    public Student(int id, String surName, String name, String patronymic, int birthdayDateYear, int birthdayMonth, int birthdayDay, String adress, String phoneNumber, String faculty, int courseNumber, int groupNumber) {
        this.id = id;
        this.surName = surName;
        this.name = name;
        this.patronymic = patronymic;
        this.birthdayDateYear = birthdayDateYear;
        this.birthdayMonth = birthdayMonth;
        this.birthdayDay = birthdayDay;
        this.adress = adress;
        this.phoneNumber = phoneNumber;
        this.faculty = faculty;
        this.courseNumber = courseNumber;
        this.groupNumber = groupNumber;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public int getBirthdayDateYear() {
        return birthdayDateYear;
    }

    public void setBirthdayDateYear(int birthdayDateYear) {
        this.birthdayDateYear = birthdayDateYear;
    }

    public int getBirthdayMonth() {
        return birthdayMonth;
    }

    public void setBirthdayMonth(int birthdayMonth) {
        this.birthdayMonth = birthdayMonth;
    }

    public int getBirthdayDay() {
        return birthdayDay;
    }

    public void setBirthdayDay(int birthdayDay) {
        this.birthdayDay = birthdayDay;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }
    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(int courseNumber) {
        this.courseNumber = courseNumber;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }



    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer ("Student{");
        sb.append ("id=").append (id);
        sb.append (", surName='").append (surName).append ('\'');
        sb.append (", name='").append (name).append ('\'');
        sb.append (", patronymic='").append (patronymic).append ('\'');
        sb.append (", birthdayDateYear=").append (birthdayDateYear);
        sb.append (", birthdayMonth=").append (birthdayMonth);
        sb.append (", birthdayDay=").append (birthdayDay);
        sb.append (", adress='").append (adress).append ('\'');
        sb.append (", phoneNumber='").append (phoneNumber).append ('\'');
        sb.append (", faculty='").append (faculty).append ('\'');
        sb.append (", courseNumber=").append (courseNumber);
        sb.append (", groupNumber=").append (groupNumber);
        sb.append ('}');
        return sb.toString ();
    }
}
class BNTU {
    public static void main(String[] args) {
        Student[] student = addStudent ();
        System.out.println ("Students from faculty");
        ChooseFaculty (student);
        System.out.println ("Student born after");
        BornAfter (student);
        System.out.println ("Students from group");
        ListOfGroup (student);
        System.out.println ("Students from faculty and course");
        ChooseFacultyAndCourse (student);
    }
    private static void ChooseFaculty(Student[] students){
        System.out.println ("ЭФ");
        for (Student student : students) {
            if (student != null) {
                if (student.getFaculty ().equalsIgnoreCase ("ЭФ"))
                System.out.println (student);
            }
        }
        System.out.println ("МФ");
        for (Student student : students) {
            if (student != null)
            {
                if (student.getFaculty ().equalsIgnoreCase ("МФ"))
                System.out.println (student);
            }
        }
        System.out.println ("ИНФ");
        for (Student student : students) {
            if (student != null) {
                if (student.getFaculty ().equalsIgnoreCase ("ИНФ"))
                System.out.println (student);
            }
        }

            }
            private static void BornAfter(Student[] students){
                System.out.println ("после 1990");
                for (Student student : students) {
                    if (student != null) {
                        if (student.getBirthdayDateYear () > 1990)
                            System.out.println (student);
                    }
                }
            }
            private static void ListOfGroup(Student[] students){
                System.out.println ("список группы");
                for (Student student : students){
                    if (student != null){
                        if (student.getGroupNumber () == 306031)
                            System.out.println (student);
                    }
                }
            }
    private static void ChooseFacultyAndCourse(Student[] students) {
        System.out.println ("ЭФ курс 4");
        for (Student student : students) {
            if (student != null) ;
            {
                if (student.getFaculty ().equalsIgnoreCase ("ЭФ"))
                if (student.getCourseNumber () == 4)
                System.out.println (student);
            }
        }
    }
    private static Student[] addStudent() {
        Student[] student = new Student[4];
        student[0] = new Student (1, "Мирнов", "Дмитрий", "Васильевич", 1990, 10, 8, "Борисов", "+375-25-894-78-67", "ЭФ", 4, 304032);
        student[1] = new Student (2, "Бонд", "Екатерина", "Петровна", 1991, 11, 12, "Минск", "+375-25-734-46-56", "МФ", 2, 306021);
        student[2] = new Student (3, "Вагина", "Анна", "Алексеевич", 1990, 9, 8, "Орша", "+375-25-745-78-56", "ИНФ", 4, 306031);
        student[3] = new Student (4, "Лоев", "Пётр", "Петрович", 1990, 7, 2, "Гродно", "+375-25-890-78-58", "ЭФ", 3, 306043);

        return student;
    }
}