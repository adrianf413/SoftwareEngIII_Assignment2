public class Student {

    String name;
    int age;
    String date_of_birth; //Will use data type for this
    int id;
    String username;
    CourseProgramme course;
    Module[] modules;

    public String getUsername(){
        //method to generate students username combining their name and age
        return name + "_" + Integer.toString(age);
    }


}
