package com.marakana.contacts.entities;

import java.net.MalformedURLException;
import java.net.URL;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class Contact {
	@Id
	@GeneratedValue
	private Long id;
	@Column
	protected String name;

	public Contact() {
		super();
	}

	public Contact(String name) {
		super();
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

	@Override
	public String toString() {
		return "Contact [id=" + id + ", name=" + name + "]";
	}
}
