package com.example.EJ25.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.EJ25.dto.Peliculas;
import com.example.EJ25.service.PeliculasServiceImpl;

@RestController
@RequestMapping("/api")
public class ControladorPeliculas {

	@Autowired
	PeliculasServiceImpl peliculasServiceImpl;

	@GetMapping("/peliculas")
	public List<Peliculas> listarEmpleados() {
		return peliculasServiceImpl.listarPeliculas();
	}

	@PostMapping("/peliculas")
	public Peliculas crearCaja(@RequestBody Peliculas pelicula) {

		return peliculasServiceImpl.crearPelicula(pelicula);

	}

	@GetMapping("/peliculas/{id}")
	public Peliculas leerCaja(@PathVariable(name = "id") Long id) {

		Peliculas pelicula = new Peliculas();

		pelicula = peliculasServiceImpl.leerPeliculaById(id);

		System.out.println("Empleado con ese dni es: " + pelicula);
		return pelicula;
	}

	@PutMapping("/peliculas/{id}")
	public Peliculas actualizarEmpleado(@PathVariable(name = "numReferencia") Long id, @RequestBody Peliculas pelicula) {

		Peliculas pelicula_seleccionado = new Peliculas();
		Peliculas pelicula_actualizado = new Peliculas();

		pelicula_seleccionado = peliculasServiceImpl.leerPeliculaById(id);

		pelicula_seleccionado.setNombre(pelicula.getNombre());
		pelicula_seleccionado.setCalificacionEdad(pelicula.getCalificacionEdad());
		pelicula_seleccionado.setPeliculas_id(pelicula.getPeliculas_id());

		pelicula_actualizado = peliculasServiceImpl.actualizarPelicula(pelicula_seleccionado);

		System.out.println("La pelicula seleccionada es es: " + pelicula_actualizado);

		return pelicula_actualizado;
	}

	@DeleteMapping("/peliculas/{id}")
	public void borrarEmpleado(@PathVariable(name = "id") Long id) {
		peliculasServiceImpl.borrarPeliculaById(id);
	}

}