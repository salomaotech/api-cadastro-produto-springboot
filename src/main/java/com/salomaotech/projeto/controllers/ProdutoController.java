package com.salomaotech.projeto.controllers;

import com.salomaotech.projeto.models.Produto;
import com.salomaotech.projeto.services.ProdutoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService service;

    @PostMapping
    public ResponseEntity<Produto> add(@RequestBody Produto produto) {

        return service.add(produto);

    }

    @GetMapping
    public ResponseEntity<List<Produto>> all() {

        return service.all();

    }

    @GetMapping("/{id}")
    public ResponseEntity<Produto> getById(@PathVariable long id) {

        return service.getById(id);

    }

    @PutMapping("/{id}")
    public ResponseEntity<String> update(@PathVariable long id, @RequestBody Produto produto) {

        return service.update(id, produto);

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable long id) {

        return service.delete(id);

    }

}
