package EduInstitute.InstituteOps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan({"EduInstitute.InstituteOps.Domain"})
public class InstituteOpsApplication {

	public static void main(String[] args) {
		SpringApplication.run(InstituteOpsApplication.class, args);
	}

}
