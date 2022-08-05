package com.indra.TesteSpring.model.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Genero {
    MASCULINO("Masculino"),
    FEMININO("Feminino");

    private final String property;
}
