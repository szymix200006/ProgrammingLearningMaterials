package com.example.demo;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class SchoolController {
    private final SchoolRepository schoolRepository;

    @PostMapping("/schools")
    public School create(@RequestBody School school) {
        return schoolRepository.save(school);
    }

    @GetMapping("/schools")
    public List<School> create() {
        return schoolRepository.findAll();
    }
}
