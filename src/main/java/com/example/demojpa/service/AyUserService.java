package com.example.demojpa.service;

import com.example.demojpa.model.AyUser;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;


public interface AyUserService {
    AyUser findById(String id);

    List<AyUser> findAll();

    AyUser save(AyUser ayUser);

    void delete(String id);

//    分页查询

    Page<AyUser> findAll(Pageable pageable);
}
