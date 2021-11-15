package com.example.demojpa.service.impl;

import com.example.demojpa.model.AyUser;
import com.example.demojpa.reposity.UserReposity;
import com.example.demojpa.service.AyUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AyUserServiceImpl implements AyUserService {
    @Autowired
    private UserReposity userReposity;

    @Override
    public AyUser findById(String id) {
        return userReposity.findById(id).get();
    }

    @Override
    public List<AyUser> findAll() {
        return userReposity.findAll();
    }

    @Override
    public AyUser save(AyUser ayUser) {
        return userReposity.save(ayUser);
    }

    @Override
    public void delete(String id) {
        userReposity.deleteById(id);
    }

    /**
     * 分页
     *
     * @param pageable
     * @return
     */
    @Override
    public Page<AyUser> findAll(Pageable pageable) {
        return userReposity.findAll(pageable);
    }
}
