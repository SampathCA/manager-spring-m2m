package com.marakana.contacts.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.marakana.contacts.entities.Address;
import com.marakana.contacts.entities.Person;
import com.marakana.contacts.repositories.PersonRepository;

@Controller
public class PersonController {

	@Autowired
	private PersonRepository personRepository;

	@RequestMapping(value = "/person", params = "add", method = RequestMethod.GET)
	public String getAddContact() {
		return "person/add";
	}

	@RequestMapping(value = "/person", params = "edit", method = RequestMethod.GET)
	public String getEditContact(@RequestParam long id, Model model) {
		model.addAttribute("person", personRepository.findOne(id));
		return "person/edit";
	}

	@RequestMapping(value = "/person", method = RequestMethod.GET)
	public String getViewContact(@RequestParam long id, Model model) {
		model.addAttribute("person", personRepository.findOne(id));
		return "person/view";
	}

	@RequestMapping(value = "/person", params = "add", method = RequestMethod.POST)
	public String getPostAddContact(@RequestParam String name,
			@RequestParam String street, @RequestParam String city,
			@RequestParam String state, @RequestParam String zip) {
		Address address = new Address(street, city, state, zip);
		Person person = new Person(name, address);

		person = personRepository.save(person);

		return "redirect:person?id=" + person.getId();
	}

	@RequestMapping(value = "/person", params = "edit", method = RequestMethod.POST)
	public String postEditContact(@RequestParam long id,
			@RequestParam String name, @RequestParam String street,
			@RequestParam String city, @RequestParam String state,
			@RequestParam String zip) {

		Person person = personRepository.findOne(id);
		Address address = person.getAddress();

		person.setName(name);
		address.setStreet(street);
		address.setCity(city);
		address.setState(state);
		address.setZip(zip);

		person = personRepository.save(person);

		return "redirect:person?id=" + person.getId();
	}

	@RequestMapping(value = "/person", params = "delete", method = RequestMethod.POST)
	public String postDeleteContact(@RequestParam long id) {
		personRepository.delete(id);
		return "redirect:contacts";
	}
}
