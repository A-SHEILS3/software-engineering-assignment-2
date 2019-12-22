import org.joda.time.*;
//import org.joda.convert.StringConvert;
import java.time.Year;
import java.util.ArrayList;

public class Student {
    static int id;
    String userName;
    static String name;
    static int age;
    LocalDate dob;
    ArrayList courseList = new ArrayList();
    ArrayList moduleList = new ArrayList();

    public Student(int id, String name, LocalDate dob, ArrayList courseList, ArrayList moduleList) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.age = getAge();
        this.userName = getUserName();
        this.courseList = courseList;
        this.moduleList = moduleList;
    }

    public String getUserName() {
        String userName = name + age;
        return userName;
    }

    public int getAge() {
        LocalDate today = LocalDate.now();
        age = Years.yearsBetween(dob, today).getYears();
        return age;
    }

    public ArrayList getCourseList() {
        return courseList;
    }

    public void addCourse(Course course) {
        courseList.add(course);
    }

    public ArrayList getModuleList() {
        return moduleList;
    }

    public void addModule(Module module) {
        moduleList.add(module);
    }
}