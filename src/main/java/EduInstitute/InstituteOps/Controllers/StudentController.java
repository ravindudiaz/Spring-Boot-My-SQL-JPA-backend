package EduInstitute.InstituteOps.Controllers;

import EduInstitute.InstituteOps.Domain.Student;
import EduInstitute.InstituteOps.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/students/all")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @GetMapping("/students/{id}")
    public Student getStudentById(@PathVariable("id") Long id){
        return studentService.getStudentById(id);
    }

    @GetMapping("/students/total")
    public long getTotalNumberOfStudents(){
        return studentService.getTotalNumberOfStudents();
    }

    @PostMapping("/students/saveStudent")
    public Student saveStudent(@RequestBody Student student){
        return studentService.saveStudent(student);
    }

    @PostMapping("/students/saveStudents")
    public List<Student> saveStudents(@RequestBody List<Student> students){
        return studentService.saveStudents(students);
    }

    @DeleteMapping("/students/deleteAll")
    public String deleteAllStudents(){
        studentService.deleteAllStudents();
        return "All students deleted";
    }

    @DeleteMapping("/students/{id}")
    public String deleteStudentById(@PathVariable("id") Long id){
        studentService.deleteStudentById(id);
        return "Student with id: "+id+"deleted";
    }

    @PutMapping("/students/updateStudent")
    public Student updateStudent(@RequestBody Student student){
        return studentService.updateStudent(student);
    }
}
