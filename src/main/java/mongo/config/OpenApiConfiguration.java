package mongo.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springdoc.core.GroupedOpenApi;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfiguration {

    @Bean
    public OpenAPI customOpenAPI(@Value("${version}") final String appVersion) {
        return new OpenAPI().info(new Info()
                .title("Mongo Example API")
                .version(appVersion)
                .description("This is an example of a Mongo DB example API.")
                .termsOfService("http://swagger.io/terms/")
                .license(new License().name("Apache 2.0")
                        .url("http://springdoc.org")));
    }

    @Bean
    public GroupedOpenApi personApi() {
        final String[] paths = {"/person/**", "/people/**"};
        return GroupedOpenApi.builder().group("people").pathsToMatch(paths)
                .build();
    }
}
