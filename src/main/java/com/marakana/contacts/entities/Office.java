package com.marakana.contacts.entities;

import java.net.MalformedURLException;
import java.net.URL;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Office extends BaseEntity{

	private String name;
	@OneToOne(cascade = CascadeType.ALL)
	private Address address;

	public Office() {
		super();
	}

	public Office(String name, Address address) {
		this.address = address;
		this.name = name;
	}

	public URL getUrl(String link) throws MalformedURLException {
		URL url = new URL(link);
		return url;
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
}
