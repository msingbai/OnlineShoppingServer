package team.jfshop.jinfengshopserver.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    /*Swagger生成接口文件
    * 1配置文档信息
    * 2配置生成规则
    *
    * Docket封装接口文档信息*/
    @Bean
    public Docket getDocket(){

        ApiInfoBuilder apiInfoBuilder = new ApiInfoBuilder();
        apiInfoBuilder.title("后端接口说明")
                .description("此文档为接口规范")
                .version("2.0.1");
        ApiInfo apiInfo = apiInfoBuilder.build();

        Docket docket = new Docket(DocumentationType.SWAGGER_2)//指定文档风格
                .apiInfo(apiInfo)
                .select()
                .apis(RequestHandlerSelectors.basePackage("team.jfshop.jinfengshopserver.controller"))
                .build();
//指定生成的文档中的封面信息；文档标题
        return docket;
    }
}
