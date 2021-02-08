package EduInstitute.InstituteOps.Services;

import EduInstitute.InstituteOps.Domain.Student;
import EduInstitute.InstituteOps.Repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudents(){
        return (List<Student>) studentRepository.findAll();
    }

    public Student getStudentById(Long id){
        return studentRepository.findById(id).orElse(null);
    }

    public long getTotalNumberOfStudents(){
        return studentRepository.count();
    }

    public Student saveStudent(Student student){
        return studentRepository.save(student);
    }

    public List<Student> saveStudents(List<Student> students){
        return (List<Student>) studentRepository.saveAll(students);
    }

    public void deleteAllStudents(){
        studentRepository.deleteAll();
        System.out.println("All students deleted...");
    }

    public void deleteStudentById(Long id){
        if(studentRepository.existsById(id)){
            studentRepository.deleteById(id);
            System.out.println("Student deleted... id: "+id);
        }
        else{
            System.out.println("No such item to delete...");;
        }
    }

    public Student updateStudent(Student student){
        Student existingStudent = studentRepository.findById(student.getStudentId()).orElse(null);
        existingStudent.setFirstName(student.getFirstName());
        existingStudent.setLastName(student.getLastName());
        existingStudent.setAddress_1(student.getAddress_1());
        existingStudent.setAddress_2(student.getAddress_2());
        existingStudent.setCity(student.getCity());

        return existingStudent;
    }
}
