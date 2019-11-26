import org.joda.time.LocalDate;

public class CourseProgramme {

    String name;
    Module[] modules;
    Student[] enrolled_students;
    LocalDate course_start_date;
    LocalDate course_end_date;

    public CourseProgramme() {

    }

    public CourseProgramme(String name) {
        this.name = name;
    }

    public CourseProgramme(String name, Module[] modules, Student[] enrolled_students, LocalDate course_start_date, LocalDate course_end_date) {
        this.name = name;
        this.modules = modules;
        this.enrolled_students = enrolled_students;
        this.course_start_date = course_start_date;
        this.course_end_date = course_end_date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Module[] getModules() {
        return modules;
    }

    public void setModules(Module[] modules) {
        this.modules = modules;
    }

    public Student[] getEnrolled_students() {
        return enrolled_students;
    }

    public void setEnrolled_students(Student[] enrolled_students) {
        this.enrolled_students = enrolled_students;
    }

    public LocalDate getCourse_start_date() {
        return course_start_date;
    }

    public void setCourse_start_date(LocalDate course_start_date) {
        this.course_start_date = course_start_date;
    }

    public LocalDate getCourse_end_date() {
        return course_end_date;
    }

    public void setCourse_end_date(LocalDate course_end_date) {
        this.course_end_date = course_end_date;
    }
}
