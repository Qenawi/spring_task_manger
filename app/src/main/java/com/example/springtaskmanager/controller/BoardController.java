package com.example.springtaskmanager.controller;

import com.example.springtaskmanager.entity.Issue;
import com.example.springtaskmanager.service.IssueService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.EnumMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/board")
public class BoardController {
    private final IssueService issueService;

    public BoardController(IssueService issueService) {
        this.issueService = issueService;
    }

    @GetMapping("/{projectId}")
    public Map<Issue.Status, List<Issue>> board(@PathVariable Long projectId) {
        List<Issue> issues = issueService.findByProject(projectId);
        Map<Issue.Status, List<Issue>> map = new EnumMap<>(Issue.Status.class);
        for (Issue.Status status : Issue.Status.values()) {
            map.put(status, issues.stream().filter(i -> i.getStatus() == status).toList());
        }
        return map;
    }
}
