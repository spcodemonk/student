package com.company.student;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwggerConfig {

	@Bean
    public Docket productApi() {

        return new Docket(DocumentationType.SWAGGER_2)

                .select()
                .apis(RequestHandlerSelectors.basePackage("com.company.student.controller"))
                .build()
                .apiInfo(metaData());

    }
	
    private ApiInfo metaData() {

        ApiInfo apiInfo = new ApiInfo(

                "Student Application REST API",

                "Student Application REST API for college",

                "1.0",

                "Terms of service",

                new Contact("Sharad Pawar", "www.Principal.com", "sharadpawar01@gmail.com"),

               "Apache License Version 2.0",

                "https://www.apache.org/licenses/LICENSE-2.0");

        return apiInfo;

    }
}
