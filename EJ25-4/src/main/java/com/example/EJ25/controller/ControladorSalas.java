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

import com.example.EJ25.dto.Salas;
import com.example.EJ25.service.SalasServiceImpl;

@RestController
@RequestMapping("/api")
public class ControladorSalas {

	@Autowired
	SalasServiceImpl salasServiceImpl;

	@GetMapping("/salas")
	public List<Salas> listarAlmacenes() {
		return salasServiceImpl.listarSalas();
	}

	@PostMapping("/salas")
	public Salas crearAlmacenes(@RequestBody Salas sala) {

		return salasServiceImpl.crearSalas(sala);

	}

	@GetMapping("/salas/{id}")
	public Salas leerAlmacenes(@PathVariable(name = "id") Long id) {

		Salas sala = new Salas();
		
		sala = salasServiceImpl.leerSalasById(id);

		System.out.println("Almacen segun ID: " + sala);

		return sala;
	}

	@PutMapping("/salas/{id}")
	public Salas actualizarAlmacenes(@PathVariable(name = "id") Long id,
			@RequestBody Salas sala) {

		Salas sala_seleccionado = new Salas();
		Salas sala_actualizado = new Salas();

		sala_seleccionado = salasServiceImpl.leerSalasById(id);

		sala_seleccionado.setNombre(sala.getNombre());
		sala_seleccionado.setPelicula_id(sala.getPelicula_id());

		sala_actualizado = salasServiceImpl.actualizarSalas(sala_seleccionado);

		System.out.println("La pelicula actualizada es: " + sala_actualizado);

		return sala_actualizado;
	}

	@DeleteMapping("/salas/{id}")
	public void borrarAlmacen(@PathVariable(name = "id") Long id) {
		salasServiceImpl.borrarSalas(id);
	}

}