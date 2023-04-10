public class Course {
    Teacher teacher;
    String name;
    String code;
    int note;


    Course (String name, String code, String prefix, Teacher teacher) {
        this.name = name;
        this.code = code;
        this.teacher = teacher;
        this.note = 0;

    }

    public void addTeacher(Teacher teacher) {

    }
}


