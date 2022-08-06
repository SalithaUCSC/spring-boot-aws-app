package com.example.demoapp.configs;

import com.example.demoapp.entities.User;
import com.example.demoapp.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
public class UserDataExecutor implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        List<User> users = userRepository.findAll();
        if (users.size() > 0) {
            userRepository.deleteAll();
        }
        userRepository.saveAll(
            Arrays.asList(
                new User(1, "salitha", 28),
                new User(2, "john", 32)
            )
        );
    }
}
