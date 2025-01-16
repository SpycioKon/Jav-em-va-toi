package com.example.demo.dao;

import java.util.List;

import com.example.demo.entity.Students;

public interface StudentDAO {
    void save(Students theStudent);

    Students findById(Integer id);

    List<Students> findAll();
}
