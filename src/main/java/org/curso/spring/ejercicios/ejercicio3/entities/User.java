package org.curso.spring.ejercicios.ejercicio3.entities;

public class User {

	private int id;
	
	private String nickname;
	
	private String firstName;
	
	private String lastName;
	
	private String email;
	
	private int age;
	
	private String photo;

	public User() {
		// TODO Auto-generated constructor stub
	}
	
	public User(int id, String nickname, String firstName, String lastName,
			String email, int age, String photo) {
		super();
		this.id = id;
		this.nickname = nickname;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.age = age;
		this.photo = photo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", nickname=" + nickname + ", firstName="
				+ firstName + ", lastName=" + lastName + ", email=" + email
				+ ", age=" + age + ", photo=" + photo + "]";
	}
	
}
