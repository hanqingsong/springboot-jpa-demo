package cn.song.controller;

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

    @RequestMapping("/index")
    public Object index(){

        return "hello, u";
    }

}
