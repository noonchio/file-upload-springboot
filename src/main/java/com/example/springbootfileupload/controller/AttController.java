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


//    Search API
//    @RequestMapping("/api/v1/resources")
//    @GetMapping("/search")
//    public ResponseEntity<List<Resource>> searchResource(@RequestParam("query") String query, Model vModel) {
//        return ResponseEntity.ok(resourceService.searchResource(query));
//    }
//    https://www.youtube.com/watch?v=ap0JhiIT5RI&t=508s
}
