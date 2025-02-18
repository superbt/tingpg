package org.bt.web;


import org.bt.comon.vo.R;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/bt")
public class Index {
    @RequestMapping("/index")
    @ResponseBody
    public R btIndex(String args){
        return R.success(String.format("welcome %s",args)) ;
    }
}
