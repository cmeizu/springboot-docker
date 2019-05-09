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
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
@RequestMapping("/hello")
@Api(tags = {"HelloWord"})
public class HelloWord {
    @GetMapping("/word")
    @ApiOperation(value = "HelloWordController")
    public void helloWord(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();
        String title = "显示当前的日期和时间";
        Date dNow = new Date();
        SimpleDateFormat ft =
                new SimpleDateFormat("yyyy.MM.dd  hh:mm:ss E a ");
        String docType = "<!DOCTYPE html> \n";
        out.println(docType +
                "<html>\n" +
                "<head><title>" + title + "</title></head>\n" +
                "<body bgcolor=\"#f0f0f0\">\n" +
                "<h1 align=\"center\">" + title + "</h1>\n" +
                "<h2 align=\"center\">" + ft.format(dNow) + "</h2>\n" +
                "</body></html>");
    }
}
