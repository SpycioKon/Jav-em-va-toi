package com.example.demo.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.dao.StudentDAO;
import com.example.demo.entity.Students;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
public class StudentDAOImpl implements StudentDAO  {
    
    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    public StudentDAOImpl(EntityManager theEntityManager){
        entityManager = theEntityManager;
    }

    @Override
    @Transactional
    public void save(Students theStudent){
        entityManager.persist(theStudent);
    }

    @Override
    public Students findById(Integer id){
        return entityManager.find(Students.class, id);
    }

    @Override
    public List<Students> findAll(){
        TypedQuery<Students> thQuery = entityManager.createQuery("FROM Students",Students.class);
        return thQuery.getResultList();
    }

}
