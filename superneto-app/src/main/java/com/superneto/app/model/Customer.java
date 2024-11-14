package com.superneto.app.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 *  @Entity se usa para marcar una clase como una entidad
 *  que se puede persistir en una base de datos relacional.
 *  
 *  Se indica a JPA que la clase representa una tabla
 *  en la base de datos y que los objetos de esta clase
 *  puedan ser almacenados, actualizados o eliminados en 
 *  dicha tabla. Además, cada instancia se la clase se considera
 *  una fila en la tabla.
 */
@Entity
public class Customer {
	
	// Indica que el atributo será la clave primaria
	@Id 
	// Indica como se generará automáticamente las claves primarias
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String firstName;
	private String lastName;
	private String email;
	private boolean active;
	private LocalDate birthDate;
	private LocalDateTime createdAt;
	/*
	@ManyToOne
	private Role role;
	@OneToMany
	private Set<Address> addresses;
	*/
	
	protected Customer() {}

	public Customer(String firstName, String lastName) {		
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public Customer(String firstName, String lastName, String email) {
		this(firstName, lastName);
		this.email = email;
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
	
	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
	
	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
	
	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", fistName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	
	
	

}


/*
GenerationType.AUTO: Esta estrategia le permite al proveedor de JPA 
elegir automáticamente la estrategia de generación más adecuada según 
la base de datos y la configuración. El comportamiento exacto puede 
variar dependiendo del proveedor utilizado.

GenerationType.IDENTITY: Esta estrategia utiliza una columna de identidad 
de la base de datos para generar automáticamente los valores de la clave primaria. 
Es compatible con bases de datos como MySQL que admiten columnas de autoincremento. 
En este caso, la base de datos se encarga de generar y asignar el valor de la clave primaria.

GenerationType.SEQUENCE: Esta estrategia utiliza una secuencia de la base 
de datos para generar automáticamente los valores de la clave primaria. 
Se requiere que la base de datos admita secuencias. El proveedor de JPA 
utiliza la secuencia definida en la base de datos para obtener los valores 
de la clave primaria.

GenerationType.TABLE: Esta estrategia utiliza una tabla especial en la base 
de datos para generar los valores de la clave primaria. Se crea una tabla 
separada que registra los valores generados para cada entidad. El proveedor 
de JPA consulta esta tabla para obtener el próximo valor de la clave primaria.

 */
