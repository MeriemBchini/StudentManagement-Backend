package com.example.demo.Service;


import com.example.demo.model.Demo;
import com.example.demo.repository.DemoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DemoServiceImp implements DemoService {
    @Autowired
    private DemoRepository DemoRepository;

    @Override
    public List<Demo> getALLDemo() {
        return DemoRepository.findAll();
    }

    @Override
    public Demo saveDemo(Demo Demo) {
        return DemoRepository.save(Demo);

    }
}

