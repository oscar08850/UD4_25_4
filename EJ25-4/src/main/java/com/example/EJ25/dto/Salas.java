package com.example.EJ25.dto;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "salas") // Nombre de la tabla

public class Salas {

	// Atributos de la entidad Departamentos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	
	@ManyToOne
	@JoinColumn(name = "pelicula_id")
	private Peliculas pelicula_id;

	// Constructores

	public Salas() {
	}

	
	public Salas(Long id, String nombre, Peliculas pelicula_id) {
		this.id = id;
		this.nombre = nombre;
		this.pelicula_id = pelicula_id;
	}
	
	

	// Getters y setters
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Peliculas getPelicula_id() {
		return pelicula_id;
	}


	public void setPelicula_id(Peliculas pelicula_id) {
		this.pelicula_id = pelicula_id;
	}


	@Override
	public String toString() {
		return "Salas [id=" + id + ", nombre=" + nombre + ", pelicula_id=" + pelicula_id + "]";
	}

}