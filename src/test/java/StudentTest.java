import org.junit.*;
import org.junit.Assert.*;

public class StudentTest {
    Student test_student;

    @Before
    public void setUp() throws Exception {
        CourseProgramme engineering = new CourseProgramme("Engineering");
        test_student = new Student("Adrian Forde", 21, "02/04/1998", 16415792, engineering);

    }

    @Test
    public void getUsername() {
        // user name should be a concatenation of name and age
        String test_username = "AdrianForde_21";
        //System.out.println(test_student.getUsername());
        Assert.assertEquals(test_username, test_student.getUsername());
    }

    @Test
    public void getName() {

    }

    @Test
    public void setName() {
    }

    @Test
    public void getAge() {
    }

    @Test
    public void setAge() {
    }

    @Test
    public void getDate_of_birth() {
    }

    @Test
    public void setDate_of_birth() {
    }

    @Test
    public void getId() {
    }

    @Test
    public void setId() {
    }

    @Test
    public void getCourse() {
    }

    @Test
    public void setCourse() {
    }

    @Test
    public void getModules() {
    }

    @Test
    public void setModules() {
    }
}