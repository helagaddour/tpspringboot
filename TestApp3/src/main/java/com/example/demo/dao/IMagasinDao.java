package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Magasin;



@Repository
public interface IMagasinDao extends JpaRepository<Magasin, Integer>{

	
}

