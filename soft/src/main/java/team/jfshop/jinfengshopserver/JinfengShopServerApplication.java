package team.jfshop.jinfengshopserver;

import tk.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan("com.jqf.dams.dao")
@MapperScan("team.jfshop.jinfengshopserver.dao")
public class JinfengShopServerApplication {

    public static void main(String[] args) {
        System.setProperty("tomcat.util.http.parser.HttpParser.requestTargetAllow","{}");
        SpringApplication.run(JinfengShopServerApplication.class, args);
    }

}