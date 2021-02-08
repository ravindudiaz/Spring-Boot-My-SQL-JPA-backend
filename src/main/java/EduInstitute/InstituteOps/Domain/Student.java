package EduInstitute.InstituteOps.Domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Student {

    @Id
    @GeneratedValue
    private Long studentId;

    private String firstName;
    private String lastName;
    private String address_1;
    private String address_2;
    private String City;


    private Student(){ } //private no arg constructor

    public Student(String firstName, String lastName, String address_1, String address_2, String city){
//        this.setStudentId(studentId);
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setAddress_1(address_1);
        this.setAddress_2(address_2);
        this.setCity(city);
    } // all args constructor

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress_1() {
        return address_1;
    }

    public void setAddress_1(String address_1) {
        this.address_1 = address_1;
    }

    public String getAddress_2() {
        return address_2;
    }

    public void setAddress_2(String address_2) {
        this.address_2 = address_2;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }
}
