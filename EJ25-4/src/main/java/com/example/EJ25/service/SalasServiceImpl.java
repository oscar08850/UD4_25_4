package com.example.EJ25.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EJ25.dao.ISalasDAO;
import com.example.EJ25.dto.Salas;

@Service
public class SalasServiceImpl implements ISalasService {

	@Autowired
	ISalasDAO iSalasDAO;

	@Override
	public List<Salas> listarSalas() {
		return iSalasDAO.findAll();
	}

	@Override
	public Salas crearSalas(Salas sala) {
		return iSalasDAO.save(sala);
	}

	@Override
	public Salas leerSalasById(Long id) {
		return iSalasDAO.findById(id).get();
	}

	@Override
	public Salas actualizarSalas(Salas sala) {
		return iSalasDAO.save(sala);
	}

	@Override
	public void borrarSalas(Long id) {
		iSalasDAO.deleteById(id);
	}

}