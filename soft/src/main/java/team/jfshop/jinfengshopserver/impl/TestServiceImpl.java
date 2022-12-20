package team.jfshop.jinfengshopserver.impl;

import org.springframework.stereotype.Service;
import team.jfshop.jinfengshopserver.service.TestService;

@Service
public class TestServiceImpl implements TestService {
    @Override
    public String test(){
        return "Hello World!";
    }
}
