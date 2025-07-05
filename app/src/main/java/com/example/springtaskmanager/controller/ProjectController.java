package com.example.springtaskmanager.controller;

import com.example.springtaskmanager.entity.Project;
import com.example.springtaskmanager.service.ProjectService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/projects")
public class ProjectController {
    private final ProjectService projectService;

    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @PostMapping
    public ResponseEntity<Project> create(@RequestBody Project project) {
        return ResponseEntity.ok(projectService.save(project));
    }

    @GetMapping
    public List<Project> list() {
        return projectService.findAll();
    }
}
