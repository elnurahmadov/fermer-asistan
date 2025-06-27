package agrotech.fermerasistan;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("agrotech.fermerasistan.mapper")
public class FermerAsistanApplication {

    public static void main(String[] args) {
        SpringApplication.run(FermerAsistanApplication.class, args);
    }

}
