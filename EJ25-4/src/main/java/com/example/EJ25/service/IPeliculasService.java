package com.example.EJ25.service;

import java.util.List;

import com.example.EJ25.dto.Peliculas;


public interface IPeliculasService {

	// Metodos del CRUD

	public List<Peliculas> listarPeliculas(); // Listar All

	public Peliculas crearPelicula(Peliculas pelicula); // CREATE

	public Peliculas leerPeliculaById(Long id); // READ

	public Peliculas actualizarPelicula(Peliculas pelicula); // UPDATE

	public void borrarPeliculaById(Long id);// DELETE

}