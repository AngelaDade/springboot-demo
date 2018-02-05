package lpy.springbootdemo.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lipeiyuan on 2018/2/1.
 */
@RestController
public class HelloWorldController {
    @RequestMapping("/hello")
    public String sayHello() {
        return "Hello World!";
    }

}
