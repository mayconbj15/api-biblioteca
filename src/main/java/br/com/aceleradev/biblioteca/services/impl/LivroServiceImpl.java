package br.com.aceleradev.biblioteca.services.impl;

import br.com.aceleradev.biblioteca.models.Livro;
import br.com.aceleradev.biblioteca.repositories.LivroRepository;
import br.com.aceleradev.biblioteca.services.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivroServiceImpl implements LivroService {

    private final LivroRepository livroRepository;

    public LivroServiceImpl(LivroRepository livroRepository){
        this.livroRepository = livroRepository;
    }

    @Override
    public Livro save(Livro livro){
        return livroRepository.save(livro);
    }

    @Override
    public List<Livro> findAll(){
        return livroRepository.findAll();

    }

    @Override
    public Livro findById(Long id){
        return livroRepository.findById(id).orElse(new Livro());
    }

    @Override
    public void delete(Livro livro){
        livroRepository.delete(livro);
    }
}
