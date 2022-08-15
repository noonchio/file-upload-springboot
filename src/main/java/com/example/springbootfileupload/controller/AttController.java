package com.example.springbootfileupload.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AttController {



    @GetMapping("/")
    public String uploadForm(Model vModel) {

        return "file-upload";
    }
}
