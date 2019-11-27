import org.joda.time.LocalDate;

public class Student {

    String name;
    int age;
    LocalDate date_of_birth;
    int id;
    String username;
    CourseProgramme course;
    Module[] modules;

    public Student(String name){
        this.name = name;
    }

    public Student(String name, int age, LocalDate date_of_birth, int id, CourseProgramme course, Module[] modules) {
        this.name = name;
        this.age = age;
        this.date_of_birth = date_of_birth;
        this.id = id;
        this.course = course;
        this.modules = modules;
    }

    public String getUsername(){
        //method to generate students username combining their name and age and removing whitespace
        return getName().replaceAll("\\s+","") + "_" + Integer.toString(getAge());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(LocalDate date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public CourseProgramme getCourse() {
        return course;
    }

    public void setCourse(CourseProgramme course) {
        this.course = course;
    }

    public Module[] getModules() {
        return modules;
    }

    public void setModules(Module[] modules) {
        this.modules = modules;
    }
}
