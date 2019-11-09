package br.com.aceleradev.biblioteca.controllers;

import br.com.aceleradev.biblioteca.models.Categoria;
import br.com.aceleradev.biblioteca.services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {

    private CategoriaService categoriaService;

    @Autowired
    public CategoriaController(CategoriaService categoriaService){
        this.categoriaService = categoriaService;
    }

    @PostMapping
    public Categoria save(@RequestBody Categoria categoria){
        return categoriaService.save(categoria);
    }

    @GetMapping
    public List<Categoria> findAll(){
        return this.categoriaService.findAll();
    }

    @GetMapping("/{id}")
    public Categoria findById(Long id){
        return this.categoriaService.findById(id);
    }

    @DeleteMapping
    public void delete(Categoria categoria){
        this.categoriaService.delete(categoria);
    }
}
