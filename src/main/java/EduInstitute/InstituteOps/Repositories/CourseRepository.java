package EduInstitute.InstituteOps.Repositories;


import EduInstitute.InstituteOps.Domain.Course;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends CrudRepository<Course, Long> {
}
