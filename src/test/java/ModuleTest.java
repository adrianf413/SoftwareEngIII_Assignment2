import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ModuleTest {
    Module test_module;
    Student[] students = new Student[5];
    CourseProgramme[] courses = new CourseProgramme[5];

    @Before
    public void setUp() throws Exception {
        //Need to create arbitrary arrays of module and course program objects
        for(int i = 0; i < 5; i++){
            students[i] = new Student("Adrian Forde");
        }

        for(int j =0; j < 5; j++){
            courses[j] = new CourseProgramme("Engineering");
        }
        test_module = new Module("Programming", 8989, students, courses);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getName() {
        //test_student initialised with name Programming
        Assert.assertEquals( "Programming", test_module.getName());

        //set new name and check again
        test_module.setName("Maths");
        Assert.assertEquals( "Maths", test_module.getName());
    }

    @Test
    public void setName() {
        //test_student initialised with name Programming
        Assert.assertEquals( "Programming", test_module.getName());

        //set new name and check again
        test_module.setName("Maths");
        Assert.assertEquals( "Maths", test_module.getName());
    }

    @Test
    public void getId() {
        //test_student initialised with id: 8989
        Assert.assertEquals( 8989, test_module.getId());

        //set new name and check again
        test_module.setId(9090);
        Assert.assertEquals( 9090, test_module.getId());

    }

    @Test
    public void setId() {
        //test_student initialised with id: 8989
        Assert.assertEquals( 8989, test_module.getId());

        //set new name and check again
        test_module.setId(9090);
        Assert.assertEquals( 9090, test_module.getId());
    }

    @Test
    public void getEnrolled_students() {
        // should return an array of the enrolled students
        // test module was initialised with the list of students outlined above

        Assert.assertEquals(students, test_module.getEnrolled_students());
    }

    @Test
    public void setEnrolled_students() {
        // should update the array of enrolled students
        // Need to create a new list of students
        Student[] students_new = new Student[5];
        for(int i = 0; i < 5; i++){
            students_new[i] = new Student("Arbitrary Name");
        }
        test_module.setEnrolled_students(students_new);
        // Checking that the set method successfully updated
        Assert.assertEquals(students_new, test_module.getEnrolled_students());
    }

    @Test
    public void getAssociated_courses() {
        // should return an array of the associated courses
        // test module was initialised with the list of courses outlined above

        Assert.assertEquals(courses, test_module.getAssociated_courses());
    }

    @Test
    public void setAssociated_courses() {
        // should update the array of associated courses
        // Need to create a new list of courses
        CourseProgramme[] courses_new = new CourseProgramme[5];
        for(int j =0; j < 5; j++){
            courses_new[j] = new CourseProgramme("Science");
        }
        test_module.setAssociated_courses(courses_new);
        // Checking that the set method successfully updated
        Assert.assertEquals(courses_new, test_module.getAssociated_courses());
    }
}