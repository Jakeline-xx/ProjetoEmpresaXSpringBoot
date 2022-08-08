package com.indra.TesteSpring.controller;

import com.indra.TesteSpring.dto.AssociadoDto;
import com.indra.TesteSpring.dto.AssociadoSemGeneroDto;
import com.indra.TesteSpring.model.Associado;
import com.indra.TesteSpring.model.CargoAssociado;
import com.indra.TesteSpring.model.enums.Genero;
import com.indra.TesteSpring.repository.AssociadoRepository;
import com.indra.TesteSpring.service.AssociadoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class AssociadoController {
    private final AssociadoService service;
    @GetMapping("/{idAssociado}")
    public ResponseEntity<Associado> obterPorId(@PathVariable Integer idAssociado){
        return ResponseEntity.ok().body(service.findById(idAssociado));
    }

    @PostMapping("/adicionarAssociado")
    public ResponseEntity<AssociadoDto> adicionarAssociado(@RequestBody AssociadoSemGeneroDto associadoSemGeneroDto,
                                                           @RequestParam Genero genero){
        return ResponseEntity.status(HttpStatus.CREATED).body(service.salvarAssociado(associadoSemGeneroDto, genero));
    }

    @PutMapping("/atualizarAssociado")
    public ResponseEntity<AssociadoDto> atualizarAssociado(@RequestBody Associado associado,
                                                           @RequestParam Genero genero){
        return ResponseEntity.status(HttpStatus.CREATED).body(service.atualizarAssociado(associado, genero));
    }

    @DeleteMapping("deletar/{idAssociado}")
    public ResponseEntity<String> deletarAssociadoPorId(@PathVariable Integer idAssociado){
        return ResponseEntity.ok(service.deletarAssociadoPorId(idAssociado));
    }
}
