package com.ajin.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ajin.demo.model.Alien;
import com.ajin.demo.service.AlienService;

@RestController
public class alienController {

	@Autowired
	AlienService alienservice;

	@GetMapping("/alien")
	private List<Alien> getAllAlien() {
		return alienservice.getAllAlien();
	}

	@GetMapping("/alien/{alienid}")
	private Alien getAlien(@PathVariable("alienid") int alienid) {
		return alienservice.getAlienById(alienid);
	}

	@PutMapping("/alien")
	private Alien update(@RequestBody Alien alien) {
		alienservice.saveOrUpdate(alien);
		return alien;
	}

	@DeleteMapping("/alien/{alienid}")
	private void deleteAlien(@PathVariable("alienid") int alienid) {
		alienservice.delete(alienid);
	}

	@PostMapping("/alien")
	private int saveBook(@RequestBody Alien alien) {
		alienservice.saveOrUpdate(alien);
		return alien.getaId();
	}

}
