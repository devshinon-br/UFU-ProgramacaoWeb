package com.keyla.lab4.controller;

import com.keyla.lab4.model.Course;
import com.keyla.lab4.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/lab4")
public class LabController {

    @GetMapping(path = "/add")
    public @ResponseBody
    String addUser(@RequestParam String name, @RequestParam String email) {
        User n = new User();
        n.setName(name);
        n.setEmail(email);
        return n.toString();
    }

    @GetMapping(path = "/add-course")
    public @ResponseBody
    String addCourse(@RequestParam String description, @RequestParam String teacher) {
        Course n = new Course();
        n.setDescription(description);
        n.setTeacher(teacher);
        return n.toString();
    }
}

