import java.util.ArrayList;

public class Module {
    String name;
    String id;
    ArrayList studentList;
    ArrayList courseList;

    public Module(String name, String id, ArrayList studentList, ArrayList courseList) {
        this.name = name;
        this.id = id;
        this.studentList = studentList;
        this.courseList = courseList;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public ArrayList getStudentList() {
        return studentList;
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public ArrayList getCourseList() {
        return courseList;
    }

    public void addCourse(Course course) {
        courseList.add(course);
    }
}