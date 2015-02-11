package com.marakana.contacts.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.marakana.contacts.repositories.ContactRepository;

@Controller
public class ContactController {

	@Autowired
	private ContactRepository contactRepository;

	@RequestMapping(value = "/contacts", method = RequestMethod.GET, produces = "text/html")
	public String getContactList(Model model) {
		model.addAttribute("contact", contactRepository.findAll());
		return "contact/list";
	}
}
