package IntegrateCICDSpringBoot;
import IntegrateCICDSpringBoot.Model.Student;
import IntegrateCICDSpringBoot.Service.StudentService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentServiceTest {

    private StudentService studentService;

    @BeforeEach
    void setup(){
        studentService = new StudentService();
    }

    @Test
    void returnListOfStudents(){
        List<Student> students = studentService.getAllStudents();
        assertEquals(2, students.size());
        assertEquals(1, students.get(0).getId());
        assertEquals(2, students.get(1).getId());
    }
}
