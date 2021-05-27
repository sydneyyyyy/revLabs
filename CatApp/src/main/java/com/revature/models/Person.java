package com.revature.models;
import java.util.List;

public class Person {

	private Integer id;
	private String username;
	private String password;
	
	// List of the cats that person has
	private List<Cat> cats;

	// No-args Constructor
	public Person() {
		super();
	}

	// Constructor without Cats<>
	public Person(Integer id, String username, String password) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
	}

	// Constructor without id
	public Person(String username, String password, List<Cat> cats) {
		super();
		this.username = username;
		this.password = password;
		this.cats = cats;
	}

	// Getters and Setters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Cat> getCats() {
		return cats;
	}

	public void setCats(List<Cat> cats) {
		this.cats = cats;
	}

	
	// Override methods - hashCode()
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cats == null) ? 0 : cats.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		return result;
	}

	// equals()
	@Override
	public boolean equals(Object obj) { // the object class' implementation of equals() is ==
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (cats == null) {
			if (other.cats != null)
				return false;
		} else if (!cats.equals(other.cats))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}

	// Override - to String()
	@Override
	public String toString() {
		return "Person [id=" + id + ", username=" + username + ", password=" + password + ", cats=" + cats + "]";
	}
	
	
	
}
