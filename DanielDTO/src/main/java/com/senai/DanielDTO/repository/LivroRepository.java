package com.senai.DanielDTO.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senai.DanielDTO.entities.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long> {

}