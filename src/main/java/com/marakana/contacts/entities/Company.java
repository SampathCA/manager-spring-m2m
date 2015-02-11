package com.marakana.contacts.entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Company extends Contact {

	@OneToMany(cascade = CascadeType.ALL)
	private Set<Office> offices;

	public Company() {
		super();
	}

	public Company(String name,Set<Office> offices) {
		super(name);
		this.offices = offices;
	}

	public Set<Office> getOffices() {
		return offices;
	}

	public void setOffices(Set<Office> offices) {
		this.offices = offices;
	}

	@Override
	public String toString() {
		return "Company [offices=" + offices + "]";
	}
}
