package com.sofftek.consultamedica.repository;

import com.sofftek.consultamedica.modelo.Medico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMedicoRepo extends JpaRepository<Medico, Integer> {
    String
}

