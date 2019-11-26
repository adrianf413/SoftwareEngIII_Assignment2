import org.joda.time.LocalDate;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CourseProgrammeTest {

    CourseProgramme test_course;

    @Before
    public void setUp() throws Exception {
        //Set up a Course Program object for testing purposes
        //String name, Module[] modules, Student[] enrolled_students, LocalDate course_start_date, LocalDate course_end_date
        Module[] modules = new Module[5];
        Student[] students = new Student[5];
        for(int i = 0; i < 5;i++){
            modules[i] = new Module("Arbitrary Name");
            students[i] = new Student("Arbitrary Name");
        }
        LocalDate start_date = new LocalDate(2019, 9, 1);
        LocalDate end_date = new LocalDate(2020, 5, 31);

        test_course = new CourseProgramme("Engineering", modules, students, start_date, end_date);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getName() {
        //test course initialised with name Engineering
        Assert.assertEquals( "Engineering", test_course.getName());

        //set new name and check again
        test_course.setName("Science");
        Assert.assertEquals( "Science", test_course.getName());
    }

    @Test
    public void setName() {
        //test course initialised with name Engineering
        Assert.assertEquals( "Engineering", test_course.getName());

        //set new name and check again
        test_course.setName("Science");
        Assert.assertEquals( "Science", test_course.getName());
    }

    @Test
    public void getModules() {

    }

    @Test
    public void setModules() {

    }

    @Test
    public void getEnrolled_students() {

    }

    @Test
    public void setEnrolled_students() {

    }

    @Test
    public void getCourse_start_date() {
        //start date initialised to 1/9/2019
        Assert.assertEquals(new LocalDate(2019, 9, 1), test_course.getCourse_start_date());

        //Change date and test again
        test_course.setCourse_start_date(new LocalDate(2019, 9, 5));
        Assert.assertEquals(new LocalDate(2019, 9, 5), test_course.getCourse_start_date());
    }

    @Test
    public void setCourse_start_date() {
        //start date initialised to 1/9/2019
        Assert.assertEquals(new LocalDate(2019, 9, 1), test_course.getCourse_start_date());

        //Change date and test again
        test_course.setCourse_start_date(new LocalDate(2019, 9, 5));
        Assert.assertEquals(new LocalDate(2019, 9, 5), test_course.getCourse_start_date());
    }

    @Test
    public void getCourse_end_date() {
        //end date initialised to 31/5/2020
        Assert.assertEquals(new LocalDate(2020, 5, 31), test_course.getCourse_end_date());

        //Change date and test again
        test_course.setCourse_end_date(new LocalDate(2020, 6, 3));
        Assert.assertEquals(new LocalDate(2020, 6, 3), test_course.getCourse_end_date());
    }

    @Test
    public void setCourse_end_date() {
        //end date initialised to 31/5/2020
        Assert.assertEquals(new LocalDate(2020, 5, 31), test_course.getCourse_end_date());

        //Change date and test again
        test_course.setCourse_end_date(new LocalDate(2020, 6, 3));
        Assert.assertEquals(new LocalDate(2020, 6, 3), test_course.getCourse_end_date());
    }
}