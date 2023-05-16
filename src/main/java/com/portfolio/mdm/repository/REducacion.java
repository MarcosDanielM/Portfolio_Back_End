package com.portfolio.mdm.repository;

import com.portfolio.mdm.entity.Educacion;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;


public interface REducacion extends JpaRepository <Educacion, Long>{
        public Optional<Educacion> findByInstitucion(String institucion);
        public boolean existsByInstitucion(String institucion);
}
