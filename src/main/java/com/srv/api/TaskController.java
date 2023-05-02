package com.srv.api;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/task")
public class TaskController {

    @GetMapping("/data")
    public ResponseEntity getdata() {
        return ResponseEntity.status(200).body(Map.of("status", 200));
    }
}
