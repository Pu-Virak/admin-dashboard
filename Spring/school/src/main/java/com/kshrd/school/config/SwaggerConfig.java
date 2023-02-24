package com.kshrd.school.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(servers = {@Server(url = "/", description = "Default Server URL")})
public class SwaggerConfig {
    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("School Management Application")
                        .description("First Developing API")
                        .version("v1.0")
                        .termsOfService("TOC")
                        .license(new License()
                                .name("License")
                                .url("#"))
                        .contact(new Contact()
                                .email("detvirak5@gmail.com")
                                .name("Det Virak")
                                .url("#")));
    }
}
