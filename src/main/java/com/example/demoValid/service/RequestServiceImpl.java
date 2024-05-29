package com.example.demoValid.service;

import com.example.demoValid.entity.Request;
import com.example.demoValid.entity.UserAccount;
import com.example.demoValid.repository.RequestRepository;
import com.example.demoValid.repository.UserAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RequestServiceImpl implements RequestService{

    @Autowired
    private RequestRepository requestRepository;

    @Autowired
    private UserAccountRepository accountRepository;

    @Override
    public Request sendRequest(Request request, int userId) {
        UserAccount userAccount = accountRepository.findById(userId).get();
        request.setUserAccount(userAccount);
        request.setId(0);
        return requestRepository.save(request);
    }

    @Override
    public List<Request> getAllRequests() {
        return requestRepository.findAll();
    }
}
