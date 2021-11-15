package com.example.demojpa.reposity;

import com.example.demojpa.model.AyUser;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * JpaRepository相当于mybatisPlus的BaseMapper
 */
public interface UserReposity extends JpaRepository<AyUser, String> {
}
