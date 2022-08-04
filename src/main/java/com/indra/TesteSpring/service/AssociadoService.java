package com.indra.TesteSpring.service;

import com.indra.TesteSpring.dto.AssociadoDto;
import com.indra.TesteSpring.model.Associado;

import java.util.List;

public interface AssociadoService {

    void adicionarAssociado(AssociadoDto associadoDto);

    void atualizarAssociadoPorId(Integer idAssociado, AssociadoDto associadoDto);

    void deletarAssociadoPorId(Integer idAssociado);

}
