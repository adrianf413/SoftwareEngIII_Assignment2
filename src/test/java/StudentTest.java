import org.joda.time.LocalDate;
import org.junit.*;

public class StudentTest {
    Student test_student;
    Module[] modules = new Module[3];

    @Before
    public void setUp() throws Exception {
        CourseProgramme engineering = new CourseProgramme("Engineering");

        for(int i = 0;i < 3;i++){
            modules[i] = new Module("Arbitrary Name");
        }
        LocalDate date = new LocalDate(1998, 4, 2);
        test_student = new Student("Adrian Forde", 21, date, 12345678, engineering, modules);
    }

    @Test
    public void getUsername() {
        // user name should be a concatenation of name and age
        String test_username = "AdrianForde_21";
        //System.out.println(test_student.getUsername());
        Assert.assertEquals(test_username, test_student.getUsername());

        Student test_student_new =  new Student("Steve McQueen");
        test_student_new.setAge(30);
        String test_username_new = "SteveMcQueen_30";
        Assert.assertEquals(test_username_new, test_student_new.getUsername());
    }

    @Test
    public void getName() {
        //test_student initialised with name Adrian Forde
        Assert.assertEquals( "Adrian Forde", test_student.getName());

        //set new name and check getter again
        test_student.setName("Steve McQueen");
        Assert.assertEquals( "Steve McQueen", test_student.getName());
    }

    @Test
    public void setName() {
        test_student.setName("Danny Devito");
        Assert.assertEquals( "Danny Devito", test_student.getName());

        test_student.setName("Sam Boyle");
        Assert.assertEquals( "Sam Boyle", test_student.getName());

        test_student.setName("Seth McFarlane");
        Assert.assertEquals("Seth McFarlane", test_student.getName());
    }

    @Test
    public void getAge() {
        //test student initialised to 21
        Assert.assertEquals( 21, test_student.getAge());

        // set new age and check again
        test_student.setAge(22);
        Assert.assertEquals( 22, test_student.getAge());
    }

    @Test
    public void setAge() {
        // test student was initialised to 21
        Assert.assertEquals( 21, test_student.getAge());

        // set new age and check again
        test_student.setAge(22);
        Assert.assertEquals( 22, test_student.getAge());
    }

    @Test
    public void getDate_of_birth() {
        // test student was initialised to dob of 2/4/1998
        LocalDate test_date = new LocalDate(1998, 4, 2);
        Assert.assertEquals(test_date, test_student.getDate_of_birth());

        // change the date and check again
        test_date = new LocalDate(1999, 8, 14);
        test_student.setDate_of_birth(test_date);
        Assert.assertEquals(test_date, test_student.getDate_of_birth());
    }

    @Test
    public void setDate_of_birth() {
        // test student was initialised to dob of 2/4/1998
        LocalDate test_date = new LocalDate(1998, 4, 2);
        Assert.assertEquals(test_date, test_student.getDate_of_birth());

        // change the date and check again
        test_date = new LocalDate(1999, 8, 14);
        test_student.setDate_of_birth(test_date);
        Assert.assertEquals(test_date, test_student.getDate_of_birth());
    }

    @Test
    public void getId() {
        // test student initialised to 12345678
        Assert.assertEquals(12345678, test_student.getId());

        test_student.setId(11111111);
        Assert.assertEquals(11111111, test_student.getId());
    }

    @Test
    public void setId() {
        // test student initialised to 12345678
        Assert.assertEquals(12345678, test_student.getId());

        test_student.setId(22222222);
        Assert.assertEquals(22222222, test_student.getId());
    }

    @Test
    public void getCourse() {
        // test student initialised to Engineering
        CourseProgramme test_course = new CourseProgramme("Engineering");
        Assert.assertEquals(test_course.getName(), test_student.getCourse().getName());
    }

    @Test
    public void setCourse() {
        // test student initialised to Engineering
        CourseProgramme test_course = new CourseProgramme("Engineering");
        Assert.assertEquals(test_course.getName(), test_student.getCourse().getName());

        // test student initialised to Engineering
        CourseProgramme new_course = new CourseProgramme("Science");
        test_student.setCourse(new_course);
        Assert.assertEquals(new_course.getName(), test_student.getCourse().getName());
    }

    @Test
    public void getModules() {
        // should return an array of the enrolled students
        // test module was initialised with the list of students outlined above

        Assert.assertEquals(modules, test_student.getModules());
    }

    @Test
    public void setModules() {
        // should update the array of enrolled students
        // Need to create a new list of modules
        Module[] modules_new = new Module[5];
        for(int i = 0; i < 5; i++){
            modules_new[i] = new Module("Arbitrary Name");
        }
        test_student.setModules(modules_new);
        // Checking that the set method successfully updated
        Assert.assertEquals(modules_new, test_student.getModules());
    }
}