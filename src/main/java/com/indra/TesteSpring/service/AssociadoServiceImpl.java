package com.indra.TesteSpring.service;

import com.indra.TesteSpring.dto.AssociadoDto;
import com.indra.TesteSpring.model.Associado;
import com.indra.TesteSpring.repository.AssociadoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AssociadoServiceImpl implements AssociadoService {
    private final AssociadoRepository repository;

    public void adicionarAssociado(AssociadoDto associadoDto) {
        Associado associado = new Associado(associadoDto.getIdAssociado(), associadoDto.getNumeroTelefone(),
                                            associadoDto.getNome(), associadoDto.getSobreNome(),
                                            associadoDto.getGenero(), associadoDto.getIdCargo());
        repository.save(associado);
    }

    public void atualizarAssociadoPorId(Integer idAssociado, AssociadoDto associadoDto) {
        Associado associado = repository.getReferenceById(idAssociado);
        associado.setIdAssociado(associadoDto.getIdAssociado());
        associado.setNumeroTelefone(associadoDto.getNumeroTelefone());
        associado.setNome(associadoDto.getNome());
        associado.setSobreNome(associadoDto.getSobreNome());
        associado.setGenero(associadoDto.getGenero());
        associado.setIdCargo(associadoDto.getIdCargo());
    }

    public void deletarAssociadoPorId(Integer idAssociado) {
        Associado associado = repository.getReferenceById(idAssociado);
        repository.delete(associado);
    }
}
