package com.salomaotech.projeto.services;

import com.salomaotech.projeto.entities.ProdutoRepositoy;
import com.salomaotech.projeto.models.Produto;
import com.salomaotech.projeto.models.ProdutoLinks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepositoy repository;

    @Autowired
    private ProdutoLinks produtoLinks;

    public ResponseEntity<Produto> add(Produto produto) {

        Produto p = repository.save(produto);
        Produto produtoComLinks = produtoLinks.addLinks(p);
        return ResponseEntity.status(HttpStatus.CREATED).body(produtoComLinks);

    }

    public ResponseEntity<List<Produto>> all() {

        List<Produto> produtos = repository.findAll();
        produtos.forEach(produtoLinks::addLinks);
        return ResponseEntity.status(HttpStatus.OK).body(produtos);

    }

    public ResponseEntity<Produto> getById(long id) {

        Optional<Produto> p = repository.findById(id);

        if (p.isEmpty()) {

            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);

        } else {

            Produto produtoComLinks = produtoLinks.addLinks(p.get());
            return ResponseEntity.status(HttpStatus.OK).body(produtoComLinks);

        }

    }

    public ResponseEntity<String> update(long id, Produto produto) {

        Optional<Produto> p = repository.findById(id);

        if (p.isEmpty()) {

            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Não encontrado!");

        } else {

            produto.setId(p.get().getId());
            repository.save(produto);
            return ResponseEntity.status(HttpStatus.OK).body("Atualizado!");

        }

    }

    public ResponseEntity<String> delete(long id) {

        repository.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).body("Removido");

    }

}
