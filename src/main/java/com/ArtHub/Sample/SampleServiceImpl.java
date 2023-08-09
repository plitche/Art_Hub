package com.artHub.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SampleServiceImpl implements SampleService {

    @Autowired
    SampleDAO sampleDAO;

    @Override
    public List<String> findUsers() {
        return sampleDAO.findUsers();
    }
}
