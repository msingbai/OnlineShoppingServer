package team.jfshop.jinfengshopserver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import team.jfshop.jinfengshopserver.service.TestService;
import team.jfshop.jinfengshopserver.util.TestUtil;

@Controller
public class TestController {
    @Autowired
    private TestService testService;

    @GetMapping("test/helloworld")
    @ResponseBody
    public TestUtil test(){
        return new TestUtil("test", testService.test());
    }
}
