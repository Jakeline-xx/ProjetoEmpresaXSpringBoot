package com.indra.TesteSpring.model;

import lombok.Data;

import java.util.UUID;
@Data
public abstract class Entidade {
    private UUID Id;
    protected Entidade(){
        this.setId(UUID.randomUUID());
    }
}
