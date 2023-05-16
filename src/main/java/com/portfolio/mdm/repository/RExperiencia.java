package com.portfolio.mdm.repository;

import com.portfolio.mdm.entity.Experiencia;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

 
public interface RExperiencia extends JpaRepository <Experiencia, Long>{
        public Optional<Experiencia> findByEmpresa (String empresa);
        public boolean existsByEmpresa(String empresa);

        public boolean existsById(int id);

        public Optional<Experiencia> findById(int id);
}
