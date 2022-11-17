package com.example.EJ25.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.EJ25.dto.Peliculas;

public interface IPeliculasDAO extends JpaRepository<Peliculas, Long> {

}