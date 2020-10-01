package com.ajin.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ajin.demo.repository.alienRepositry;
import com.ajin.demo.model.Alien;

@Service
public class AlienService {

	@Autowired
	alienRepositry alienrepository;

	public List<Alien> getAllAlien() {
		List<Alien> alien = new ArrayList<Alien>();
		alienrepository.findAll().forEach(alien1 -> alien.add(alien1));
		return alien;
	}

	public Alien getAlienById(int id) {
		return alienrepository.findById(id).get();
	}

	public void saveOrUpdate(Alien alien) {
		alienrepository.save(alien);
	}

	public void delete(int id) {
		alienrepository.deleteById(id);
	}

}
