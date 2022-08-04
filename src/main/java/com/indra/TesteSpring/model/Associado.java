package com.indra.TesteSpring.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data //@ ToString, @EqualsAndHashCode, @ Getter e @ Setter
@NoArgsConstructor //Construtor vazio
@AllArgsConstructor //Construtor com todos atributos
@Builder
@Entity
@Table
public class Associado  {
    @Id
    @Column
    private Integer idAssociado;

    @Column
    private Integer numeroTelefone;

    @Column
    private String nome;

    @Column
    private String sobreNome;

    @Column
    private String genero;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn
    private CargoAssociado idCargo;

    /*
    @Column
    @ManyToOne
    private CargoAssociado cargoAssociado;
    */
}
