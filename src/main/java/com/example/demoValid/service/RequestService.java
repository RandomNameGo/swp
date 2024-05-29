package com.example.demoValid.service;

import com.example.demoValid.entity.Request;

import java.util.List;

public interface RequestService {

    Request sendRequest(Request request, int userId);

    List<Request> getAllRequests();
}
