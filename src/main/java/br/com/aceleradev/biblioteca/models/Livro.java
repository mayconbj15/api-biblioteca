package br.com.aceleradev.biblioteca.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name = Livro.TABLE_NAME)
public class Livro {
    public static final String TABLE_NAME = "livro";

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //tipo de geração do id
    private Long id;

    @Column(nullable = false)
    private String titulo;

    @OneToMany
    private List<Avaliacao> avaliacoes;

    @Column
    @ManyToMany
    private List<Categoria> categorias;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public List<Avaliacao> getAvaliacoes() {
        return avaliacoes;
    }

    public void setAvaliacoes(List<Avaliacao> avaliacoes) {
        this.avaliacoes = avaliacoes;
    }

    public List<Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(List<Categoria> categorias) {
        this.categorias = categorias;
    }
}
