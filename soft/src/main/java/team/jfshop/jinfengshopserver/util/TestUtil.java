package team.jfshop.jinfengshopserver.util;

import lombok.Data;

@Data
public class TestUtil {
    private String module;
    private String message;

    public TestUtil(String module, String message){
        this.module = module;
        this.message = message;
    }
}
