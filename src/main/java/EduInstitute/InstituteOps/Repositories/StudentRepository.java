package EduInstitute.InstituteOps.Repositories;

import EduInstitute.InstituteOps.Domain.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {
}
