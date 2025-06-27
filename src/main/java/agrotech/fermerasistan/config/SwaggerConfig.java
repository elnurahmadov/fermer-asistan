package agrotech.fermerasistan.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Fermer Asistan API")
                        .version("v1.0.0")
                        .description("Fermerlər üçün məhsul planlama və satış sisteminin REST API interfeysi"));
    }
}
