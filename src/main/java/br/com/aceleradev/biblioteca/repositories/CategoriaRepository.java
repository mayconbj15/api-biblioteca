package br.com.aceleradev.biblioteca.repositories;

import br.com.aceleradev.biblioteca.models.Categoria;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoriaRepository extends CrudRepository<Categoria, Long> {
    List<Categoria> findAll();
}
