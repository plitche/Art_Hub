package com.artHub.sample;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class SampleServiceImpl implements SampleService {

    private final SampleDAO sampleDAO;

    @Override
    public List<String> findUsers() {
        return sampleDAO.findUsers();
    }
}
