package com.example.springtaskmanager.init;

import com.example.springtaskmanager.entity.Project;
import com.example.springtaskmanager.entity.User;
import com.example.springtaskmanager.repository.ProjectRepository;
import com.example.springtaskmanager.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    private final UserRepository userRepository;
    private final ProjectRepository projectRepository;
    private final PasswordEncoder passwordEncoder;

    public DataLoader(UserRepository userRepository, ProjectRepository projectRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.projectRepository = projectRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public void run(String... args) {
        if (userRepository.count() == 0) {
            User admin = new User();
            admin.setUsername("admin");
            admin.setPassword(passwordEncoder.encode("password"));
            admin.setRole("ADMIN");
            userRepository.save(admin);
        }

        if (projectRepository.count() == 0) {
            Project project = new Project();
            project.setName("Sample Project");
            project.setDescription("Initial project");
            projectRepository.save(project);
        }
    }
}
