package com.indra.TesteSpring.dto;

import com.indra.TesteSpring.model.CargoAssociado;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class AssociadoSemGeneroDto {
    private Integer numeroTelefone;
    private String nome;
    private String sobreNome;
    private CargoAssociado idCargo;
}
