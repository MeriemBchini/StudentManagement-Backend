package com.example.demo.Controller;

import com.example.demo.Service.DemoService;
import com.example.demo.model.Demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/demo")
@CrossOrigin
public class DemoController {
    @Autowired
    private DemoService demoService;

    @PostMapping("/add")
    public String add(@RequestBody Demo demo){
     demoService.saveDemo(demo);
        return "new demo is added" ;
    }
    @GetMapping("/getAll")
    public List<Demo> getAllDemo(){
        return demoService.getALLDemo();
    }

}
