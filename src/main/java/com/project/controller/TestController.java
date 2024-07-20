package com.project.controller;

import com.project.repository.UserRepository;
import com.project.repository.entities.UserEntity;
import com.project.service.FixedDataService;
import com.project.service.UserService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {
    @Autowired
    private FixedDataService fixDataService;
    @Autowired
    private UserRepository userRepository;
    //kiểm tra data fixed
    @GetMapping("/getData")

    public ResponseEntity <List<String>> getData() {
        return ResponseEntity.ok(fixDataService.getAssetType());
    }

    //kiểm tra dữ liệu user
    @GetMapping("/employees")

    public Iterable<UserEntity> findAllEmployees(HttpServletRequest request) {
        return this.userRepository.findAll();

    }

}
