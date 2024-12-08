/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.semana05.repository;

import com.example.semana05.model.Formulario;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Jeanc
 */
public interface FormularioRepository extends JpaRepository<Formulario, Long> {
}
