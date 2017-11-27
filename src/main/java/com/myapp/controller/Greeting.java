package com.myapp.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.myapp.domain.Greeting;


@Controller
@RequestMapping("/health")
public class Greeting {

    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(method = RequestMethod.GET)
    public
    @ResponseBody
    Greeting process(@RequestParam(value = "Hardik", required = false, defaultValue = "content") String content) {
        return new Greeting(counter.incrementAndGet(), content );
    }

}