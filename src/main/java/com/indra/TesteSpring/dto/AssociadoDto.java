package com.indra.TesteSpring.dto;

import com.indra.TesteSpring.model.CargoAssociado;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class AssociadoDto {
    private Integer idAssociado;
    private Integer numeroTelefone;
    private String nome;
    private String sobreNome;
    private String genero;
    private CargoAssociado idCargo;
}
