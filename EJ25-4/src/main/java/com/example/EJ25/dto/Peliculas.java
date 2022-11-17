package com.example.EJ25.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "peliculas") // Nombre de la tabla

public class Peliculas {

	// Atributos de la entidad Departamentos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	private int calificacionEdad;

	@OneToMany
	@JoinColumn(name = "peliculas_id")
	private List<Salas> peliculas_id;

	// Constructores

	public Peliculas() {
	}

	public Peliculas(Long id, String nombre, int calificacionEdad) {
		this.id = id;
		this.nombre = nombre;
		this.calificacionEdad = calificacionEdad;
	}

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

	public int getCalificacionEdad() {
		return calificacionEdad;
	}

	public void setCalificacionEdad(int calificacionEdad) {
		this.calificacionEdad = calificacionEdad;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "peliculas_id")
	public List<Salas> getPeliculas_id() {
		return peliculas_id;
	}

	public void setPeliculas_id(List<Salas> peliculas_id) {
		this.peliculas_id = peliculas_id;
	}

	@Override
	public String toString() {
		return "Peliculas [id=" + id + ", nombre=" + nombre + ", calificacionEdad=" + calificacionEdad + "]";
	}

}
