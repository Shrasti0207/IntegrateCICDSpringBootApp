package IntegrateCICDSpringBoot.Service;

import IntegrateCICDSpringBoot.Model.Student;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getAllStudents(){
        return Arrays.asList(
                new Student(1, "shrasti"),
                new Student(2, "gauri")
        );
    }
}
