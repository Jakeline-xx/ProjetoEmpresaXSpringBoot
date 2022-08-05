package com.indra.TesteSpring.service;

import com.indra.TesteSpring.model.Associado;
import com.indra.TesteSpring.model.enums.Genero;
import com.indra.TesteSpring.repository.AssociadoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AssociadoService{
    private final AssociadoRepository repository;

    public Optional<Associado> findById(Integer idAssociado){
        return repository.findById(idAssociado);
    }

    public Associado adicionarAssociadoTeste(Integer numeroTelefone, String nome, String sobreNome, Genero genero){
        return repository.save(Associado.builder()
                .numeroTelefone(numeroTelefone)
                .nome(nome)
                .sobreNome(sobreNome)
                .genero(genero.getProperty())
                .idCargo(null)
                .build());
    }

//    public void atualizarAssociadoPorId(Integer idAssociado, AssociadoDto associadoDto) {
//        Associado associado = repository.getReferenceById(idAssociado);
//        associado.setIdAssociado(associadoDto.getIdAssociado());
//        associado.setNumeroTelefone(associadoDto.getNumeroTelefone());
//        associado.setNome(associadoDto.getNome());
//        associado.setSobreNome(associadoDto.getSobreNome());
//        associado.setGenero(associadoDto.getGenero());
//        associado.setIdCargo(associadoDto.getIdCargo());
//        repository.save(associado);
//    }

//    public void deletarAssociadoPorId(Integer idAssociado) {
//        Associado associado = repository.getReferenceById(idAssociado);
//        repository.delete(associado);
//    }
//
//    public Optional<Associado> obterAssociadoPorId(Integer idAssociado) throws AssociadoNotFoundException {
////        return repository.findById(idAssociado);
//        return repository
//                .findById(idAssociado);
////                .orElseThrow(() -> new AssociadoNotFoundException("Não foi encontrado"));
//    }
}
