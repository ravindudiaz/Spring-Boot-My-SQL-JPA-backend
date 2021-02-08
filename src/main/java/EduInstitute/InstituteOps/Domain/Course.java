package EduInstitute.InstituteOps.Domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Course {

    @Id
    @GeneratedValue
    private Long courseId;

    private String name;
    private Integer no_modules;

    private Course() {} //private no args constructor

    public Course(String name, Integer no_modules){
        this.setName(name);
        this.setNo_modules(no_modules);
    } //all args constructor

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNo_modules() {
        return no_modules;
    }

    public void setNo_modules(Integer no_modules) {
        this.no_modules = no_modules;
    }
}
