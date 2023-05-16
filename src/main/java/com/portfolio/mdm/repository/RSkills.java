package com.portfolio.mdm.repository;


import com.portfolio.mdm.entity.Skills;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RSkills extends JpaRepository <Skills, Long>{
    public Optional<Skills> findByLenguaje(String lenguaje);
        public boolean existsByLenguaje(String lenguaje);
}
