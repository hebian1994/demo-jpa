package com.example.demojpa;

import com.example.demojpa.model.AyUser;
import com.example.demojpa.service.AyUserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class DemoJpaApplicationTests {
    @Autowired
    AyUserService ayUserService;

    @Test
    void contextLoads() {
        List<AyUser> all = ayUserService.findAll();
        System.out.println(all);
    }

    @Test
    void findByPage() {
        PageRequest pageRequest = PageRequest.of(1, 1);
        Page<AyUser> all = ayUserService.findAll(pageRequest);
        List<AyUser> content = all.getContent();
        System.out.println(content);

    }

}
