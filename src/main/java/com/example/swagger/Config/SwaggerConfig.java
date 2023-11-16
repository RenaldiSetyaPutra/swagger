//package com.example.swagger.Config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.service.ApiInfo;
//import springfox.documentation.service.Contact;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;
//
//import java.util.Collections;
//
//@Configuration
//@EnableSwagger2
//public class SwaggerConfig {
//    // Swagger-ui
//    // http://127.0.0.1:8080/swagger-ui/
//
//    // Swagger Api Doc Generate
//    // http://127.0.0.1:8080/v2/api-docs
//
//    @Bean
//    public Docket api(){
//        return new Docket(DocumentationType.SWAGGER_2)
//                .select()
//                .apis(RequestHandlerSelectors.basePackage("com.example.swagger.Controller"))
//                .paths(PathSelectors.any())
//                .build()
//                .apiInfo(apiInfo());
//    }
//
//    private ApiInfo apiInfo(){
//        ApiInfo apiInfo = new ApiInfo(
//                "Swagger",
//                "Belajar Swagger",
//                "v1.0",
//                "Term of Service",
//                new Contact(
//                        "Renaldi Setya Putra",
//                        "www.yourUrl.com",
//                        "@gmail"),
//                "Apache License",
//                "www.apache.com",
//                Collections.emptyList()
//        );
//        return apiInfo;
//    }
//}
