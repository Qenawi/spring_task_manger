package com.example.springtaskmanager.service;

import com.example.springtaskmanager.entity.Issue;
import com.example.springtaskmanager.repository.IssueRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IssueService {
    private final IssueRepository issueRepository;

    public IssueService(IssueRepository issueRepository) {
        this.issueRepository = issueRepository;
    }

    public Issue save(Issue issue) {
        return issueRepository.save(issue);
    }

    public Optional<Issue> findById(Long id) {
        return issueRepository.findById(id);
    }

    public List<Issue> findByProject(Long projectId) {
        return issueRepository.findByProjectId(projectId);
    }

    public List<Issue> findAll() {
        return issueRepository.findAll();
    }
}
