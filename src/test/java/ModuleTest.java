import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ModuleTest {
    Module test_module;

    @Before
    public void setUp() throws Exception {
        //Need to create arbitrary arrays of module and course program objects
        Student[] students = new Student[5];
        for(int i = 0; i < 5; i++){
            students[i] = new Student("Adrian Forde");
        }
        CourseProgramme[] courses = new CourseProgramme[5];

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
    }

    @Test
    public void setEnrolled_students() {
    }

    @Test
    public void getAssociated_courses() {
    }

    @Test
    public void setAssociated_courses() {
    }
}