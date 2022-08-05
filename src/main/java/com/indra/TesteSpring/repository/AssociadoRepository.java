package com.indra.TesteSpring.repository;

import com.indra.TesteSpring.model.Associado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssociadoRepository extends CrudRepository<Associado, Integer> {
}