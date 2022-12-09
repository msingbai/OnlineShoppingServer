package team.jfshop.jinfengshopserver;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan("com.jqf.dams.dao")
@MapperScan("team.fengmishop.demo.dao")
public class DamsApplication {

    public static void main(String[] args) {
        System.setProperty("tomcat.util.http.parser.HttpParser.requestTargetAllow","{}");
        SpringApplication.run(DamsApplication.class, args);
    }

}