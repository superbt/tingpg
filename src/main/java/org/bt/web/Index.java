package org.bt.web;


import org.bt.comon.vo.R;
import org.bt.utils.DateUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/bt")
public class Index {
    @RequestMapping("/api")
    @ResponseBody
    public R btApi(String args){
        return R.success(String.format("welcome %s",args)) ;
    }

    @RequestMapping("/index")
    public String btIndex(){
        System.out.println("这是一个简单功能 进入一个简单的页面哟"+ DateUtils.getDateTrs());
        return "/page/index.html";
    }

    @RequestMapping("/error")
    public String btError(){
        System.out.println("这是一个失败页面");
        return "/error.html";
    }

}
