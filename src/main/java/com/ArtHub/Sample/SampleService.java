package com.artHub.sample;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SampleService {

    public List<String> findUsers();
}
