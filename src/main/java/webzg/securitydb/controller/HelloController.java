package webzg.securitydb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HelloController
 * @Description: TODO
 * @Author Administrator
 * @Date 2019/10/29 0029
 * @Version V1.0
 **/
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "hello security!";
    }

    @GetMapping("/dba/hello")
    public String dba(){
        return "hello dba!";
    }
    @GetMapping("/admin/hello")
    public String admin(){
        return "hello admin";
    }
    @GetMapping("/user/hello")
    public String user(){
        return "hello user";
    }
}
