package com.marakana.contacts.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Office extends UrlEntity {

	private String name;

	@OneToOne(cascade = CascadeType.ALL)
	private Address address;

	@ManyToOne
	private Company company;

	public Office() {
		super();
	}

	public Office(String name, Address address, Company company) {
		this.address = address;
		this.company = company;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

}
