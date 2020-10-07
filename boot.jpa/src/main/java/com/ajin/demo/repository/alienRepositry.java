package com.ajin.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ajin.demo.model.Alien;

@Repository
public interface alienRepositry extends CrudRepository<Alien, Integer>{

}
