package com.fintech.org.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fintech.org.model.AppUsers;

@Repository
public interface AppDao extends JpaRepository<AppUsers, Integer>{

	AppUsers findByEmailAndPassword(String string1, String string2);



}
