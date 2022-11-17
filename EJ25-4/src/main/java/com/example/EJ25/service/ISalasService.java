package com.example.EJ25.service;

import java.util.List;

import com.example.EJ25.dto.Salas;

public interface ISalasService {

	// Metodos del CRUD

	public List<Salas> listarSalas(); // Listar All

	public Salas crearSalas(Salas sala); // CREATE

	public Salas leerSalasById(Long id); // READ

	public Salas actualizarSalas(Salas sala); // UPDATE

	public void borrarSalas(Long id);// DELETE

}