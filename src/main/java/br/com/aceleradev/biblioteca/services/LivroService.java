package br.com.aceleradev.biblioteca.services;

import br.com.aceleradev.biblioteca.models.Livro;
import org.springframework.stereotype.Service;

import java.util.List;

public interface LivroService {
    Livro save(Livro livro);

    List<Livro> findAll();

    Livro findById(Long id);

    void delete(Livro livro);
}
