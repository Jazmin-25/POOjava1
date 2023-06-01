package org.generation.classes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.generation.util.EmailFormatException;

public class Person {

	private String name;
	private int age;
	private String email;
	private String rfc;
	private String address;
	private int id;
	private static int total=0;

	public Person(String name, int age) {
		this(name, age, "email@email.com", "TEXL010101XY1", "Casa");
	}// constructor

	public Person(String name, int age, String email, String rfc, String address) {
		this.name = name;
		this.age = age;
		this.email = email;
		this.rfc = rfc;
		this.address = address;
		Person.total++;
		this.id=Person.total;
	}// constructor

	public static int getTotal() {
		return Person.total;
	}//getTotal
	public int getId() {
		return id;
	}//getId
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name.toUpperCase();
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = (age<18)?18:age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) throws EmailFormatException {
		
		Pattern regex = Pattern.compile("^[a-z_0-9.%+-]+@[a-z0-9.-]+\\.[a-z]{2,6}",
				Pattern.CASE_INSENSITIVE);
		Matcher matcher =regex.matcher(email);
		
		if(matcher.matches()) {
			this.email = email.toLowerCase();
		} else {
			this.email = "jdoe@hotmail.com";
			throw new EmailFormatException("El formato del correo no es válido [" + email + "]");
		}//else

		this.email = email;
	}//setEmail

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	//Sirve para imprimir todos los datos mas rapido, o sea toma los datos anteriores y los convierte en cadena
	//Esto lo hice desde la barra de opciones superior, en el apartado "Source" después
	//Generate toString(), en el menu se apreta generar y listo :)
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", email=" + email + ", rfc=" + rfc + ", address=" + address
				+ "]";
	}//toString
	
}// class Person
