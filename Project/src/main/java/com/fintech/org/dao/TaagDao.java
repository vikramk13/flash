package com.fintech.org.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.fintech.org.model.TaagUsers;
import com.fintech.org.model.Users;
import com.fintech.org.model.Users.Dist;
import com.fintech.org.model.Users.Use;




@Repository
public interface TaagDao extends JpaRepository<TaagUsers, Integer>{


	

@Query(nativeQuery = true, value ="SELECT  t.state as  state ,t.state_Code as state_Code,t.district as district" +" from  TaagUsers t"+"  where t.state =?1")
	List<Users>  findByState(String state);


@Query(nativeQuery = true, value ="SELECT t.town ,t.district_Code,t.state,t.district"+" from TaagUsers t"+" where t.town=?1")
List<Use> findByTown(String town);


@Query(nativeQuery=true,value="SELECT t.town,t.urban_status,t.state_Code,t.state,t.district_Code,t.district from TaagUsers t where t.district=?1")
List<Dist> findByDistrict(String district);



}
