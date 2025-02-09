package com.example.thymeleaf.thymeleaf_wiky.repository;

import com.example.thymeleaf.thymeleaf_wiky.model.FormularioContacto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormularioContactoRepository extends JpaRepository<FormularioContacto, Long> {
}