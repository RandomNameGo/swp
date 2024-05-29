package com.example.demoValid.controller;

import com.example.demoValid.entity.Intern;
import com.example.demoValid.entity.Request;
import com.example.demoValid.service.InternService;
import com.example.demoValid.service.RequestService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class MainController {

    @Autowired
    private RequestService requestService;

    @Autowired
    private InternService internService;

    @PostMapping("/help/{userId}")
    public ResponseEntity<Request> sendRequest(@Valid @RequestBody Request request, @PathVariable int userId) {
        return new ResponseEntity<>(requestService.sendRequest(request, userId), HttpStatus.CREATED);
    }

    @GetMapping("/help/get")
    public List<Request> getRequests() {
        return requestService.getAllRequests();
    }

    @GetMapping("/intern")
    public List<Intern> getInterns() {
        return internService.findAllIntern();
    }

    @GetMapping("/intern/id/{internId}")
    public Optional<Intern> getInternById(@PathVariable int internId) {
        return internService.findInternById(internId);
    }

    @GetMapping("/intern/name/{name}")
    public List<Intern> getInternByName(@PathVariable String name) {
        return internService.findInternByName(name);
    }
}
