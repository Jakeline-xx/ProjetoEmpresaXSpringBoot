package com.indra.TesteSpring.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class CargoAssociadoDto {
    private Integer id;
    private String nome;
    private Integer salario;
}
