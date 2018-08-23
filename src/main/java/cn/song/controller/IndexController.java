package cn.song.controller;

import cn.song.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hanqingsong on 18/8/23.
 *
 * @author hanqingsong
 * @date 18/8/23
 */
@RestController
public class IndexController {
    @Autowired
    CustomerService customerService;
    @RequestMapping("/index")
    public Object index(){
        customerService.findByLastName("Bauer");
        return "hello, u";
    }

}
