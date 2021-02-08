package EduInstitute.InstituteOps.Repositories;

import EduInstitute.InstituteOps.Domain.Teacher;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends CrudRepository<Teacher, Long> {
}
