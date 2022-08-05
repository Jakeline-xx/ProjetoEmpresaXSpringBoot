package com.indra.TesteSpring.model;

import com.indra.TesteSpring.model.enums.Genero;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idAssociado;

    @Column
    private Integer numeroTelefone;

    @Column
    private String nome;

    @Column
    private String sobreNome;

    @Column
    private String genero;

    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "id_cargo")
    private CargoAssociado idCargo;

    /*
    @Column
    @ManyToOne
    private CargoAssociado cargoAssociado;
    */
}
