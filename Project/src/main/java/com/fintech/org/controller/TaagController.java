package com.fintech.org.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fintech.org.dao.TaagDao;
import com.fintech.org.model.TaagUsers;
import com.fintech.org.model.Users;
import com.fintech.org.model.Users.Dist;
import com.fintech.org.model.Users.Use;

@RestController
@RequestMapping("/api")
public class TaagController {
	
	@Autowired
	private TaagDao taagDao;
	
	
	@PostMapping("/userdetails")
	public  TaagUsers adding(@RequestBody TaagUsers taagusers)
	{
		return  taagDao.save(taagusers);
		

	}
	
	@GetMapping("/Get/state/{state}")
public List<Users> getStateDetails(@PathVariable("state") String state)
{
	 return taagDao.findByState(state);
	 
}
	
	@GetMapping("/Get/town/{town}")
	public List<Use> getByTown(@PathVariable("town") String town)
	{
		
		return taagDao.findByTown(town);
		
	}
	
	@GetMapping("/Get/district/{district}")
	public List<Dist> getByDistrict(@PathVariable("district") String district)
	{
		return taagDao.findByDistrict(district);
		
	}

	
	
}

