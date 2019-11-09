package br.com.aceleradev.biblioteca.models;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name = Categoria.TABLE_NAME)
public class Categoria {
    public static final String TABLE_NAME = "categoria";

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @NotBlank
    private String nome;

    @ManyToMany
    private List<Livro> livros;


}
