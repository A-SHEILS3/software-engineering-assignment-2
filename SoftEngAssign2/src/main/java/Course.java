import java.util.ArrayList;
import org.joda.time.LocalDate;

public class Course {
    String name;
    ArrayList moduleList;
    ArrayList studentList;
    LocalDate startDate;
    LocalDate endDate;

    public Course(String name, ArrayList moduleList, ArrayList studentList, LocalDate startDate, LocalDate endDate) {
        this.name = name;
        this.moduleList = moduleList;
        this.studentList = studentList;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getName() {
        return name;
    }

    public void addModule(Module module) {
        moduleList.add(module);
    }

    public ArrayList getModuleList() {
        return moduleList;
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public ArrayList getStudentList() {
        return studentList;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }
}
