import org.joda.time.DateTime;

public class Student {

    String name;
    int age;
    DateTime date;
    String date_of_birth; //Will use data type for this
    int id;
    String username;
    CourseProgramme course;
    Module[] modules;

    public String getUsername(){
        //method to generate students username combining their name and age
        return name + "_" + Integer.toString(age);
    }

    public Student(String name, int age, String date_of_birth, int id, CourseProgramme course) {
        this.name = name;
        this.age = age;
        this.date_of_birth = date_of_birth;
        this.id = id;
        this.course = course;
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

    public String getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(String date_of_birth) {
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
