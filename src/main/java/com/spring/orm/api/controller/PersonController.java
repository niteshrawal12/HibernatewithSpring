package com.spring.orm.api.controller;

import java.util.List;

import com.spring.orm.api.dao.PersonDao;
import com.spring.orm.api.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/spring-boot-orm")
public class PersonController {

	@Autowired
	private PersonDao dao;

	@PostMapping("/savePerson")
	public String save(@RequestBody Person person) {
		dao.savePerson(person);
		return "success";
	}

	@GetMapping("/getAll")
	public List<Person> getALlPersons() {
		return dao.getPersons();
	}

}
