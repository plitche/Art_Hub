package com.artHub.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller()
public class SampleController {

    @Autowired
    SampleService sampleService;

    @GetMapping("/sample")
    public @ResponseBody List<String> findUsers() {
        return sampleService.findUsers();
    }
}
