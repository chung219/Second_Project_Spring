package fc.franchise;

import fc.franchise.config.MybatisConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@Import(MybatisConfig.class)
@SpringBootApplication(scanBasePackages = "fc.franchise.web")
public class FranchiseApplication {

	public static void main(String[] args) {
		SpringApplication.run(FranchiseApplication.class, args);
	}


}
