package com.indra.TesteSpring.repository;

import com.indra.TesteSpring.model.CargoAssociado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CargoAssociadoRepository extends JpaRepository<CargoAssociado, Integer> {
}