public class Module {

    String name;
    int id;
    Student[] enrolled_students;
    CourseProgramme[] associated_courses;

    public Module(String name){
        this.name = name;
    }

    public Module(String name, int id){
        this.name = name;
        this.id = id;
    }
    public Module(String name, int id, Student[] enrolled_students, CourseProgramme[] associated_courses) {
        this.name = name;
        this.id = id;
        this.enrolled_students = enrolled_students;
        this.associated_courses = associated_courses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Student[] getEnrolled_students() {
        return enrolled_students;
    }

    public void setEnrolled_students(Student[] enrolled_students) {
        this.enrolled_students = enrolled_students;
    }

    public CourseProgramme[] getAssociated_courses() {
        return associated_courses;
    }

    public void setAssociated_courses(CourseProgramme[] associated_courses) {
        this.associated_courses = associated_courses;
    }
}
