package com.artHub.sample;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Slf4j
@AllArgsConstructor
@Controller
public class SampleController {

    private final SampleService sampleService;

    @GetMapping("/sample")
    public @ResponseBody List<String> findUsers() {
        log.trace("Trace Level 테스트");
        log.debug("DEBUG Level 테스트");
        log.info("INFO Level 테스트");
        log.warn("Warn Level 테스트");
        log.error("ERROR Level 테스트");
        return sampleService.findUsers();
    }
}
