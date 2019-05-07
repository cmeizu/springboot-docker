package com.docker.springboot.hello;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Controller
@RequestMapping("/hello")
@Api(tags = {"HelloWord"})
public class HelloWord {
    @GetMapping("/word")
    @ApiOperation(value = "HelloWordController")
    public void helloWord(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        //实现具体操作
        PrintWriter out = response.getWriter();
        out.println("Hello word springboot !");
    }
}
