package com.example.springtaskmanager.controller;

import com.example.springtaskmanager.entity.Issue;
import com.example.springtaskmanager.service.IssueService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/issues")
public class IssueController {
    private final IssueService issueService;

    public IssueController(IssueService issueService) {
        this.issueService = issueService;
    }

    @PostMapping
    public ResponseEntity<Issue> create(@RequestBody Issue issue) {
        return ResponseEntity.ok(issueService.save(issue));
    }

    @GetMapping
    public List<Issue> list() {
        return issueService.findAll();
    }
}
