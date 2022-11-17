package com.example.EJ25.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EJ25.dao.IPeliculasDAO;
import com.example.EJ25.dto.Peliculas;

@Service
public class PeliculasServiceImpl implements IPeliculasService {

	@Autowired
	IPeliculasDAO iPeliculasDAO;

	@Override
	public List<Peliculas> listarPeliculas() {
		return iPeliculasDAO.findAll();
	}

	@Override
	public Peliculas crearPelicula(Peliculas pelicula) {
		return iPeliculasDAO.save(pelicula);
	}

	@Override
	public Peliculas leerPeliculaById(Long id) {
		return iPeliculasDAO.findById(id).get();
	}

	@Override
	public Peliculas actualizarPelicula(Peliculas pelicula) {
		return iPeliculasDAO.save(pelicula);
	}

	@Override
	public void borrarPeliculaById(Long id) {
		iPeliculasDAO.deleteById(id);
	}

}