package com.test.fileupload;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/upload")
    public String DoGet(){
        return "Hello";
    }
}
