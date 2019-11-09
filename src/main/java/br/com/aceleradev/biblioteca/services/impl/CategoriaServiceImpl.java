package br.com.aceleradev.biblioteca.services.impl;

import br.com.aceleradev.biblioteca.models.Categoria;
import br.com.aceleradev.biblioteca.repositories.CategoriaRepository;
import br.com.aceleradev.biblioteca.services.CategoriaService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaServiceImpl implements CategoriaService {

    private CategoriaRepository categoriaRepository;

    public CategoriaServiceImpl(CategoriaRepository categoriaRepository){
        this.categoriaRepository = categoriaRepository;
    }

    @Override
    public List<Categoria> findAll(){
        return this.categoriaRepository.findAll();
    }

    @Override
    public Categoria findById(Long id){
        return categoriaRepository.findById(id).get();
    }

    @Override
    public Categoria save(Categoria categoria){
        return categoriaRepository.save(categoria);
    }

    @Override
    public void delete(Categoria categoria){
        categoriaRepository.delete(categoria);
    }
}
