package com.example.demo.Service;

import com.example.demo.model.Demo;

import java.util.List;

public interface DemoService {
    public Demo saveDemo(Demo demo);
    public List<Demo> getALLDemo();

    public static void main(String[] args) {
        // Your code here
    }
}