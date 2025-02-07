package com.salomaotech.projeto.models;

import com.salomaotech.projeto.controllers.ProdutoController;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.stereotype.Component;

@Component
public class ProdutoLinks {

    public Produto addLinks(Produto produto) {

        Link selfLink = WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(ProdutoController.class).getById(produto.getId())).withSelfRel();
        produto.add(selfLink);
        return produto;

    }
}
