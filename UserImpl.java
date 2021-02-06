package com.example.demo.serviceimpl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Userentity;
import com.example.demo.repo.GenericRepo;
import com.example.demo.service.User;

@Service
public class UserImpl implements User<Userentity>{
	
	@Autowired
	GenericRepo<Userentity> repo;
   
	@Override
     public Userentity createUser(Userentity t){
		return repo.create(t);
	 }

	@Override
	public Userentity getUser() {
		List<Userentity> list = repo.getUser();
		Userentity user = null;
		for(Userentity u : list) {
			user = u;
		}
		return user;
	}
	
	public void Update(Userentity u, long id){
		repo.update(u,id);
	}
}
