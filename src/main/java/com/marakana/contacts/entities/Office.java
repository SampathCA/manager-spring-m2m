package com.marakana.contacts.entities;

import java.net.MalformedURLException;
import java.net.URL;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Office {
	@Id
	@GeneratedValue
	private Long id;
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	@Override
	public String toString() {
		return "Office [id=" + id + ", name=" + name + ", address=" + address
				+ "]";
	}
}
