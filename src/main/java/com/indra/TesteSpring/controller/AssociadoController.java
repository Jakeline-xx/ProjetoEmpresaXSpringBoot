package com.indra.TesteSpring.controller;

import com.indra.TesteSpring.model.Associado;
import com.indra.TesteSpring.model.enums.Genero;
import com.indra.TesteSpring.repository.AssociadoRepository;
import com.indra.TesteSpring.service.AssociadoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class AssociadoController {
    private final AssociadoService service;


    @PostMapping(path = "/teste")
    public ResponseEntity<Associado> adicionarAssociadoTeste(   @RequestParam Integer numeroTelefone,
                                                                @RequestParam String nome,
                                                                @RequestParam String sobreNome,
                                                                @RequestParam Genero genero){
        return ResponseEntity.ok(service.adicionarAssociadoTeste(numeroTelefone, nome, sobreNome,genero));
    }
}
