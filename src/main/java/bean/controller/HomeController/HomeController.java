package bean.controller.HomeController;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
/**
 * @author bean
 * @date 2020/7/3
 */

@Controller
public class HomeController {

    @RequestMapping("/hello")
    @ResponseBody
    public String index(){
        return "Hello World， Spring boot is good";
    }

}
