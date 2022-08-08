package com.indra.TesteSpring.service;

import com.indra.TesteSpring.dto.AssociadoDto;
import com.indra.TesteSpring.dto.AssociadoSemGeneroDto;
import com.indra.TesteSpring.model.Associado;
import com.indra.TesteSpring.model.enums.Genero;
import com.indra.TesteSpring.repository.AssociadoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AssociadoService{
    private final AssociadoRepository repository;

    public Associado findById(Integer idAssociado){
        return repository.findById(idAssociado).orElseThrow(null);
    }

    public AssociadoDto salvarAssociado(AssociadoSemGeneroDto associadoSemGeneroDto, Genero genero){
        AssociadoDto associadoDto = AssociadoDto.builder()
                .numeroTelefone(associadoSemGeneroDto.getNumeroTelefone())
                .nome(associadoSemGeneroDto.getNome())
                .sobreNome(associadoSemGeneroDto.getSobreNome())
                .genero(genero.getProperty())
                .idCargo(associadoSemGeneroDto.getIdCargo())
                .build();
        Associado entidade = transformarEmEntidade(associadoDto);
        Associado entidadeFinal = repository.save(entidade);
        return transformarEmDto(entidadeFinal);
    }

    public AssociadoDto atualizarAssociado(Associado associado, Genero genero) {
        Associado associadoEscolhido = repository.findById(associado.getIdAssociado()).orElseThrow(null);
        associadoEscolhido.setIdAssociado(associado.getIdAssociado());
        associadoEscolhido.setNumeroTelefone(associado.getNumeroTelefone());
        associadoEscolhido.setNome(associado.getNome());
        associadoEscolhido.setSobreNome(associado.getSobreNome());
        associadoEscolhido.setGenero(genero.getProperty());
        associadoEscolhido.setIdCargo(associado.getIdCargo());
        repository.save(associadoEscolhido);
        return transformarEmDto(associadoEscolhido);
    }

    public String deletarAssociadoPorId(Integer idAssociado) {
        repository.deleteById(idAssociado);
        return "Associado removido: " + idAssociado;
    }

    private Associado transformarEmEntidade(final AssociadoDto dto) {
        return
                Associado.builder()
                        .numeroTelefone(dto.getNumeroTelefone())
                        .nome(dto.getNome())
                        .sobreNome(dto.getSobreNome())
                        .genero(dto.getGenero())
                        .idCargo(dto.getIdCargo())
                        .build();
    }

    private AssociadoDto transformarEmDto(final Associado entity) {
        return
                AssociadoDto.builder()
                        .numeroTelefone(entity.getNumeroTelefone())
                        .nome(entity.getNome())
                        .sobreNome(entity.getSobreNome())
                        .genero(entity.getGenero())
                        .idCargo(entity.getIdCargo())
                        .build();
    }
}
