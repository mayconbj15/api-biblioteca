package br.com.aceleradev.biblioteca.controllers;

import br.com.aceleradev.biblioteca.models.Livro;
import br.com.aceleradev.biblioteca.services.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livros")
public class LivroController {

    // Injeção de dependencia
    private LivroService livroService;

    @Autowired
    public LivroController(LivroService livroService){
        this.livroService = livroService;
    }

    @PostMapping
    public Livro save(@RequestBody Livro livro){
        return this.livroService.save(livro);
    }

    @GetMapping
    public List<Livro> findAll(){
        return this.livroService.findAll();
    }

    @GetMapping("/{id}")
    public Livro findById(@PathVariable Long id){
        return this.livroService.findById(id);
    }

    @DeleteMapping
    public void delete(Livro livro){
        this.livroService.delete(livro);
    }

}
