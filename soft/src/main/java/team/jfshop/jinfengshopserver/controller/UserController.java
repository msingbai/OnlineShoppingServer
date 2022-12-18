package team.jfshop.jinfengshopserver.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import team.jfshop.jinfengshopserver.service.TestService;
import team.jfshop.jinfengshopserver.util.TestUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@Controller

public class UserController {
    @Autowired
    private TestService testService;

    @GetMapping("/login")

    @ResponseBody
    public TestUtil test(){
        return new TestUtil("test", testService.test());
    }

}
