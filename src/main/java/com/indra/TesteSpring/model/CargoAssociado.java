package com.indra.TesteSpring.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table
public class CargoAssociado {
    @Id
    @Column
    private Integer id;

    @Column
    private String nome;

    @Column
    private Integer salario;

    /*
    @Column
    @OneToMany
    private List<Associado> ListaAssociado;
     */
}
