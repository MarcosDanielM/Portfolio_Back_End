package com.portfolio.mdm.repository;

import com.portfolio.mdm.entity.Proyectos;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RProyectos extends JpaRepository <Proyectos, Long>{
     public Optional<Proyectos> findByTitulo(String titulo);
        public boolean existsByTitulo(String titulo);
}
