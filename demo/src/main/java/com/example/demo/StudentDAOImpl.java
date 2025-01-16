package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.dao.StudentDAO;
import com.example.demo.entity.Students;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
public class StudentDAOImpl implements StudentDAO  {
    private EntityManager entityManager;

    @Autowired
    public StudentDAOImpl(EntityManager thEntityManager){
        entityManager = thEntityManager;
    }

    @Override
    @Transactional
    public void save(Students students){
        entityManager.persist(students);
    }
}
