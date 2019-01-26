package com.springmvc.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model; // 这里导入了一个Model类

/**
 * @author ipllt
 * @create 2019-01-25 下午 8:48
 */

@Controller
@RequestMapping("/hi")
public class HiController {

    /**
     * 使用requestmapping注解映射请求的URL
     * 返回值会通过视图解析器解析为实际的物理视图，对于InternalResourceViewResolver视图解析器，会做出如下解析：
     * 通过prefix + returnVal + 后缀 这样的方式得到实际的物理视图，然后做转发操作
     * /WEB-INF/jsp/say.jsp
     * */
    @RequestMapping("/say")
    public  String say(Model model){
        model.addAttribute("name","pl"); // 指定Model的值
        model.addAttribute("url","http://www.cnblogs.com/wormday/p/8435617.html"); // 指定Model的值
        return "say";
    }
}
