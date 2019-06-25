package com.qa.nbs.friends.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Friend {
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String firstName;
	private String secondName;
	private Long age;
	
	public Friend() 
	{
		
	}
	
	public Friend(Long id, String firstName, String secondName, Long age) 
	{
		this.id = id;
		this.firstName = firstName;
		this.secondName = secondName;
		this.age = age;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	
	public Long getAge() {
		return age;
	}

	public void setAge(Long age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Friend [id=" + id + 
				", firstName=" + firstName + 
				", secondName=" + secondName +
				", age=" + age +"]";
	}
}