import org.joda.time.*;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;

public class TestStudent {
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
    public void testGetUserName() {
        Assert.assertEquals("John21", student.getUserName());
    }

    @Test
    public void testGetAge() {
        Assert.assertEquals(21, student.getAge());
    }

    @Test
    public void testGetCourses() {
        modules.add(module);
        student.addModule(module);
        Assert.assertEquals(modules, student.getModuleList());
    }

    @Test
    public void testGetModules() {
        courses.add(course);
        student.addCourse(course);
        Assert.assertEquals(courses, student.getCourseList());
    }
}
