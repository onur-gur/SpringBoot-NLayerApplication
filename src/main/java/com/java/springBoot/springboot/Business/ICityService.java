package com.java.springBoot.springboot.Business;

import java.util.List;

import com.java.springBoot.springboot.Entities.City;

public interface ICityService {
	List<City> getAll();
	void add(City city);
	void update(City city);
	void delete(City city);
	City getById(int id);
}
