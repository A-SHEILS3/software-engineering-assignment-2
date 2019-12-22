import org.joda.time.*;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;

public class TestCourse {
    ArrayList<Student> students = new ArrayList<Student>();
    ArrayList<Module> modules = new ArrayList<Module>();
    ArrayList<Course> courses = new ArrayList<Course>();
    LocalDate dob = new LocalDate(1998,7,20);
    LocalDate startDate = new LocalDate(2016, 9, 1);
    LocalDate endDate = new LocalDate(202, 6 , 30);

    Student student = new Student(123, "John", dob, courses, modules);
    Module module = new Module("Software Engineering III", "CT417", students, courses);
    Course course = new Course("Electronic and Computer Engineering", modules, students, startDate, endDate);

    @Test
    public void testGetName() {
        Assert.assertEquals("Electronic and Computer Engineering", course.getName());
    }

    @Test
    public void testGetModuleList() {
        modules.add(module);
        course.addModule(module);
        Assert.assertEquals(modules, course.getModuleList());
    }

    @Test
    public void testGetStudentList() {
        students.add(student);
        course.addStudent(student);
        Assert.assertEquals(students, course.getStudentList());
    }

    @Test
    public void testGetStartDate() {
        Assert.assertEquals(startDate, course.getStartDate());
    }

    @Test
    public void testGetEndDate() {
        Assert.assertEquals(endDate, course.getEndDate());
    }
}
