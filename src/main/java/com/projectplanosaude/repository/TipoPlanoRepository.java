package com.projectplanosaude.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projectplanosaude.entity.TipoPlano;

@Repository
public interface TipoPlanoRepository extends JpaRepository<TipoPlano, Long>{

}
